#!/bin/bash
while true;do
    read -p "entrez 'yes' ou 'no' stp! " result
    if [ "$result" == "yes" -o "$result" == "no" ];then
	echo "ok merci vous avez entrez " $result"."
	break
    else
	echo "invalid"
    fi
done
exit 0


