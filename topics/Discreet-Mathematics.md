# Formulae
## FRL Reflexive Relations
- Total number of relations: $n^2$
- Total number of Diagonal elements: $n$
- Total number of Non-Diagonal elements: Total number of elements in AxA - Total number of diagonal elements = $n^2-n$
- Total number of reflexive relations: $2^{Non-Diagonal}$ = $2^{n^2-n}$
- Total number of non-reflexive relations: $2^{n^2}-2^{n^2-n}$
- Smallest possible size: $n$
- Largest possible size: $n^2$

## FRL Irreflexive Relations
- Total number of Non-Diagonal elements: Total number of elements in AxA - Total number of diagonal elements = $n^2-n$
- All non-reflexive relations are not irreflexive relations.
- Total number of irreflexive relations: $2^{n^2-n}$
- Smallest possible size: 0 ($\{\}$)
- Largest possible size: $n^2-n$

# Set Theory

## Set
### A **well-defined** **unordered** collection of **distinct** elements.
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
- **Example**: If $A = \{1,2,3\},\ P(A) = \{\{Φ\}, \{1\}, \{2\}, \{3\}, \{1,2\}, \{2,3\}, \{1,3\}, \{1,2,3\}\}$.
- If cardinality of a set is n, the number of elements in the power set is $2^n = 8$, ie $|P(a)| = |2^n|$
- Write all the sets starting with cardinality 0, then 1, then 2 ... and so on.


## Cartesian product
### Product of all elements of 1 set, with all elements of the other set.
- **Example**: If A={a,b} and B={1,2,3}, then:
    - $AxB = \{(a,1),{a,2},(a,3),(b,1),(b,2),(b,3)\}$ | If an element is (m,n), then m∈A & n∈B.
    - $BxA = \{(1,a),(1,b),(2,a),(2,b),(3,a),(3,b)\}$
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
- Total number of relations: $2^{mxn}$.

