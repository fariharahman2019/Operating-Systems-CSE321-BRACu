#!/bin/bash
echo "enter a number:"
read num 
if [ $(($num%3)) -eq 0 ] && [ $(($num%2)) -eq 0 ]
 then echo "Hello"
 elif [ $(($num%3)) -eq 0 ] || [ $(($num%2)) -eq 0 ]
 then echo "Nihao"
 else
 echo "Hola"
fi