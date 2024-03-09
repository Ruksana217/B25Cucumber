Feature: Validation for bookstore data

Scenario: 1test Book Tittle is present in response
Given Hit the bookstore api
Then Validate as status code
Then Validate Git Pocket guide tittle present
Then validate Learning JavaScript Design Patterns tittle present



Scenario: 2 Test Book Tittle is present in respons
Given Hit the bookstore api
Then Validate as status code
Then validate "Git Pocket Guide" at jsonpath "books[0].title" title present
Then validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present

Scenario: 3 Numbers is present respons
Given Hit the bookstore api
Then Validate as status code
Then validate "234" at jsonpath "books[0].pages" present
Then validate "254" at jsonpath "books[1].pages" present

Scenario: 4 Test all Book data is present is respons
Given Hit the bookstore api
Then Validate as status code
Then validate "Git Pocket Guide" at jsonpath "books[0].title" present
Then validate "A Working Introduction" at jsonpath "books[0].subTitle" present
Then validate "Richard E. Silverman" at jsonpath "books[0].author" present
Then validate "O'ReillyMedia" at jsonpath "books[0].publisher" present