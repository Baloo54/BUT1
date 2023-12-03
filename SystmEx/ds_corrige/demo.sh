#!/bin/bash
if [ $# -lt 3 ];then
    echo au min 3 args
    exit 3
elif [ $1 != 'somme' -a $1 != 'produit' ];then
    echo premier arg somme ou produit
    exit 2
elif [ $1 == 'somme' ]; then
    resultat=0
    shift
    for i in $*; do
	resultat=$((resultat+$i))
    done
else
    resultat=1
    shift
    for i in $*; do
	resultat=$((resultat*$i))
    done
fi
echo $resultat
exit 0 
