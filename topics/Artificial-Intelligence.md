<!-- ID: 8 -->
## FRL Definitions
- **State-Space**: The set of all possible states.
- **Optimal Solution**: A solution that meets certain criteria, such as minimizing cost, maximizing utility, or achieving the best possible outcome, given a specific problem and its constraints. It is the most desirable solution among all possible solutions available for a given problem.

# Basics
- The main goals of an artificially intelligent system are:
    - Reasoning
    - Learning
    - Problem Solving
    - Perception
    ... like a human.
- When it comes to solving a problem, you need to represent the problem in such a way that the machine can understand it. Represent:
    - Precisely
    - In such a way that it can be analyzed

## Searching Techniques
- Uninformed & Informed Search
- Difference: `+`: Informed, `-`: Uninformed
    ```diff
    + Utilizes specific information about the problem domain to guide the search process.
    - Lacks specific domain knowledge and relies solely on general search strategies. It is only aware of the start & goal state.
    + Generally more efficient in terms of time and space complexity.
    - May be less efficient compared to informed search algorithms, especially for complex problems.
    + Designed to provide an optimal solution.
    - May or may not provide an optimal solution.
    + Examples include A* search, heuristic search, and informed hill climbing.
    - Examples include depth-first search, breadth-first search, and uniform-cost search.
    ```

### State-Space Search
- State-Space: The set of all possible states.
- Set: {S,A,Action(s), Result(s,a), Cost(s,a)}
    - S: Start, Goal
    - A: The set of all possible actions.
    - Action(s): The action we chose to execute.
    - Result(s,a): State formed as a Result of the action.
    - Cost(s,a): Cost of execute the action. The goal is to minimize the cost.

### Breadth-First Search
- Type: Uninformed Search.
- Based on: FIFO (Queue).
- Time complexity: $O(b^d)$
    - b: Branch factor, maximum number of children of a node.
    - d: Depth: Maximum Level of the tree, root node is at Level 0.
- Optimal, provides the best solution, if costs of all nodes is the same.
- Complete, always provides a solution.

- Example 0 (Start: A, Goal: G):
    1. A
    1. ~~A~~BCD
    1. ~~B~~CDEF
    1. ~~C~~DEFGH
    1. ~~D~~EFGHI
    1. ~~E~~FGHIJK
    1. ~~F~~GHIJK
    1. ~~G~~HIJKL
    - `G` was found. Result: `ACG`.
    - Note the implementation of FIFO: Elements are removed from LHS, and inserted from RHS.
   <br><img src="../assets/images/Artificial-Intelligence/self/0.png" alt="Breadth-First Search Example 0" height="500px" />

### Depth-First Search
- Type: Uninformed Search.
- Based on: LIFO (Stack).
- Time complexity: $O(b^d)$
    - b: Branch factor, maximum number of children of a node.
    - d: Depth: Maximum Level of the tree, root node is at Level 0.
- Not Optimal, may not provide the best solution.
- Not Complete, may not provide a solution.

- Example 0 (Start: A, Goal: D):
    1. A
    1. ~~A~~BC
    1. B~~C~~FG
    1. BF~~G~~
    1. B~~F~~
    1. ~~B~~DE
    1. D~~E~~
    1. ~~D~~
    - `D` was found. Result: `ACG`
    - Sequence: `ACGFBED`
    - Note the implementation of LIFO: Elements are removed from RHS, and inserted from RHS.
   <br><img src="../assets/images/Artificial-Intelligence/self/1.png" alt="Depth-First Search" height="400px" />

### Bi-directional Search
- Type: Depends on algorithm used.
- 2 simultaneous search, one from initial node to goal node, another from goal node to initial node.
- Time complexity: $O(b^d+b^d)=O(2b^{d/2})$
    - b: Branch factor, maximum number of children of a node.
    - d: Depth: Maximum Level of the tree, root node is at Level 0.
- Complete only in case of Breadth-First Search.
<br><img src="../assets/images/Artificial-Intelligence/self/2.png" alt="Bi-directional Search" height="300px" />

### 8-Puzzle Problem without Heuristic
- Type: Blind / Uninformed Search.
- Based on: Breadth-First Search
- Time complexity: $O(b^d)$
    - b: Branch factor, maximum number of children of a node.
    - d: Depth: Maximum Level of the tree.
- Example 0:
    - Actions (A): UP (⬆), DOWN (⬇), LEFT (⬅), RIGHT (➡)
    - Start | End:
        ||0||||1||
        |-|-|-|-|-|-|-|
        |1|2|3|..|1|2|3|
        ||4|6||4|5|6|
        |7|5|8||7|8||
    1. Step 1:
        ||0||->||1||||2||||3||
        |-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|
        |1|2|3|->||2|3|..|1|2|3|..|1|2|3|
        ||4|6|->|1|4|6||4||6||7|4|6|
        |7|5|8|->|7|5|8||7|5|8|||5|8|
    1. Step 2 (from puzzle **2**):
        ||0||->||⬆||||⬇||||⬅||||➡||
        |-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|
        |1|2|3|->|1||3|..|1|2|3|..|1|2|3|..|1|2|3|
        |4||6|->|4|2|6||4|5|6|||4|6||4|6|||
        |7|5|8|->|7|5|8||7||8||7|5|8||7|5|8|
    1. Step 3 (from puzzle **2**):
        ||0||->||⬅||||⬆||||➡||
        |-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|
        |1|2|3|->|1|2|3|..|1|2|3|..|1|2|3|
        |4|5|6|->|4|5|6||4||6||4|5|6|
        |7||8|->||7|8||7|5|8||7|8||
    1. Step 4: Puzzle **3** is the Goal State.
    - At every step, all valid moves are executed for all states, and all resultant states are determined.


<!-- Last image: self/2.png | external/-1.jpg -->


