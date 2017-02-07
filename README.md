# 4sem-FunctionalProgramming
This is the assignment Reverse Polish Notation Calculator.<br>
The purpose of this assignment was to create a Calculator that would take an input like 4 3 + and return 7.<br>
I have done this assignment using ArrayStack.<br>
I have done this assignment by reciving inputs from the console and splitting them by " ",  into two different stacks.<br>
The first stack is for the numbers and the other is for operators. By doing this the user can either write only numbers or operators.<br>
The way the program works is when i get in a input from the console i try to pahse it to an integer if it works i know its a number,
else it must be an operator. Then i will check if i have any operators, this is in a while loop and wil end if the number stack is less
then 2 else it will go into my switch and do the function. In the end it will print out all the result.<br>
The calculator can take either more numbers or operators. so it remember the last number or operator you have entered.
