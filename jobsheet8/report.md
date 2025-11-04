## Question 1

1. If in for loop, the initialization i = 1 is changed to i = 0, what is the result? How can It
be like that?

*The star that is displayed is going to be 6, because the loop start counting from 0 *

2. If in for loop, condition i <= N is changed to i > N, what is the result? How can It be
like that?

*The program will not run because the N is larger than i*

3. If in for loop, the condition for step i++ is changed to i-- what is the result? How can
It be like that?

*The program will run endlessly because everytime the i is decreased by 1 and it is always be less than N*

## Question 2

1. Pay attention to outer loop. If in for syntax, the initialization iOuter = 1 is changed to
iOuter = 0, what is the result? How can it be like that?

*There will be 6 column of asterisk, because the loop starts counting from 0*

2. Return the program to normal with initialization iOuter = 1. Then pay attention to the
inner loop. If in for syntax, the initialization i = 1 is changed to i = 0, what is the result?
How can it be like that?

*There will be 6 rows of asterisk, because the loop starts counting from 0*

3. What is the difference between outer loop and inner loop?

*The outer loop is responsible for the column of asterisk, meanwhile the inner loop is responsible for printing the asterisk itself.*

4. Why is it necessary to add the syntax System.out.println(); under inner loop? What
will happen if the syntax is omitted?

*To print the outer loop, if its not added the other column of asterisk will not appear*

## Question 3

1. Look at the results, does the output produced with a value of N = 5 match the following
display?

*No it does not*

2. If not, which parts should be improved or added? Describe any parts that need to be
improved or added!

*we need to add System.out.println next to i++ to print the outer loop*

## Question 4

1. Explain the program flow in Experiment 4!

*First a random number is generated from 1 to 10, the inner do while loop checks if the number is correct. If its incorrect the program will loop again, if its correct the program will set the success to true and ask if the user want to play again, if they want to play again they can type Y or y to play*

2. What must be done to discontinue (not repeat) the game?

*Fill the request to play again anything beside y*

3. Modify the program above, so that it can display information about: input the guess
value entered by the user, whether it is smaller or greater than the answer (number)
randomly determined by the computer!

## Question 5

1. The first loop is used to print the city and day and the second loop is to input the data

