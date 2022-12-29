#!/bin/bash

read ID

valid_id_length="8"
ID_length=${#ID}
spring="1"
summmer="2"

declare -a array   
	for ((c=0; c<${#ID}; c++)); 
		do array[$c]="${ID:$c:1}"; 
	done
	
year="${array[0]}${array[1]}"
semester="${array[2]}" 
department="${array[3]}${array[4]}"

if [[  $semester -eq 1 ]] ; then
	semesterName="Spring" 
	elif [[ $semester -eq 2 ]] ; then 
		semesterName="Summer"
	else 
		semesterName="Fall"
	fi

if [ $ID_length = $valid_id_length ] ; then
	if [ ${array[2]} -lt 4 ] ; then 
		if [ ${array[3]} -eq 0 ] ; then 
			if [ ${array[4]} -eq 1 ]; then
				echo "The student is from the Dept. of CSE enrolled in $semesterName 20$year."
			else echo " The student is not from the Dept. of CSE." 
			fi
		fi	
	fi
else
	echo "Invalid BRACU ID."
fi
