# 2nd Task – Git
Author: Javier Plazas Moyano  
Date: 30/11/2025

This report contains a detailed explanation of all actions performed during the Git assignment. Each step includes a technical description of the objective, the commands used, and the visual evidence captured during the process. The goal is to demonstrate full understanding of repository creation, version control, branching, merging, tagging, conflict management and collaboration.

## a) Create a remote repository
In this step, a new empty repository was created on GitHub. This repository will act as the central location where all project history and updates will be stored.

![Remote repo](a.png)

## b) Clone the empty repository
Here, the remote repository was cloned to the local machine using the git clone command. Cloning initializes a local copy of the repository including its configuration and connection to the remote.

```
git clone <repository-URL>
```

![Clone](b.png)

## c) Create an empty local project
A local Java project was created using NetBeans. This includes setting up the folder structure and generating the initial Java class.

![Local project created – part 1](c.png)

![Local project created – part 2](c1.png)

## d) Commit the whole project
The initial project structure was added to the local Git repository using git add ., and a first commit was recorded.

```
git add .
git commit -m "Initial project files"
```

![Commit](d.png)

## e) Add simple code to the project
In this step, the Java class was edited to include basic functionality.

![Simple code](e.png)

## f) Commit changes
The modifications from step (e) were staged and committed. This records the evolution of the project.

![Commit](f.png)

## g) Add code: random values
The program was extended with logic to generate random values using Java's Random class. This prepares the project for later sorting operations.

![Random](g.png)

## h) Commit changes
These new modifications were committed to maintain a clear record of development.

![Commit](h.png)

## i) Add code: sorting
Sorting logic using a basic sorting algorithm was implemented in the Java program. This creates a structured output based on the previously generated random values.

![Sorting](i.png)

## j) Commit changes
Once again, the code changes were staged and committed to ensure stable version control.

![Commit](j.png)

## k) View history
The full commit history was inspected using git log --oneline, which displays a compact view of all commits in the repository.

```
git log --oneline
```

![Log](k.png)

## l) View code annotations
The git blame command was used to annotate each line of the file with the commit and author responsible for the change.

```
git blame <file>
```

![Blame](l.png)

## m) Checkout older revisions
Different previous versions of the code were checked out using the git checkout command. This allowed examining how the file looked in past commits.

```
git checkout <commit-id>
```

![Checkout – part 1](m.png)
![Checkout – part 2](m1.png)
![Checkout – part 3](m2.png)
![Checkout – part 4](m3.png)

## n) Make changes without committing
Changes were intentionally made to the project without committing them. This allows testing the behavior of Git when modifications remain in the working directory.

![Uncommitted](n.png)

## o) Revert changes
The git revert command was used to reverse past changes by creating a new commit that negates a previous one. Several screenshots show different stages of the process.

```
git revert <commit-id>
```

![Revert – part 1](o.png)
![Revert – part 2](o1.png)
![Revert – part 3](o2.png)
![Revert – part 4](o3.png)

## p) Push to remote
The modified local repository was pushed to the remote server using git push. This synchronizes all commits with GitHub.

```
git push
```

![Push](p.png)

## r) Delete local project
The local copy of the repository was removed to simulate a fresh clone operation.

![Deleted – part 1](r.png)
![Deleted – part 2](r1.png)

## s) Clone
The remote repository was cloned again to retrieve the latest version stored on GitHub.

![Clone again](s.png)

## t) Create tag and switch between tag and master
A tag named version0 was created to mark a stable version of the project. The tag and main branch were alternated using checkout commands.

```
git tag version0
git push --tags
git checkout version0
git checkout main
```

![Tag – part 1](t.png)
![Tag – part 2](t1.png)

## u) Create new branch
A new feature branch was created to develop improvements independently from the main branch.

```
git branch new-branch
```

![Branch – part 1](u.png)
![Branch – part 2](u1.png)

## w) Switch to branch
The new branch was activated using the checkout command, making it the workspace for further edits.

```
git checkout new-branch
```

![Switch – part 1](w.png)
![Switch – part 2](w1.png)

## x) Improve the code in the branch
The sorting method was improved inside the feature branch, following good development practices.

![Improved code](x.png)

## y) Merge branch into master
The feature branch was merged back into the main branch, integrating all new changes into the code.

```
git checkout main
git merge new_branch
```

![Merge – part 1](y.png)
![Merge – part 2](y1.png)

## z) Give access to a friend
Repository access was granted to another user on GitHub, enabling collaboration.

![Access – part 1](z.png)
![Access – part 2](z_1.png)

## z1) Create a conflict
A deliberate conflict was created by editing the same lines of code in two different commits or branches.

![Conflict](z1.png)

## z2) Resolve the conflict and push
The merge conflict was manually resolved in NetBeans. Afterwards, the fix was committed and pushed successfully.

![Resolved – part 1](z2.png)
![Resolved – part 2](z2_1.png)
![Resolved – part 3](z2_2.png)
![Resolved – part 4](z2_3.png)
![Resolved – part 5](z2_4.png)

## z3) Send repo URL and report to teacher
https://github.com/Xavier595/2ndTask-PlazasMoyanoJavier.git
