# Notes on **- DSA Bootcamp** by Kunal Kushwaha

- [Git \& Github](#git--github)
    - [Key takeways have been covered in `cheat sheets > Github.md`](#key-takeways-have-been-covered-in-cheat-sheets--githubmd)
- [Introduction to Programming](#introduction-to-programming)
    - [Types of Languages](#types-of-languages)
    - [How variables \& objects are stored.](#how-variables--objects-are-stored)


## Git & Github
### Key takeways have been covered in `cheat sheets > Github.md`

## Introduction to Programming
### Types of Languages
- **Procedural**: Specifies a series of well-structured steps and procedures to complete a task. The statements are systematically ordered.
    - Example: Java, Python, etc.
- **Functional**: A programming language written only using pure functions. Variables are never modified, but new ones are created as an output. It is useful when we have to perform different operations on the same set of data.
    - Function: A block of code which can be re-used again and again.
    - First-class function: A function which can be used like a variable.
    - Example: Python.
- **Object-Oriented**: Code + Data = Object. Classes are named groups / collections of properties and functions. An instance of a class is called an object.
    - Program is divided into classes and functions.
    - If we want to change a particular part of a program, we can do it while keeping the other parts intact.
    - Example: Python, Java, C++.
- **Static**: Data Type checking at compile time. We have to specify the data type of a variable in the code itself, and it cannot be changed at any point during runtime.
    - Example:
        - int a = 10; `Possible`
        - int a = "ABCD"; `Not Possible`
- **Dynamic**: Data Type checking at runtime. We don't have to specify the data type of a variable in the code itself, and it can be changed at any point during runtime.
    - Example: 
        - a = 10; `Possible`
        - a = "ABCD"; `Possible`

### How variables & objects are stored.
In `a = 10`, a is the `reference vaiable` & 10 is the `object`. The reference variable points to the object. The reference variable is stored in the `stack` memory, while the object is stored in the `heap` memory. <br>
Example: 
```java
int a = 10;
int b = a;
b = 20;
System.out.print(a); // This will print 20.
```
Here, since both a & b are pointing to the same object i.e. `10`, when we're assigning the value of `20` to b, the original object is being modified. <br>
If there is an object that does have a reference variable pointing to it, the garbage collector will remove those objects from memory automatically.
