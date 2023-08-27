# Notes on **- DSA (Data Structures & Algorithms)**

- [Data Structures](#data-structures)
    - [Sliding Window](#sliding-window)


## Data Structures

### Sliding Window
There are 2 pointers to keep track of a certain window. Whenever the window exceeds a certain condition, we start manipulating the size of the window.
First, both the pointers point to index 0 ie the first element. Let the pointers be P1 & P2.
We begin moving P2. The size of the window increases gradually, and we keep moving P2 as long as the predefined condition is met.
Whenever the condition becomes false, we either stop moving the pointers or we reduce the size of the window, usually by moving P1 (while P2 remains at it's place).