# Types of Languages

## Procedural
- Follows a top-down approach where tasks are executed one after another.
- Emphasizes on procedures or routines to accomplish tasks.
- Modifies the program's state using variables and statements.

## Functional
- Writing a program only in pure functions, ie never modify variables, only create new ones as an output.
- Emphasizes on functions as the primary building blocks.
- Avoids mutable state and favors immutable data structures.
- Supports higher-order functions and encourages declarative programming style.
- First-class functions: Using a function like a variable. Python implements First-class functions.


## Object-Oriented
- Organizes code into objects, which encapsulate data and behavior.
- Supports concepts such as inheritance, polymorphism, and encapsulation.
- Promotes code reusability, modularity, and maintainability.

## Static & Dynamic Languages

|Parameter     | Static Languages                        | Dynamic Languages                        |
|--------------|-----------------------------------------|------------------------------------------|
| Type Checking| Compile-time                            | Runtime                                  |
| Variables    | Explicit declaration of data types      | No explicit declaration of data types   |
| Memory Allocation | Determined at compile-time           | Determined at runtime                    |
| Control      | More control     | Less control         |
| Examples     | C, C++, Java                            | Python, JavaScript, Ruby                 |

# Types of Memory
- There are 2 types of memory, stack & heap.
- Example: $a = 10$
    - `a` is stored in stack.
    - `10` is stored in heap.
    - `a` points to the address of `10`.
    - `a`: Referenced variables
    - `10`: Object, referenced by `a`.
    - If we then write $a="string"$, then:
        - `string` gets stored in heap,
        - `a` now points to `string`.
        - Now, nothing points to `10`, ie `10` is not referenced by anything.
    - From time to time, non-referenced objects in heap are cleaned up.
- $>1$ reference variables can point to the same object.
- If one of those reference variables alter the object, it is changed for all of them.
