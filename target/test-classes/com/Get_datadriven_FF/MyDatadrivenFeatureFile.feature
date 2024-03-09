Feature: 1.validation for bookstore data using datatable

Scenario Outline: Validata Data in json response with data driven
Given Hit the bookstore api
Then Validate as status code
Then Validate data <ExpValue> from <jsonPath> response
Examples:
   |ExpValue                  | jsonPath             |
   |'Git Pocket Guide'        | 'books[0].title'     | 
   | 'A Working Introduction' | 'books[0].subTitle'  | 
   |'Richard E. Silverman'    | 'books[0].author'    | 
   |'No Starch Press'         | 'books[7].publisher' | 