#!/bin/bash
if [ $# -ne 2 ];then
    echo "2 arguments"
    exit 2
else if [ $1 = $2 ];then
	 echo "2 argument différents"
	 exit 3
     else
	 echo "oki"
	 exit 0
     fi
fi     
	 
    
