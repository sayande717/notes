# Notes on **DSA (Data Structures & Algorithms)**

- [Sliding Window](#sliding-window)
- [Binary Tree](#binary-tree)
    - [**Why** do we need Trees?](#why-do-we-need-trees)
    - [Usage](#usage)
    - [Important terms](#important-terms)
    - [Types](#types)
    - [**Facts**: Perfect binary trees](#facts-perfect-binary-trees)
    - [**Facts**: Strict binary trees](#facts-strict-binary-trees)
    - [**Facts**: Universal](#facts-universal)
    - [Implementation](#implementation)


# Data Structures

## Sliding Window
There are 2 pointers to keep track of a certain window. Whenever the window exceeds a certain condition, we start manipulating the size of the window.
First, both the pointers point to index 0 ie the first element. Let the pointers be P1 & P2.
We begin moving P2. The size of the window increases gradually, and we keep moving P2 as long as the predefined condition is met.
Whenever the condition becomes false, we either stop moving the pointers or we reduce the size of the window, usually by moving P1 (while P2 remains at it's place).

## Binary Tree
- This is the most important Data Structure asked in interviews.
- A Tree is basically a Directed Acyclic Graph (DAG).
- In a Binary Tree, every node can be connected to `0`, `1` or `2` child nodes.

### **Why** do we need Trees?
- Efficient insertion, finding and deletion of elements, in [O(log n)] time, in a **balanced** binary tree
- Cost efficient, it automatically adapts as elements are inserted/deleted.

### Usage
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

### Important terms
- Size = Total number of nodes.
- Child & Parent: Descendent & Ancestor of a node.
- Siblings: Nodes having the same parent.
- Leaf node: Nodes with no children, ie those at the bottom.
- Height of a node: **Maximum** number of edges from the node to the leaf nodes, i.e. how above it is from the lower ground.
- Height of the tree: Height of the root node.
- Leaf node: The bottom-most or outermost nodes.
- Level: Height difference between root node and that node. The level of root is `0`.
- Degree: Number of descendents of a node.

### Types
- Complete: Nodes are filled from left to right, but the last level may not be complete.
- Full/Strict: Each node has 0 or 2 children.
- Perfect: All internal nodes have 2 children, all leaf nodes are at the same level.
- Height-Balanced: Height of the left & right sub-tree does not differ by more than 1.
- Skewed: Every node has only 1 child. It's like a linked list.
- Ordered: Every node follows some property/condition, i.e. it follows an order. Example: Binary Search Tree.

### **Facts**: Perfect binary trees
- If height = `h`, total number of nodes: `2^(h+1) - 1`.
  > **Explanation**: At each level, the number of nodes is equal to `2^level`. So, if there are 4 levels, height of the tree will be `3 (number of levels - 1)` and the total number of nodes will be: `2^0 + 2^1 + 2^2 + 2^3 = 2(3+1)-1 (by Geometric Progression)`. <br>
  > So, if number of levels: `n`, height `h = n-1`. Total number of nodes: `2^(h+1)-1` or `2^n-1`.
- Number of leaf nodes: `2^h`.

### **Facts**: Strict binary trees
- If there are `n` leaf nodes, number of internal nodes: `n-1`.
- If there are `n` internal nodes, number of leaf nodes: `n+1`.

### **Facts**: Universal
- If there are `n` leaves, there are atleast `log(n)+1` levels.
- If there are `n` nodes, there are atleast `log(n+1)` levels.
- Number of leaf nodes = 1 + number of internal nodes **with 2 children (excluding root node)**.

### Implementation
- Using pointers i.e. linked representation
- Sequential i.e. using an array