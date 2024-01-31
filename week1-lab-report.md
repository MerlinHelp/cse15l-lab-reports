Name: **Richard Vo** 
PID: **A17907078**

# Lab Report Week 1

```
# Share an example of using the command with no arguments.
# Share an example of using the command with a path to a directory as an argument.
# Share an example of using the command with a path to a file as an argument.

# So that's 9 total examples (3 for each command). For each, include:

# A screenshot or Markdown code block showing the command and its output
'''
* What the working directory was when the command was run
* A sentence or two explaining why you got that output (e.g. what was in the filesystem, what it meant to have no arguments).
* Indicate whether the output is an error or not, and if it's an error, explain why it's an error.
'''
```

## cd
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/b0450a64-40c7-4210-bd28-e72ef22818bf)
* Working dir: `/home`
* It returned me to the home directory (due to having no arguments), but I was already in the home directory so it seemed like nothing happened.
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/39abfc5b-1032-4f93-b09e-ec9fbab660a4)
* Working dir: `/home`
* Because `lecture1` was a valid directory in the cwd, `cd lecture1` changes my directory to `/home/lecture1`
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/bf9a24ea-6b69-47f9-8909-3a3b512da9d0)
* Working dir: `/home/lecture1`
* Because `Hello.java` is a file, it attempted to `cd` into `Hello.java` but realized it is not a directory and thus gave that output.
* It is an error because `cd` is not meant to be used with files and expected a dir.

## ls
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/eb488e0d-2a0c-457d-a959-77bed10468db)
* Working dir: `/home/lecture1`
* Because `lecture1` has other files and dirs within, `ls` gives out all the different paths that it sees in the system, and thus the output is such.
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/65b92045-2e62-4797-9fa3-af31e146bccf)
* Working dir: `/home/lecture1`
* Using `ls` in combination with a dir lists the paths within that dir argument you put if it is a valid directory. In my case, `messages` was a valid dir and printed out the `.txt` files within.
* It is not an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/d41fe644-07c2-4cb8-af21-f72743ce849e)
* Working dir: `/home/lecture1`
* Using `ls` with a file simply returns the name of the file, possibly because that file is the only thing that exists within that path, or maybe using something that isn't a directory becomes a grep or filter.
* It is not an error?

## cat
![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/af91a3cf-41de-4750-bd4b-b3cf220aa008)
* Working dir: `/home/lecture1`
* Using `cat` with no arguments and hitting enter probably treats the enter as some special sequence of chars the way that Ctrl + C does ^C when escaping, and in our case the terminal waits for infinite inputs and won't resolve.
* It is incorrectly using `cat`, but maybe it is an error due to the incorrect usage?

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/7b29bfd8-005d-4913-bcb4-f4aa0935017d)
* Working dir: `/home`
* Using `cat` with a directory does not work and cat handles that incorrect usage and thus the output is such.
* It is an error because `cat` is not meant to be used that way and it is handled, so it must be an error.

![image](https://github.com/MerlinHelp/cse15l-lab-reports/assets/139648011/a92f9903-4034-4e3d-ad59-1035fb59ec71)
* Working dir: `/home/lecture1`
* Using `cat` with a existing file linked to the path argued prints out the content of said file. In our case, we used `Hello.java` and so the contents of `Hello.java` were printed to terminal.
* It is not an error.
 
