Feature: End to End Test for Book Store API
  
  Background: Verify Account is authorized
  Given I am an authorized user

  Scenario: Authorized user can Add and Remove a book.
  Given authorized user generate the token
  When account user exist
  And get the book list
  #When I remove a book from my reading list
  #Then The book is removed