### Reflexive Relation
- [Formulae](#frl-reflexive-relations)
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
        - $\{(1,1),(2,2),(3,3)\}$: *Smallest*
        - $\{(1,1),(2,2),(3,3),(2,1)\}$: *We may also put extra elements as long as the original condition has been satisfied.*
        - $\{(1,1),(2,2),(3,3),(2,1),(2,3)\}$
        - $\{(1,1),(2,2),(3,3),(2,1),(2,3),(3,1)\}$
        - $\{(1,1),(2,2),(3,3),(2,1),(2,3),(3,1),(3,2)\}$
        - $\{(1,1),(2,2),(3,3),(2,1),(2,3),(3,1),(3,2),(3,3)\}$: *Largest*
- Example 1: Check for reflexive relation: {$(x,y)$, $x-y$ is an integer}
    - $(2,3)$ cannot be in an answer, since it doesn't satisfy point 2.
    - $(1,1),(2,2),(3,3)$, etc. will satisfy the equation, as $1-1=0$, which is an integer. So **it is a reflexive relation**.
- Example 2: Check for reflexive relation: {$(x,y)$, $x-y$ is an odd number}
    - $(1,1),(2,2),(3,3)$, etc. will not satisfy the equation, as $1-1=0$, which is not an odd number. So **it is not a reflexive relation**.

### Irreflexive Relation
- [Formulae](#frl-irreflexive-relations)
- A Relation 'R' on a set 'A' is said to be Irreflexive if $(x,y)∉R\ ∀\ (x,y)∊A$
- No element of the set should be related to itself.
- Points to remember:
    1. We exclude all diagonal elements, and include the non-diagonal elements.
    2. **A not reflexive relation is not the same as an Irreflexive relation**. Example:
        - $A=\{1,2,3\}$, $R=\{(1,1),(2,2)\}$
        - Here, R is not a reflexive relation since it does not include (3,3). But, R is not in Irreflexive relation either, because it includes (1,1) & (2,2). So, it is just not a reflexive relation.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - $R = \{(1,2),(1,3),(2,1),(2,3),(3,1),(3,2)\}$

### Symmetric Relation
- A Relation 'R' is symmetric, if for every $(x,y)∈R,\ (y,x)∈R\ ∀\ (x,y)∊A$.
- If $(x,y)$ is present in a Relation 'R' on a set 'A', then $(y,x)$ must also be present in the set.
- We first check if $(x,y)$ is present. We check for $(y,x)$ only if $(x,y)$ is present. It is not necessary for all possible relations to be present.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - $\{(1,2),(2,1),(1,3),(3,1),(1,1)\}$: for $(1,1)$, it's Symmetric pair will also be $(1,1)$, which is a duplicate.
    - $\{(1,2),(1,3),(1,1)\}$: This is NOT a symmetric relation, because $(3,1)$ is not present for $(1,3)$.
- Example 1: Check: 'perpendicular-to' on a set of all lines.
    > Solution: If a line $L1 ⊥ L2$, then obviously $L2 ⊥ L1$. So, **this is a symmetric relation**.
- Example 2: Check: 'brother of' of all humans on Earth.
    > Solution: If X is a brother of Y, Y may be a sister of X. So, **it's not symmetric**.
- Example 3: Check: 'complement of', on a set of numbers.
    > Solution: If `X` is a complement of `Y`, then `Y` is also a complement of `X`. So, **the relation is symmetric**.

### Anti-symmetric Relation
- A Relation 'R' is anti-symmetric, if for every $(x,y)∈R,\ (y,x)∈R\ ∀\ (x,y)∊A, only\ if\ (x=y)$.
- If $(x,y)$ is present in a Relation 'R' on a set 'A', then $(y,x)$ should only also be present in the relations if $x=y$. Otherwise, it must not be present.
- We first check if $(x,y)$ is present. We check for $(y,x)$ only if $(x,y)$ is present. It is not necessary for all possible relations to be present.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - $\{(2,1),(3,1),(1,1)\}$: TRUE, for $(2,1)$, $(1,2)$ must not be present since $(2≠1)$. For $(1,1)$, it's Symmetric pair is $(1,1)$, which is fine since $(1=1)$.
    - $\{(1,2),(2,1),(1,3),(1,1)\}$: FALSE, because $(2,1)$ is present.

### Asymmetric Relation
- A Relation 'R' is asymmetric, if for every $(x,y)∈R,\ (y,x)∉R\ ∀\ (x,y)∊A$.
- If $(x,y)$ is present in a Relation 'R' on a set 'A', then $(y,x)$ should only also be present in the relationsif $x=y$. Otherwise, it must not be present.
- We first check if $(x,y)$ is present. We check for $(y,x)$ only if $(x,y)$ is present. It is not necessary for all possible relations to be present.
- Example 0: $A = \{1,2,3\}$
    - $AxA = \{(1,1),(1,2),(1,3),(2,1),(2,2),(2,3),(3,1),(3,2),(3,3)\}$
    - $\{(2,1),(3,1),(2,3)\}$: TRUE, for all $(x,y)$, $(y,x)$ is not present in the relation.
    - $\{(2,2),(3,1),(2,3),(1,1)\}$: FALSE, because $(1,1)$ is present, and it's duplicate ie $(1,1)$ should not be present.
- Every Asymmetric relation is anti-symmetric. An Asymmetric relation is more restrictive than an anti-symmetric relation, since an asymmetric relation does not allow $(y,x)$ (for every $(x,y)$) to be present even if $(x=y)$.
- Every Anti-symmetric relations is not asymmetric. An anti-symmetric relation allows $(y,x)$ to be present if $(x=y)$.

### Transitive Relation
- A Relation 'R' is Transitive, if for every $(x,y)∈R\ \&\ (y,z)∈R$, $(x,z)∈R$ ∀ $(x,y)∊A$.
- If $(x,y)$ & $(y,z)$ is present in a Relation 'R' on a set 'A', then $(x,z)$ should also be present in the relation.
- If any or x,y or z is not present in the relation, then the relation is transitive by default.
- Example 0: $A = \{1,2,3\}$
    - $\{(1,1),(2,2)\}$: TRUE, x,y & z are not present together.
    - $\{Φ\}: TRUE, none of the elements are present.
    - $\{(1,2),(2,3)\}$: FALSE, since $(x,z)$ ie $(1,3)$ is not present.
        > x = 1, y = 2, z = 3
    - $\{(1,1),(1,2),(2,1)\}: TRUE, since in both cases the conditions are matching.
        > x = 1, y = 1, z = 2
        > z = 1, y = 2, z = 1

### Equivalence Relation
- A Relation 'R' is equivalence, if it is `reflexive`, `symmetric` or `transitive`.
- Example 0: $A = \{1,2,3\}$
    - $\{(1,1),(2,2),(3,3)\}$: TRUE
    - $\{(1,1),(2,2),(3,3),(2,1),(1,2)\}$: TRUE
    - $\{(1,1),(2,2),(3,3),(3,2),(1,3)\}$: FALSE, because $(2,3)$ is not present for $(3,2)$, so it's not symmetric.
    - $\{\ \}$: FALSE, since $(1,1),(2,2),(3,3)$ is not present, so it is not a reflexive relation.

### Partial-Ordering Relation
- A Relation 'R' is said to be a partial-ordering relation if R is `reflexive`, `anti-symmetric` as well as `transitive`.
- Partially odered set: A set 'A' with Partial-Ordering relation 'R' defined on 'A' is called POSET, defined by [A;R]
- Example 0: $A = \{1,2,3\}$
    - $\{(1,1),(2,2),(3,3)\}$: TRUE
    - $\{(1,1),(2,2),(3,3),(1,2),(2,3),(1,3)\}$: TRUE
    - [A,$\leq$] is a POSET: TRUE,
        > $(1 \leq 1)$ is true, so relation is reflexive. <br>
        > $(1 \leq 1)$ is true, and for $(1.5 \leq 2.5)$, $(2.5 \leq 1,5)$ is not true. So, relation is anti-symmetric. <br>
        > $(1 \leq 2.5)$, $(2.5 \leq 3)$, then $(1 \leq 3)$ is also true. So, the relation is transitive.
