package stepDefinitions;
import com.app.model.request.AuthorizedRequest;
import com.app.model.response.BooksResponse;
import com.app.model.response.TokenResponse;
import com.app.model.response.UserAccountResponse;
import com.app.services.EndPoints;
import com.app.utils.Constant;
import com.app.utils.RequestResponseConfiguration;
import com.app.validation.Account_Validation;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AccountStepDefinition extends Constant {
	private Response response;
	private TokenResponse addTokenResponse;
	private BooksResponse booksResponse;
	private AuthorizedRequest authorizedRequestModal;
	private Account_Validation accountValidation = new Account_Validation();

	@Given("authorized user generate the token")
	public void authorizedUserGenerateToken() throws Exception {
		authorizedRequestModal = new AuthorizedRequest(Constant.userName, Constant.password);

		RequestSpecification requestSpec = new RequestResponseConfiguration().getBaseUrl();
		requestSpec.header("Content-Type", "application/json");
		requestSpec.body(authorizedRequestModal);
		response = new RequestResponseConfiguration().getResponse(requestSpec, EndPoints.authorizedURIGeneratedToken,
				"POST");
		addTokenResponse = response.getBody().as(TokenResponse.class);
		accountValidation.verifyStatusCode(response.getStatusCode());

	}

	@Given("account user exist")
	public void iAmAnAuthorizedUser() throws Exception {
		authorizedRequestModal = new AuthorizedRequest(Constant.userName, Constant.password);

		RequestSpecification requestSpec = new RequestResponseConfiguration().getBaseUrl();
		requestSpec.header("Content-Type", "application/json");
		requestSpec.body(authorizedRequestModal);
		response = new RequestResponseConfiguration().getResponse(requestSpec, EndPoints.accountUser, "POST");
		response.body().as(UserAccountResponse.class);
		accountValidation.verifyAccountUserCode();
	}

	@Given("I am an authorized user")
	public void accountUserExist() throws Exception {
		authorizedRequestModal = new AuthorizedRequest(Constant.userName, Constant.password);

		RequestSpecification requestSpec = new RequestResponseConfiguration().getBaseUrl();
		requestSpec.header("Content-Type", "application/json");
		requestSpec.body(authorizedRequestModal);
		response = new RequestResponseConfiguration().getResponse(requestSpec, EndPoints.authorizedURI, "POST");
		accountValidation.verifyStatusCode(response.getStatusCode());
	}

	@Given("get the book list")
	public void getBookList() throws Exception {
		RequestSpecification requestSpec = new RequestResponseConfiguration().getBaseUrl();
		requestSpec.header("Content-Type", "application/json");
		response = new RequestResponseConfiguration().getResponse(requestSpec, EndPoints.books, "GET");
		accountValidation.verifyStatusCode(response.getStatusCode());
		booksResponse =response.body().as(BooksResponse.class);
	}

}