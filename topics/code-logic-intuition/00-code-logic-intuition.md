# Notes on **Code, Logic & Intuition**

- [Points to remember:](#points-to-remember)
- [Problems: **LeetCode**](#problems-leetcode)
    - [387. First Unique Character in a String](#387-first-unique-character-in-a-string)
    - [26. Remove Duplicates from Sorted Array](#26-remove-duplicates-from-sorted-array)
- [Problems: **GeeksForGeeks**](#problems-geeksforgeeks)
    - [Q. Insert in a Sorted List](#q-insert-in-a-sorted-list)
 
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
### 387. First Unique Character in a String
- **Problem Statement**: [External Link](https://leetcode.com/problems/first-unique-character-in-a-string/description/)
- **Description**: Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
- **Data Structure**: `Hashmap`
- **Logic**:
    1. Use the hashmap to store the frequency of all the elements.
    2. Traverse the hashmap. Return the first element whose frequency is 1.
- **Implementation**: [Code](./code/leetcode/1.java)

### 26. Remove Duplicates from Sorted Array
- **Problem Statement**: [External Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)
- **Description**: Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums. Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    - Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    - Return k.
- **Data Structure**: `Array`
- **Logic**:
    1. If length of array is 1, return 1.
    2. Initialize index where unique elements should be placed, `addIndex`, as `1`. It it set to 1 to accomodate the first element (at index 0) of the array.
    3. Traverse through the array in the range (0 to nums.length-2).
        1. If nums[index] is less than nums[index+1], the elements are unique. In this case, place nums[index+1] in index `addIndex`.
        2. Increment `addIndex` by 1.
    4. Return `addIndex`.
- **Implementation**: [Code](./code/leetcode/2.java)

## Problems: **GeeksForGeeks**
### Q. Insert in a Sorted List
- **Problem Statement**: [External Link](https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1)
- **Description**: Given a linked list sorted in ascending order and an integer called data, insert data in the linked list such that the list remains sorted.
- **Data Structure**: `Linked List`
- **Logic**:
    1. **EDGE CASE**: If the 1st element is greater than the node we want to insert, simply insert it as the first element, then refactor the head accordingly.
    2. Run a while loop for these conditions: **current is not null** and **current node's value is less than the node's value we want to insert**.
        1. In the loop, keep traversing through the linked list.
        2. Whenever one of the conditions becomes false, break out.
    3. **BREAK CONDITION**: Current node's value is greater than the node's value we want to insert. In this case, we need to insert the node **after** the `previous` node & **before** the `current` node.
    4. **BREAK CONDITION**: Current is null. This means we have reached the end of the linked list. In other words, the node's value we want to insert is greater than all the elements in the linked list. In this case, we will insert the node **after** the `previous` node, and then point the new node to current.
- **Implementation**: [Code](./code/geeksforgeeks/1.java)