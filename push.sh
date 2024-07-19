#!/bin/bash
read -p 'Subject ID (0-9): ' subjectID

subjectList=("Mathematics" \
    "Database-Systems" \
    "Operating-Systems" \
    "Digital-Logic" \
    "Algorithms" \
    "Computer-Networks" \
    "Data-Structures-and-Algorithms" \
    "Aptitude" \
    "Artificial-Intelligence" \
    "Cloud-Computing" \
    "Computer-Architecture-and-Organisation")

subjectName=${subjectList[$((subjectID))]}

# Subject file name formatting
extension="md"
targetFile="${subjectName}.${extension}"
targetAssetsDir="${subjectName}"

# Commit message formatting
commitMessage="update: ${subjectName}"

# push to repository
git add README.md "./topics/${targetFile}" "./assets/images/${targetAssetsDir}"
git commit -m "${commitMessage}"
git push origin main


