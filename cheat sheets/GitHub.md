# **GitHub** Cheat Sheet
## I. Steps to Contribute to a repository.
1. Fork the Repository to your own account. This creates a clone of the repository **in your own GitHub account**.
   ![Fork](res/00-GitHub-fork.png)

2. Get the HTTPS link for the forked repository, then clone it to your own system. <br>
    ```bash
    git clone <LINK-TO-REPOSITORY>
    ```
   ![Clone](res/01-GitHub-clone.png)
   **Note:** Once the project has been cloned, you can do everything else on your own system.

3. Check the `README.md` for the project. If it has a `CONTRIBUTING.md` guide, go through it.

4. Make the necessary changes to the files.

5. Stage your changes, then commit them. <br>
   ```bash
   git status # Check status
   git add . # Add your changes
   git commit -m 'MESSAGE' # Commit your changes with a message
   ```

6. You can't push your changes directly in the main branch of the repository, since it will lead to a lot of errors & conflicts. So, you need to create a new branch. Here's how you do it: <br>
   ```bash
   git branch -m <BRANCH-NAME> # Name can be anything as long as you can identify it.
   ```

7. Finally, push your changes to the branch you created. <br>
   ```bash
   git push -u origin changes # Assuming the branch name is 'changes'.
   ```

8. The final step is to submit a pull-request. You need to do this on the Github page.
   > A pull request is a way for you to tell the project maintainers that you have made some changes and would like them to review & integrate them in the main branch of the remote repository. <br>
   > Once you submit a pull request, you will have to check up with the maintainers from time to time, and make further changes if they need you to. <br>
   - First, create a new pull request. <br>
   ![PR Create](res/02-GitHub-PR.Create.png) <br>
   - Next, write a title & description of what changes you made. Check the `CONTRIBUTING.md` (if there is one) to see if there is a syntax that must be followed here. <br>
   ![PR Submit](res/03-Github-PR.Submit.png)

9. Now that your pull request is created, you will automatically be subscribed to notifications regarding to any activity. Once the commit is reviewed by the maintainers, they will merge your commit with the original project.
   ![PR Success](res/04-Github-PR.Success.png)

<hr>