#!/bin/bash
if [ $# -gt 2 ]; then
    echo pas plus de 2 arguments
    exit 2
elif [ $# -eq 2 ]; then
    result=$(find $2 -type f -name "*.$1" | wc -l)
else
    result=$(find -type f -name "*.$1" | wc -l)
fi     
if [ $result -eq 0 ]; then
    echo aucun fichier de ce type trouver
    exit 1
fi
echo $result
exit 0 
