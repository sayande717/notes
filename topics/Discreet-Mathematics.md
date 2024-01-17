# Set Theory

## Set
### A **well-defined** **unordered** collection of distinct elements.
- Unordered: Set {1,2,3,4} is same as {2,3,4,1}.
- Distinct: Set {1,2,3,4} is same as {1,1,2,2,3,4}.

<br>

## Null/Empty set
### A set with no elements, denoted by Φ or {}.
- Cardinality of an empty is 0.
- {Φ} is not an empty set.
- Φ is present in every set.

<br>

## Subset
### If every element of Set A also exists in Set B, denoted by ⊆.
- **Example**: If A = {1,2,3,4}, A' = {1,2,3,4,5}, then A ⊆ A'.
- Every set is a subset of itself.
- Trivial subset: A set which contains all elements of A, is if A={1,2,3,4} and A'={1,2,3,4}.
- Proper subset: A set which is not a trivial subset of A, ie the subset can't be same / can't have the same length as A.
- If A⊆B & B⊆A, then A=B. #Note

## Cardinality
### Number of elements in a set.

## Power Set
### If 'A' is a finite set, then it is the set of all subsets of 'A'.
- **Example**: If A = {1,2,3}, P(A) = {Φ, {1}, {2}, {3}, {1,2}, {2,3}, {1,3}, {1,2,3}}.
- If cardinality of a set is n, the number of elements in the power set is 2^n = 8, ie |P(a)| = |2^n|
- Write all the sets starting with cardinality 0, then 1, then 2 ... and so on.


## Cartesian product
### Product of all elements of 1 set, with all elements of the other set.
- **Example**: If A={a,b} and B={1,2,3}, then:
    - AxB = {(a,1),{a,2},(a,3),(b,1),(b,2),(b,3)} | If an element is (m,n), then m∈A & n∈B.
    - BxA = {(1,a),(1,b),(2,a),(2,b),(3,a),(3,b)}
- Total number of products, assuming Cardinality(A)=m & Cardinality(B)=n, is mxn.
- First multiply element 1 of A with element 1 of B, then element 1 of A with element 2 of B ... and so on.
- The order needs to be maintained, as is apparent in the example.
- AxB is not same as BxA, unless A=B.

## Relations, also check [Cartesian Product](#cartesian-product)
### If A and B are two sets and AxB is their cartesian product, then **any subset of AxB can form a relation from A to B**.
- **Example**:
    - {(a,1),(a,2)}         | Valid
    - {(b,1),(b,2),(a,1)}   | Valid
    - {(1,a),(2,a)}         | Not Valid
- Total number of relations: 2^(mxn).

