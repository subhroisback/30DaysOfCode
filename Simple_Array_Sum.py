# Given an array of N integers, can you find the sum of its elements?
#
# Input Format
#
# The first line contains an integer, N , denoting the size of the array.
# The second line contains N space-separated integers representing the array's elements.
#
# Output Format
#
# Print the sum of the array's elements as a single integer.
#
# Sample Input
#
# 6
# 1 2 3 4 10 11
# Sample Output
#
# 31

# N = int(input())
# a = []
# while len(a) < N:
#     k = int(input())
#     a.append(k)
#     Sum = sum(a)
# print(Sum)

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]
count = 0
Sum = 0
print(arr)
for a in arr:
    if count < n:
        Sum += a
    else:
        break
    count += 1
print(Sum)
