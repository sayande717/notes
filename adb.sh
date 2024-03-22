#!/bin/bash
read -p 'Subject ID (0-8): ' subjectID

subjectList=("Mathematics" \
    "Database-Systems" \
    "Operating-Systems" \
    "Digital-Logic" \
    "Algorithms" \
    "Computer-Networks" \
    "Data-Structures" \
    "Aptitude" \
    "Artificial-Intelligence")

subjectName=${subjectList[$((subjectID))]}
imgDIR="./assets/images/$subjectName/self"

adb pull /sdcard/Download/self $imgDIR/tmp
mv $imgDIR/tmp/* $imgDIR/
rm -r $imgDIR/tmp
