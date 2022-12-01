Feature: Validating products Api

@smoke
Scenario: Getting all the products

Given user is calling product api
When user call the "ProductsApi" with "GET" http method
Then the API call is success with status code 200

@functional
Scenario Outline: Post a new product
Given user is add new product with "<title>" "<price>""<category>"
When user call the "ProductsApi" with "POST" http method
Then the API call is success with status code 200
And title of the product is "<title>"
Examples:
|title|price|category|
|Christmas Bells|20.0|electronic|
|Iphone|400.00|electronic|
|Gold necklace|9000.00|jewelery|
@regression
Scenario Outline: Get the product categories
Given user is calling product api
When user calling the categories with type jewelery
Then user gets all the categories available

@smoke
Scenario: Update a product 
Given user is calling product api 
And user update the product details with new data
When user call the "ProductsApi" with "PUT" http method

@smoke
Scenario: Delete a product
Given user is calling product api
When user call the "ProductsApi" with "DELETE" http method
Then the API call is success with status code 200
#And title of the product is "<title>"
