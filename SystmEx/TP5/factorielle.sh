#!/bin/bash
if [ $# -ne 1 ]; then
    echo 1 argument stp
    exit 1
elif [ $1 -gt -1 -a $1 -lt 21 ];then
    n=$1
    resultat=1
    while [ $n -gt 0 ];
    do
	resultat=$((resultat*n))
        n=$((n-1))
    done
    echo $resultat
    exit 0
else
    echo un argument entre 1 et 20
    exit 2
fi 
