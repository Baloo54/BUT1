#!/bin/bash
if [ $# -eq 1 ];then
    if [ -d $1 ];then
	echo "repository existant"
	exit 0
    else
	echo "repository doesn't exist"
	exit 1
    fi
else
    echo "one argument please"
    exit 2
fi
	
