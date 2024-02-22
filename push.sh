#!/bin/bash
read -p 'Subject ID (0-8): ' subjectID

subjectName=("Mathematics" \
    "Database-Systems" \
    "Operating-Systems" \
    "Digital-Logic" \
    "Algorithms" \
    "Computer-Networks" \
    "Data-Structures" \
    "TIL-Coding" \
    "Aptitude")

targetSub=${subjectName[$((subjectID))]}

git add README.md ./topics/$targetSub.md ./assets/images/$targetSub/
git commit -m "$targetSub"
git push origin main
