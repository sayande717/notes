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
    - 
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
    - d: Depth: Level of the tree, root node is at Level 0.
- Optimal, provides the shortest path.
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


<!-- Last image: self/0.png | external/-1.jpg -->

