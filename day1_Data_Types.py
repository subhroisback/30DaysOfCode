# Task
# Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:
#
# Declare  variables: one of type int, one of type double, and one of type String.
# Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
# Use the  operator to perform the following operations:
# Print the sum of  plus your int variable on a new line.
# Print the sum of  plus your double variable to a scale of one decimal place on a new line.
# Concatenate  with the string you read as input and print the result on a new line.

i = 4
d = 4.0
s = 'HackerRank '
i1=int(input())
d1=float(input())
s1=input()
print(i+i1)
print(round(d+d1,1))
print(str(s+s1))