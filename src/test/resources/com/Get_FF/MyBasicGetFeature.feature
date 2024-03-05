Feature: Validation for bookstore data

Scenario: 1test Git Pocket Guide is presetn is response
Given Hit the bookstore api
Then Validate as status code
Then Validate Git Pocket guide tittle present
Then validate Learning JavaScript Design Patterns tittle present



Scenario: 2test Git Pocket Guide is presetn is respons
Given Hit the bookstore api
Then Validate as status code
Then validate "Git Pocket Guide" at jsonpath "books[0].title" title present
Then validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present

Scenario: 3 Numbers is present respons
Given Hit the bookstore api
Then Validate as status code
Then validate "234" at jsonpath "books[0].pages" present
Then validate "256" at jsonpath "books[1].pages" present