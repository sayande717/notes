# Set Theory

## Formulae
### FRL Reflexive Relations
- Total number of relations: $n^2$
- Total number of Diagonal elements: $n$
- Total number of Non-Diagonal elements: Total number of elements in AxA - Total number of diagonal elements = $n^2-n$
- Total number of reflexive relations: $2^{Non-Diagonal}$ = $2^{n^2-n}$
- Total number of non-reflexive relations: $2^{n^2}-2^{n^2-n}$
- Smallest possible size: $n$
- Largest possible size: $n^2$

### FRL Irreflexive Relations
- Total number of Non-Diagonal elements: Total number of elements in AxA - Total number of diagonal elements = $n^2-n$
- All non-reflexive relations are not irreflexive relations.
- Total number of irreflexive relations: $2^{n^2-n}$
- Smallest possible size: 0 ($\{\}$)
- Largest possible size: $n^2-n$

## Set
### A **well-defined** **unordered** collection of distinct elements.
- Unordered: Set {1,2,3,4} is same as {2,3,4,1}.
- Distinct: Set {1,2,3,4} is same as {1,1,2,2,3,4}.

<br>

## Null/Empty set
### A set with no elements, denoted by Φ or {}.
- Cardinality of an empty set is 0.
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
    - $\{(a,1),(a,2)\}$         | Valid
    - $\{(b,1),(b,2),(a,1)\}$   | Valid
    - $\{(1,a),(2,a)\}$         | Not Valid
- Total number of relations: 2^(mxn).

### Reflexive Relation:
- [Formulae](frl-reflexive-relations)
- A Relation 'R' on a set 'A' is said to be Reflexive if $(x,x)∊R ∀ x∊A$
- Every element of a set is related to itself.
- Points to remember:
    1. All elements must be present. 
    2. All of them must be related to themselves.
    3. After putting in all valid elements, we can put extra elements.
    4. The difference between a diagonal relation is that a reflexive relation may also contain extra elements.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - Possible Reflexive relations:
        - {(1,1),(2,2),(3,3)}: *Smallest*
        - {(1,1),(2,2),(3,3),(2,1)}: *We may also put extra elements as long as the original condition has been satisfied.*
        - {(1,1),(2,2),(3,3),(2,1),(2,3)}
        - {(1,1),(2,2),(3,3),(2,1),(2,3),(3,1)}
        - {(1,1),(2,2),(3,3),(2,1),(2,3),(3,1),(3,2)}
        - {(1,1),(2,2),(3,3),(2,1),(2,3),(3,1),(3,2),(3,3)}: *Largest*
- Example 1: Check for reflexive relation: {$(x,y)$, $x-y$ is an integer}
    - (2,3) cannot be in an answer, since it doesn't satisfy point 2.
    - (1,1),(2,2),(3,3), etc. will satisfy the equation, as $1-1=0$, which is an integer. So **it is a reflexive relation**.
- Example 2: Check for reflexive relation: {$(x,y)$, $x-y$ is an odd number}
    - (1,1),(2,2),(3,3), etc. will not satisfy the equation, as $1-1=0$, which is not an odd number. So **it is not a reflexive relation**.

### Irreflexive Relation:
- [Formulae](frl-irreflexive-relations)
- A Relation 'R' on a set 'A' is said to be Irreflexive if $(x,x)∉R\ ∀\ x∊A$
- No element of the set should be related to itself.
- Points to remember:
    1. We exclude all diagonal elements, and include the non-diagonal elements.
    2. A not reflexive relation is not the same as an Irreflexive relation. Example:
        - $A=\{1,2,3\}$, $R=\{(1,1),(2,2)\}$
        - Here, R is not a reflexive relation since it does not include (3,3). But, R is not in Irreflexive relation either, because it includes (1,1) & (2,2). So, it is just not a reflexive relation.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - $R = \{(1,2),(1,3),(2,1),(2,3),(3,1),(3,2)\}$