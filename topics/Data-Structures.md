# Basics
- Data Structures intend to organize data, which makes processing easier.
- 2 Types: 
    - Linear: Elements are arranged sequentially.
        > Array, Linked List, Stack, Queue
    - Non-Linear: Elements are not arranged sequentially. They are stored in multiple levels.
        > Tree, Graph
- Algorithms: check [here](./Algorithms.md)

## Linear Data Structures
### Arrays
- It's a collection of elements of a particular data type
- Elements are adjacent to each other.
- Each partition has 2 neighbours, except 1st and last one.
- Size of the box is fixed, and cannot be modified.
- The positions are indexed, and we can find an element by it's index.

- Implementation: [code](https://github.com/sayande717/code/blob/main/self/Java/initArray.java)

- Resize an array: There is no way to directly resize an array in Java. To do it, create another bigger array, and then copy all elements from the current array to the new array.
