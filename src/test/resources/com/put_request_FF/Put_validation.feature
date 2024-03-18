Feature: Post request testing

#Scenario: 1 Post request validation
#Given Create user with data
#Then Validate user created 
#Then Validate user ID have noo null value 

#Scenario: 3 Post request validation
#Given Create user "Anil" with data from file
#Given Create user "Prashant" with data from file
#Then Validate user created 
#Then validate user ID have noo null value

Scenario: 4 Post request validation
Given Create user "Anil" with data from file
Given Create user "Rusana" with data from file
Then Validate user created 
Then validate user ID have noo null value