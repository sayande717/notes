# Notes on **- DSA (Data Structures & Algorithms)**

- [Data Structures](#data-structures)
    - [Sliding Window](#sliding-window)
    - [Binary Tree](#binary-tree)


## Data Structures

### Sliding Window
There are 2 pointers to keep track of a certain window. Whenever the window exceeds a certain condition, we start manipulating the size of the window.
First, both the pointers point to index 0 ie the first element. Let the pointers be P1 & P2.
We begin moving P2. The size of the window increases gradually, and we keep moving P2 as long as the predefined condition is met.
Whenever the condition becomes false, we either stop moving the pointers or we reduce the size of the window, usually by moving P1 (while P2 remains at it's place).

### Binary Tree
- This is the most important Data Structure asked in interviews.
- A Tree is basically a Directed Acyclic Graph (DAG).
- In a Binary Tree, every node can be connected to `0`, `1` or `2` child nodes.
- **Why** do we need Trees?
    - Efficient insertion, finding and deletion of elements, in [O(log n)] time, in a **balanced** binary tree
    - Cost efficient, it automatically adapts as elements are inserted/deleted.
- Usage of Binary Tree
    - File Systems: To represent the file system and structure. Every node represents a directory/file.
    - Databases: Because of fast retrieval of data
    - Network Routing: Used by path finding algorithms
    - To solve and represent complex Mathematical Equations
    - Decision Tree, in Machine Learning.
    - Compression of files
- In a Binary Search Tree, the nodes are ordered. All child nodes to the `left` of the current node are `smaller` than the current node, while all child nodes to the `right` of the current node are `greater` than the current node.
- Syntax:
  ```java
  class node {
      int value;
      Node left;
      Node right;
  }
  ```
- Properties:
    - Size = Total number of nodes.
    - Child & Parent: Descendent & Ancestor of a node.
    - Siblings: Nodes having the same parent.
    - Leaf node: Nodes with no children, ie those at the bottom.
    - Height of a node: **Maximum** number of edges between that node & the leaf nodes.
    - Level: Height difference between root and that node. The level of root is `0`.
- Types of Binary Tree:
    - Complete: Nodes are filled from left to right, but the last level may not be complete.
    - Full/Strict: Each node has 0 or 2 children.
    - Perfect: All internal nodes have 2 children, all leaf nodes are at the same level.
    - Height-Balanced: Height of the left & right sub-tree does not differ by more than 1.
    - Skewed: Every node has only 1 child. It's like a linked list.
    - Ordered: Every node follows some property/condition, i.e. it follows an order. Example: Binary Search Tree.
