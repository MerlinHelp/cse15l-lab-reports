Name: **Richard Vo** 
PID: **A17907078**

# Lab Report Week 1

```
# Share an example of using the command with no arguments.
# Share an example of using the command with a path to a directory as an argument.
# Share an example of using the command with a path to a file as an argument.

# So that's 9 total examples (3 for each command). For each, include:

# A screenshot or Markdown code block showing the command and its output
* What the working directory was when the command was run
* A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
* Indicate whether the output is an error or not, and if it's an error, explain why it's an error.
```

## cd
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/b0450a64-40c7-4210-bd28-e72ef22818bf)
* Working dir: /home
* It returned me to the home directory (due to having no arguments), but I was already in the home directory so it seemed like nothing happened.
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/39abfc5b-1032-4f93-b09e-ec9fbab660a4)
* Working dir: /home
* Because lecture1 was a valid directory in the cwd, cd lecture1 changes my directory to **/home/lecture1**
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/bf9a24ea-6b69-47f9-8909-3a3b512da9d0)
* Working dir: /home/lecture1
* Because Hello.java is a file, it attempted to cd into Hello.java but realized it is not a directory and thus gave that output.
* It is an error because cd is not meant to be used with files and expected a dir.

## ls
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/eb488e0d-2a0c-457d-a959-77bed10468db)
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/65b92045-2e62-4797-9fa3-af31e146bccf)
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/d41fe644-07c2-4cb8-af21-f72743ce849e)

## cat
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/af91a3cf-41de-4750-bd4b-b3cf220aa008)
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/7b29bfd8-005d-4913-bcb4-f4aa0935017d)
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/a92f9903-4034-4e3d-ad59-1035fb59ec71)

