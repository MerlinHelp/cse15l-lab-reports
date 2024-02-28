Name: **Richard Vo** 
PID: **A17907078**

# Lab Report Week 7

## Step 4: Log into ieng6
![alt text](image-2.png)
```
Keys pressed: `ssh<Spacebar>rivo@ieng6-203.ucsd.edu<Enter>yes<Enter>`, I had to ssh and then press yes 
in order to confirm I wanted to login
```
## Step 5: Clone your fork of the repository from your Github account (using the SSH URL)
![alt text](image-3.png)
```
Keys pressed: `git clone<Spacebar><Shift><Insert><Enter>` I had to shift insert to fast paste the link of the repo
Then, `cd<Spacebar>la<Tab><Enter>` to autofill and enter lab7
```
## Step 6: Run the tests, demonstrating that they fail
![alt text](image-4.png)
```
Keys pressed: `<Shift><Insert><Enter>` because I was pasting `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java`. Then `<Shift><Insert><Space>List<Tab>T<Tab>` because I was pasting `  ` and then adding ListExamplesTest to run the tests
```
## Step 7: Edit the code file to fix the failing test
![alt text](image-5.png)
```
Keys pressed: `/l1<Enter><n><n><n>` in order to get to the needed occurence of l1.
Then `<e><r>2` in order to go to the 1 of l1 and then replace it with 2.
Then `<e><e><r>1` in order to go to the 2 in l2 and replace it with 1.
Finally `<Esc>:wq!<Enter>` to go into normal mode write and quit
```
## Step 8:Run the tests, demonstrating that they now succeed
![alt text](image-6.png)
```
Keys pressed: `<Up><Up><Enter>` because I was going back up to `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java`. Then `<Up><Up><Enter>` because I was going back up to `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTest`
```
## Step 9: Commit and push the resulting change to your Github account (you can pick any commit message!)
![alt text](image-7.png)
```
Keys pressed: `git add .<Enter>`, `git commit -m "lab"<Enter>` to set a commit message
Then `git push<Enter>` to push but I kept getting errors because password auth got removed
I tried token auth in GitHub developer settings but then i got a url error maybe because I was in ssh? idk
```
