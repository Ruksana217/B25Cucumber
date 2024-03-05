Feature: validate for bookstore data using datatable

Scenario: Validata Data in json response with data table
Given Hit the bookstore api
Then Validate as status code
Then Validate data from response
   |Git Pocket Guide        | books[0].title     | 
   | A Working Introduction | books[0].subTitle  | 
   |Richard E. Silverman    | books[0].author    | 
   |No Starch Press         | books[7].publisher | 