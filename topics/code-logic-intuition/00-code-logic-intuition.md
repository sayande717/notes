# Notes on **Code, Logic & Intuition**

- [Points to remember:](#points-to-remember)
- [Problems: **LeetCode**](#problems-leetcode)
- [Problems: **GeeksForGeeks**](#problems-geeksforgeeks)
    - [Q. Insert in a Sorted List](#q-insert-in-a-sorted-list)
    - [Q. Insert in a Sorted List](#q-insert-in-a-sorted-list-1)
 
## Points to remember:
- First improve the concepts, then start participating in coding contests, hackathons, etc.
- Think before coding. Thinking should constitute `80%` of the entire process.
    - Read the question thoroughly, check what all information has been given.
    - Solve the problem using pen & paper.
    - Dry run the logic for a few sample inputs.
    - Check for any edge cases that may occur.
- Use a step-by-step approach to solve the question/problem statement.
    - First, devise a solution using `Brute Force` approach. -> `Least optimised code`
    - Next, try to reduce the time complexity. Try switching to a more efficient data structure -> `Time optimised code`
    - Finally, try to reduce the space complexity -> `Time + Space optimised code`
- Practice: Don't go 3 days without coding. Code for atleast `1 hour` each day.
- Ideal time to move on from the problem (Company Expectations):
    - Easy: `5-10 minutes`
    - Medium: `15-20 minutes`
    - Hard: `40-60 minutes`
- Solve puzzles, they help to develop the logic.


## Problems: **LeetCode**


## Problems: **GeeksForGeeks**
### Q. Insert in a Sorted List
- **Problem Statement**: [External Link](https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1)
- **Description**: Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.
- **Data Structure**: `String`
- **Logic**:
    1. **EDGE CASE**: If the 1st element is greater than the node we want to insert, simply insert it as the first element, then refactor the head accordingly.
    2. Run a while loop for these conditions: **current is not null** and **current node's value is less than the node's value we want to insert**.
        1. In the loop, keep traversing through the linked list.
        2. Whenever one of the conditions becomes false, break out.
    3. **BREAK CONDITION**: Current node's value is greater than the node's value we want to insert. In this case, we need to insert the node **after** the `previous` node & **before** the `current` node.
    4. **BREAK CONDITION**: Current is null. This means we have reached the end of the linked list. In other words, the node's value we want to insert is greater than all the elements in the linked list. In this case, we will insert the node **after** the `previous` node, and then point the new node to current.
- **Implementation**: [Code](./code/geeksforgeeks/1.java)

### Q. Insert in a Sorted List
- **Problem Statement**: [External Link](https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1)
- **Description**: Given a non-negative integer `N`. The task is to check if `N` is a power of 2. More formally, check if `N` can be expressed as `2^x` for some integer `x`. Return true if `N` is power of 2 else return false.
- **Data Structure**: `Linked List`
- **Logic**:
    1. Let's see the representation of the powers of 2.
    2^0 = 1 ie  1
    2^1 = 2 ie  10
    2^2 = 4 ie  100
    2^3 = 8 ie  1000
    2^4 = 16 ie 10000
    2^5 = 32 ie 100000
    2^6 = 64 ie 1000000
    ... <br>
    As we can see, there's a pattern in these binary bits, ie only the first bit (at index 0) is set, the rest are unset.
        1. Also, the number has to be `> 0`. Since, in this question, the input can be from `0` to `LLONG_MAX`, there's a need for an edge case for 0. If number is 0, the length of the binary output (converted to string) will also be zero.
    2. First, check for the edge case. If input is 0, return false.
    3. Next, convert the input to binary format (as String).
        1. While input is not `0`, find the remainder of the input.
        2. Append the remainder to the output.
        3. Divide the input by `2`.
        4. After the while loop, return the output.
        5. **Note**: The output binary number will be in reverse, but it's not a problem for this use case.
    4. Then check if the last element (`lengthOfString-1`) is `1`, since the binary output is in reverse.
    5. Then check for the presence of `0` in the rest of the output. If even one `1` is detected, return `false`.
    6. Lastly, after the whole number has been traversed through, return `true`.

- **Implementation**: [Code](./code/geeksforgeeks/2.java)