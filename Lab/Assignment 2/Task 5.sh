#!/bin/bash
echo "simple calculator"
sum=0
echo "enter first number"
read n1
echo "enter second number"
read n2
echo 1. Addition
echo 2. Subtraction
echo 3. Multiplication
echo 4. Division
echo Enter your choice:
read choice
if [[ $choice -eq 1 ]]
then
 sum=$(( $n1 + $n2 ))
 echo "Addition is $sum"
elif [[ $choice -eq 2 ]]
then
 sum=$(( $n1 - $n2 ))
 echo "Subtraction is $sum"
elif [[ $choice -eq 3 ]]
then
 sum=$(( $n1 * $n2 ))
 echo "Multiplication is $sum"
elif [[ $choice -eq 4 ]]
then
 sum=$(( $n1 / $n2 ))
 echo "Division is $sum"

fi