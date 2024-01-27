# Formulae
## FRL Self Duality
- How many self-dual functions can be made with n variables?
    - Total number of combinations: $2^n$
    - Total number of Boolean functions: $2^{2^n}$
    - Total number of self-dual functions: $2^{2^{n-1}}$ 

# <strong>Gates</strong>

## <u>Properties of Gates:</u>
- Idempotent: $A.A = A$
- Commutative: $A.B = B.A$
- Associative: $(A+B)+C = A+(B+C)$

[1/0 = Doesn't have/has property]

| Gates | Symbol | Idempotent/Closure | Commutative | Associative |
| :--- | :---: | :---: | :---: | :---: |
| NOT | ¬ | 0 | NA | NA |
| AND | . | 1 | 1 | 1 |
| OR | + | 1 | 1 | 1 |
| NAND | ↑ | 0 | 1 | 0 |
| NOR | ↓ | 0 | 1 | 0 |
| XOR | ⊕ | 0 | 1| 1 |
| XNOR | ⊙ | 0 | 1 | 1 |

## <u>Types of Gates</u>
- Basic Gates: The most basic of all: AND, OR, NOT
- Universal Gates: Combination of basic gates, can be used to make any other gate: NAND (AND + NOT), NOR (OR + NOT)
- Arithmetic Gates: Used to perform arithmetic operations: XOR, XNOR
- Evaluation:
    - AND: **1** if both A & B are 1, otherwise **0**.
    - OR: **1** if either of A or B are 1, otherwise **0**.
    - NOR: Negation of OR, **1** if A OR B is 0, otherwise **0**.
    - NAND: Negation or AND, **1** if A AND B is 0, otherwise **0**.
    - XOR: **1** if both A & B are different, otherwise **0**.
    - XNOR: **1** if both A & B are same, otherwise **0**.

<hr>
<img src="../assets/images/Digital-Logic/0.jpg" height="200px" alt="logic gates" />

Image taken from [here](https://i.pinimg.com/originals/0c/19/25/0c1925a59240ec9623f584cf7e16c471.jpg)

<hr>

| A | B | AND | OR | NOR | NAND | XOR | XNOR |
|---|---|-----|----|-----|------|-----|------|
| A | B | A.B | A+B | ¬(A.B) | ¬(A+B) | A ⊕ B | A ⊙ B |
| 0 | 0 |  0  |  0 | 1 |  1  |  0  |   1  |
| 0 | 1 |  0  |  1 | 1 |  0  |  1  |   0  |
| 1 | 0 |  0  |  1 | 1 |  0  |  1  |   0  |
| 1 | 1 |  1  |  1 | 0 |  0  |  0  |   1  |

### <u>Universal Gates: NAND and NOR</u>
<!-- TODO: Add Circuit Diagram -->
- Logic: To implement OR gate, we need 3 NAND gates or 2 NOR gates.

| Gates | NAND | NOR |
| :---  |:---: |:---:|
|  NOT  |  1   |  1  |
|  AND  |  2   |  3  |
|  OR   |  3   |  2  |
|  XOR  |  4   |  5  |
|  XNOR |  5   |  4  |

### <u>Arithmetic Gates (XOR, XNOR)</u>

#### <u>XOR Gate</u>
- If 2 inputs are A & B, A ⊕ B = $A \bar B + \bar AB$
- If both inputs are same, output will be `0`, otherwise `1`.
- Truth Table:
    | A | B | Y |
    |---|---|---|
    | 0 | 0 | 0 |
    | 0 | 1 | 1 |
    | 1 | 0 | 1 |
    | 1 | 1 | 0 |
- Examples:
    1. $A ⊕ A = 0$
    2. $A ⊕ \bar A = 1$
    3. $A ⊕ 0 = A$ (Exchange property: In `(i)`, put `0` in LHS & `A` in RHS)
    4. $A ⊕ 1 = \bar A$ (Exchange property: In `(ii)`, put `1` in LHS & `$\bar A$` in RHS)
    5. $A ⊕ A ⊕ A ⊕ A ⊕ A ⊕ A ... n\ times$:
        - If `n` is even (for example $n=4$), $A ⊕ A ⊕ A ⊕ A = 0 ⊕ 0 = 0$
        - If `n` is odd (for example $n=3$), $A ⊕ A ⊕ A = 0 ⊕ A = A$
- XOR Gate can be used as buffer/inverter: Since $A ⊕ 0 = A$ & $A ⊕ 1 = \bar A$, we can give an input `A` & use the 2nd input as control. If the control is 0, output is same as input, otherwise output is inverted.

#### <u>XNOR Gate</u>
- Negation (¬) of XOR Gate.
- If 2 inputs are A & B, A ⊙ B = $AB + \bar A \bar B$ 
- If both inputs are same, output will be `1`, otherwise `0`.
- Truth Table:
    | A | B | Y |
    |---|---|---|
    | 0 | 0 | 1 |
    | 0 | 1 | 0 |
    | 1 | 0 | 0 |
    | 1 | 1 | 1 |
- Examples:
    1. $A ⊙  A = 1$
    2. $A ⊙ \bar A = 0$
    3. $A ⊙ 0 = \bar A$ (Exchange property: In `(i)`, put `0` in LHS & `A` in RHS)
    4. $A ⊙ 1 = A$ (Exchange property: In `(ii)`, put `1` in LHS & `$\bar A$` in RHS)
    5. $A ⊙ A ⊙ A ⊙ A ⊙ A ⊙ A ... n\ times$:
        - If `n` is even (for example $n=4$), $A ⊙ A ⊙ A ⊙ A = 1 ⊙ 1 = 1$
        - If `n` is odd (for example $n=3$), $A ⊙ A ⊙ A = 1 ⊕ A = A$
- XOR Gate can be used as buffer/inverter: Since $A ⊙ 0  = \bar A$ & $A ⊙ 1 = A$, we can give an input `A` & use the 2nd input as control. If the control is 1, output is same as input, otherwise output is inverted.

# Sum of Product & Canonical Sum of Product
- SoP need not contain all the literals, but in Canonical form, each product term should contain all literals, be it in complemented or un-complemented form.
- The product terms themselves are called the min-terms.
- **Sum of all min-terms for which output $f= 1$, is called Canonical Sum of Product, or disjunctive normal form**.
- Truth Table:

    |   x   |   y   |   z   |  Decimel  |   f   |
    |-------|-------|-------|:---------:|-------|
    |   0   |   0   |   0   |     0     |   0   |
    |   0   |   0   |   1   |     1     |   1   |
    |   0   |   1   |   0   |     2     |   0   |
    |   0   |   1   |   1   |     3     |   1   |
    |   1   |   0   |   0   |     4     |   0   |
    |   1   |   0   |   1   |     5     |   1   |
    |   1   |   1   |   0   |     6     |   0   |
    |   1   |   1   |   1   |     7     |   1   |

    - If $x=0$, we write $\bar x$, otherwise we write $x$.
    - So, SoP ie $f(1) = \bar x \bar y z + \bar x y z + x \bar y z + xyz$
    - We can also write it as $∑m(1,3,5,7)$ or $∑(m$<sub>1</sub>$+m$<sub>3</sub>$+m$<sub>5</sub>$+m$<sub>7</sub>$)$.

# Duality Theorem
### To get the dual of any boolean expression, replace:

| Source | Destination |
| :---:  | :---:       |
| OR     | AND         |
| .      | +           |
| NOT    | *keep as-is*|
| XOR    | XNOR        |
| NAND   | NOR         |
| 0      | 1           |
|Variable| *keep as-is*|

- [Formulae](#frl-self-duality)

- **Complement**: Has all properties of the Duality Theorem, and we complement the variables in addition.
    - $A\ <->\ \bar A$
    - $\bar A\ <->\ A$

- Example 0: $XOR = \bar A B + A \bar B$
    - $(\bar A + B) . (A + \bar B)$
    - $\bar A A + AB + \bar A \bar B + B \bar B$
    - $(AB + \bar A \bar B) = XNOR$ [Duality]
    - $(\bar A \bar B + A B)$       [Complement]

- Example 1: $(AB \bar C)+(\bar ABC) + (ABC)$
    - $(A+B+ \bar C).(\bar A + B+C).(A+B+C)$                                   [Duality]
    - $(\bar A + \bar B + C).(A + \bar B + \bar C).(\bar A + \bar B + \bar C)$ [Complement]

- Example 2: $(XYZ)+(\bar X Y \bar Z)+(\bar Y Z) = 1$
    - $(X+Y+Z).(\bar X + Y + \bar Z).(\bar Y + Z) = 0$              [Duality]
    - $(\bar X+ \bar Y + \bar Z).(X + \bar Y + Z).(Y + \bar Z) = 0$ [Complement]
- Example 3, demonstrating **self-dual equation**: $XY+YZ+XZ)$
    - $(X+Y).(Y+Z).(X+Z)$
    - $(XY+XZ+Y+YZ).(X+Z)$ # `Y.Y` can be written as `Y`
    - $(Y[X+1+YZ]+XZ).(X+Z)$
    - $(Y+XZ)(X+Z)$ # 1 added with anything will result in `1`, so `X+1+YZ` is resolved to `1`.
    - $XY+YZ+XZ+XZ$ # `XXZ=XZ` & `XZZ=XZ`
    - $XY+YZ+XZ$ # `XZ+XZ=XZ`
    - This kind of equation is called a self-dual equation. In other words, the output is the same as input in such an equation.
- Example 4: How many self-dual functions can be made with 1 variable?
    - Total number of combinations: 2, ie A can be either 0 or 1
    - Total number of Boolean functions: 4, ie $0,1, A$ or $\bar A$
    - Total number of self-dual functions: 2 (out of $0,A,\bar A,1$, only $A, \bar A$ are self-dual)
        | A | $f_1$ | $f_2$ | $f_3$ | $f_4$ |
        |---|:---:  | :---: | :---: | :---: |
        | 0 |0      | 0     | 1     | 1     |
        | 1 |0      | 1     | 0     | 1     |
        |**Result**|0   | $A$     | $\bar A$ | 1  |
- Example 5: How many self-dual functions can be made with 2 variables?
    - Total number of combinations: **4**, ie A can be either 0 or 1 & B can also be either 0 or 1
    - Total number of Boolean functions: **16**.
    - Total number of self-dual functions: **4**, ie only $A, \bar A, B, \bar B$ are self-dual out of all functions.
        | A | B | $f_1$ | $f_2$ | $f_3$ | $f_4$ | $f_5$ | $f_6$ | $f_7$ | $f_8$ | $f_9$ | $f_{10}$ | $f_{11}$ | $f_{12}$ | $f_{13}$ | $f_{14}$ | $f_{15}$ | $f_{16}$ |
        |:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:------:|:------:|:------:|:------:|:---:|:---:|
        | 0 | 0 |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  0  |  1  |  1  |   1  |   1  |   1  |   1  |   1  |   1  |   0  |
        | 0 | 1 |  0  |  0  |  0  |  0  |  1  |  1  |  1  |  1  |  0  |  0  |   0  |   0  |   1  |   1  |   1  |   1  |   0  |
        | 1 | 0 |  0  |  0  |  1  |  1  |  0  |  0  |  1  |  1  |  0  |  0  |   1  |   1  |   0  |   0  |   1  |   1  |   0  |
        | 1 | 1 |  0  |  1  |  0  |  1  |  0  |  1  |  0  |  1  |  0  |  1  |   0  |   1  |   0  |   1  |   0  |   1  |   1  |

# K-Map
- aka **Karnaugh Map**
- A K-Map is used to **graphically represent & minimize** boolean expressions.
- For a boolean expression of `n` variables, number of cells needed in K-Map is $2^{n}$.
- K-Map is based on Grey code (unit distance code). We can't change more than 1 bit in a single step.
- **Essential Prime Implicants**: Min-terms which have a `1` in them, which is also not shared with other pairs.
- There are 3 types of input values, `0`, `1`, `d,x (don't care)`.
- Steps: <!-- TODO: Correct -->
    1. We generate the K-Map.
    1. We find the pairs. They contain 1 mandatorily. We may take `d` ie `don't care` if needed, otherwise we ignore them. While pairing elements, we first try to find the biggest pair possible (16 elements in a K-Map of 16 elements). Then, we gradually decrease the pair size.
    1. We find the min-terms. Min-terms consist of variables which are same/common for all elements of the pair.
- Example: Generate a K-Map for $(A,B,C)$ & $(A,B,C,D)$
    - Detailed versions (the cell values denote the decimel representation of the positions):
        - 2 variables, $AB$:
            |$↓A\ \|\ B→$|$\bar B_{(0)}$|$B_{(1)}$
            |:---:|:---:|:---:|
            |$\bar A_{(0)}$|$0_{(00)}$|$1_{(01)}$|
            |$A_{(1)}$|$2_{(10)}$|$3_{(11)}$|

        - 3 variables, $ABC$:
            |$↓A\ \|\ BC→$|$\bar B \bar C_{(00)}$|$\bar B C_{(01)}$|$B C_{(11)}$|$B \bar C_{(10)}$|
            |:---:|:---:|:---:|:---:|:---:|
            |$\bar A_{(0)}$|$0_{(000)}$|$1_{(001)}$|$3_{(011)}$|$2_{(010)}$|
            |$A_{(1)}$|$4_{(100)}$|$5_{(101)}$|$7_{(111)}$|$6_{(110)}$|
        
        - 4 variables, $ABCD$:
            |$↓AB\ \|\ CD→$|$\bar C \bar D_{(00)}$|$\bar C D_{(01)}$|$C D_{(11)}$|$C \bar D_{(10)}$|
            |:---:|:---:|:---:|:---:|:---:|
            |$\bar A \bar B_{(00)}$|$0_{(0000)}$|$1_{(0001)}$|$3_{(0011)}$|$2_{(0010)}$|
            |$\bar A B_{(01)}$|$4_{(0100)}$|$5_{(0101)}$|$7_{(0111)}$|$6_{(0110)}$|
            |$AB_{(11)}$|$12_{(1100)}$|$13_{(1101)}$|$15_{(1111)}$|$14_{(1110)}$|
            |$A \bar B_{(10)}$|$8_{(1000)}$|$9_{(1001)}$|$11_{(1011)}$|$10_{(1010)}$|

    - Simplified versions & templates:
         - 2 variables, $AB$:
            |$↓A\ \|\ B→$|$\bar B$|$B$
            |:---:|:---:|:---:|
            |$\bar A$|$\#VALUE_{(0)}$|$\#VALUE_{(1)}$|
            |$A$|$\#VALUE_{(2)}$|$\#VALUE_{(3)}$|

        - 3 variables, $ABC$:
            |$↓A\ \|\ BC→$|$\bar B \bar C$|$\bar B C$|$B C$|$B \bar C$|
            |:---:|:---:|:---:|:---:|:---:|
            |$\bar A$|$\#VALUE_{(0)}$|$\#VALUE_{(1)}$|$\#VALUE_{(3)}$|$\#VALUE_{(2)}$|
            |$A$|$\#VALUE_{(4)}$|$\#VALUE_{(5)}$|$\#VALUE_{(7)}$|$\#VALUE_{(6)}$|

        - 4 variables, $ABCD$:
            |$↓AB\ \|\ CD→$|$\bar C \bar D_{(00)}$|$\bar C D_{(01)}$|$C D_{(11)}$|$C \bar D_{(10)}$|
            |:---:|:---:|:---:|:---:|:---:|
            |$\bar A \bar B_{(00)}$|$\#VALUE_{(0)}$|$\#VALUE_{(1)}$|$\#VALUE_{(3)}$|$\#VALUE_{(2)}$|
            |$\bar A B_{(01)}$|$\#VALUE_{(4)}$|$\#VALUE_{(5)}$|$\#VALUE_{(7)}$|$\#VALUE_{(6)}$|
            |$AB_{(11)}$|$\#VALUE_{(12)}$|$\#VALUE_{(13)}$|$\#VALUE_{(15)}$|$\#VALUE_{(14)}$|
            |$A \bar B_{(10)}$|$\#VALUE_{(8)}$|$\#VALUE_{(9)}$|$\#VALUE_{(11)}$|$\#VALUE_{(10)}$|

- Example 1: $f(A,B)=\sum (2,3)$
    - Method 1, by directly solving the equation:
        |A|B|$f$|
        |---|---|---|
        |0|0|0|
        |0|1|0|
        |1|0|1|
        |1|1|1|
        - As per the question, $f=1$ for index 2 & 3 (within 0-3).
        - The resultant equation is: $A \bar B + A B = A(\bar B + B) = A.1 = A$
    - Method 2, using K-Map:
        |null|$\bar B$|$B$|
        |---|---|---|
        |$\bar A$|$0_{(0)}$|$0_{(1)}$|
        |$A$|$1_{(2)}$|$1_{(3)}$|
        - Pair: (2) & (3). Output: $A$

- Example 2: $\sum m(0,2,5,7,9,11)+d(3,8,10,12,14)$
    |$↓PQ\ \|\ RS→$|$\bar R \bar S_{(00)}$|$\bar R S_{(01)}$|$R S_{(11)}$|$R \bar S_{(10)}$|
    |:---:|:---:|:---:|:---:|:---:|
    |$\bar P \bar Q_{(00)}$|$1_{(0)}$|$\#VALUE_{(1)}$|$d_{(3)}$|$1_{(2)}$|
    |$\bar P Q_{(01)}$|$\#VALUE_{(4)}$|$1_{(5)}$|$1_{(7)}$|$\#VALUE_{(6)}$|
    |$PQ_{(11)}$|$d_{(12)}$|$\#VALUE_{(13)}$|$\#VALUE_{(15)}$|$d_{(14)}$|
    |$P \bar Q_{(10)}$|$d_{(8)}$|$1_{(9)}$|$1_{(11)}$|$d_{(10)}$|
    - Pairs: $\{8,9,11,10\},\{0,2,8,10\},\{5,7\}$
    - Min-Terms: **4** ie $P \bar Q, \bar Q \bar S, \bar P Q S, \bar P \bar Q \bar S$
    - Essential Prime Implicants: **3** ie $P \bar Q, \bar Q \bar S,\bar P Q S$
