#!/bin/bash
read -p 'Subject ID (1-7): ' subjectID

subjectName=("Mathematics"\
    "Database Management"\
    "Operating Systems"\
    "Digital Logic"\
    "Algorithms"\
    "Computer Networks" \
    "Aptitude")

git add README.md ./topics/${subjectName[$subjectID-1]}.md
git commit -m "${subjectName[$subjectID-1]}"
git push origin main
