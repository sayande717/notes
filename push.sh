#!/bin/bash
read -p 'Subject ID (1-6): ' subjectID

subjectName=("Mathematics"\
    "Database Management"\
    "Operating Systems"\
    "Digital Logic"\
    "Algorithms"\
    "Computer Networks")

git add *
git commit -m "${subjectName[$subjectID-1]}"
git push origin main
