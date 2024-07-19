# Basics

# Linear Data Structures
## Arrays
- It's a collection of elements of a particular data type
- Elements are adjacent to each other.
- Each partition has 2 neighbours, except 1st and last one.
- Size of the box is fixed, and cannot be modified.
- The positions are indexed, and we can find an element by it's index.

- Implementation: [code](https://github.com/sayande717/code/blob/main/self/Java/initArray.java)

- Resize an array: There is no way to directly resize an array in Java. To do it, create another bigger array, and then copy all elements from the current array to the new array.

### Sentinel Search
> Sentinel search is a variation of the linear search algorithm used to improve its efficiency by reducing the number of comparisons. It involves placing a sentinel value (a special value) at the end of the data structure to avoid having to check for out-of-bounds conditions during the search.
- **Steps**:
    - Before starting the search, add a sentinel value to the end of the list or array. This sentinel value should be greater than any other value in the list, so it will guarantee that the search will eventually find it if the item is not present.
    - Initialize the search index variable i to 0.
    - Set the last element of the array to the search key.
    - While the search key is not equal to the current element of the array (i.e., arr[i]), increment the search index i.
    - If i is less than the size of the array or arr[i] is equal to the search key, return the value of i (i.e., the index of the search key in the array).
    - Otherwise, the search key is not present in the array, so return -1 (or any other appropriate value to indicate that the key is not found).
- The key benefit of the Sentinel Linear Search algorithm is that it eliminates the need for a separate check for the end of the array, which can improve the average case performance of the algorithm. <br>
- However, it does not improve the worst-case performance, which is still O(n) (where n is the size of the array), as we may need to scan the entire array to find the sentinel value.

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

## Graphs
- Components of a graph:
    - Node / Vertex
    - Edge / Ordered pair: Connection between 2 nodes.
- Terms:
    - Adjacent node: Nodes connected to the current node.
    - Degree of a node:
        - Undirected Graph: Number of nodes we can reach from current node.
        - Directed Graph:
            - Indegree: Number of nodes through which we can reach current node.
            - Outdegree: Number of nodes we can reach from current node.
    - Path: A Path of length `n` from node `u` to `v` is a sequence of `n+1` nodes.
    - Isolated node: If the degree of a node is `0`.
- Types:
    - Directed: Direction of the edge is defined.
        - Directed Acryllic Graph: A directed graph with no cycle.
        - Tree: A DAG, where the additional condition is that a child can only have 1 parent.
    - Undirected: Direction of the edge is not defined.
        - Connected: There exists an edge between every pair of nodes. No node is unreachable.
        - Complete: Every node is connected to every other node. A particular node can be reached from all other nodes.
        - Bi-connected: A connected graph with no articulation points.
            - Articulation point: If a node gets removed, the graph gets disconnected.
        <br><img src="../assets/images/Data-Structures-and-Algorithms/external/0.png" alt="Graphs 0" height="400px" />
    - Weighted: Edges have some costs associated with them.
    - Unweighted: Edges don't have costs associated with them.
    - Bipartite: Given 2 colours, a graph is a bipartite graph if no 2 adjacent nodes have the same colour.
        - Linear graphs are always bipartite by nature.
        - Graphs with even cycle length are always bipartite.
        - Graphs with odd cycle length are never bipartite.
        <br><img src="../assets/images/self/1.png" alt="Graphs 1" height="400px" />
    - Sparse: A graph with relatively few edges compared to the number of vertices.
    - Dense: A graph with relatively few vertices compared to the number of edges.
    - Finite: A graph with a finite number of vertices and edges.
    - Infinite: A graph with an infinite number of vertices and edges.
  
<!-- Last image: self/-1.png | external/-1.jpg -->