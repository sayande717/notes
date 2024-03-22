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

### Linked List
- A linked list is a linear data structure consisting of a sequence of elements, called nodes, where each node contains a data element and a reference (or pointer) to the next node in the sequence.
- Unlike arrays, which have a fixed size and store elements in contiguous memory locations, linked lists dynamically allocate memory for each node, allowing for efficient insertion, deletion, and traversal of elements.
- Usage: Linked lists are often used when the size of the data structure is not known in advance or when frequent insertions and deletions are required, as they offer flexibility and efficient memory utilization. However, they may have slower access times for random access compared to arrays, as elements are not stored in contiguous memory locations.

#### Singly Linked List
- In this type of linked list, each node contains data and a pointer to the next node in the sequence. The last node points to `NULL` to indicate the end of the list.

#### Doubly linked list
- In a doubly linked list, each node contains data, a pointer to the next node, and a pointer to the previous node in the sequence. This allows for traversal in both forward and backward directions.

#### Circular linked list
- In a circular linked list, the last node points back to the first node, forming a circular structure. This can simplify certain operations like traversal or insertion at the end of the list.


