#!/bin/bash
read -p 'Subject ID (1-7): ' subjectID

subjectName=("Discreet-Mathematics"\
    "Database-Management"\
    "Operating-Systems"\
    "Digital-Logic"\
    "Algorithms"\
    "Computer-Networks" \
    "Aptitude" \
    "TIL-Coding")

targetSub=${subjectName[$subjectID-1]}
git add README.md ./topics/$targetSub.md ./assets/images/$targetSub/
git commit -m "$targetSub"
git push origin main
