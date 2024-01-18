# Basic
- Algorithms: A finite set of steps to solve a problem

## Algorithm Analysis
### The process of comparing two algorithms with respect to time, space, etc.
- Priori analysis:
    - Analyzing before execution, is not dependent on hardware.
    - We count the number of times a line of code executes.
    - Preferred, because it has an uniform value.
    - We use Asymptotic notation, like Big O to denote the time complexity.
- Posterior Analysis:
    - Analyzing after execution, is dependent on hardware.
    - We determine the amount of time an algorithm takes to execute on a particular hardware platform.

## Asymptotic Notation, also check [Algorithm Analysis](algorithm-analysis)
- It is a mathematical way of representing the time complexity.
- Example: Let' s take the example of a notebook.
    - Best-case: I find the topic right on the first page, just after opening the notebook.
    - Worst-case: I find the topic on the last page of the notebook.
    - Average-case: I find the topic somewhere in the middle of the notebook, after traversing the pages one by one.

### Big-oh (O)
- Worst-case | Upper Bound
- $f(n) = O g(n), f(n) \leq c.g(n)$
    - c is the constant, $c > 0$
    - k is the point where $f(n)$ and $g(n)$ intercept, $k \geq 0$
    - $n \geq k$
- **Example**: $f(n)=2n^2+n$
    - Find the **closest largest** term such that $g(n)  \geq f(n)=2n^2+n$. The term is $n^2$.
    - So, $(2n^2+n) \leq c.g(n^2)$
    - $(2n^2+n) \leq 2n^2$, let c = 2. This is **false**, so increment c by 1.
    - $(2n^2+n) \leq 3n^2$, which is **true**.
    - So, $n \leq n^2$ or $n \geq 1$.
    - This means that for all values of $n \geq 1$ & $c=3$, the condition will hold true.
- Little o: f(n) = O g(n), f(n) **<** c.g(n)$.

### Big-Omega (Ω)
- Best-case | Lower Bound
- $f(n) = Ω g(n)$, $f(n) \geq c.g(n)$
- **Example**: $f(n)=2n^2+n$
    - Find the **closest smallest** term such that $g(n)  \leq f(n)=2n^2+n$. The term is $n^2$.
    - So, $(2n^2+n) \geq c.g(n^2)$
    - $(2n^2+n) \geq 2n^2$, let c = 2. which is **true**.
    - So, $n \geq 0$.
    - This means that for all values of $n \geq 0$ & $c=2$, the condition will hold true.
- Little Ω: f(n) = O g(n), f(n) **>** c.g(n)$.

### Theta (θ)
- Average-case | Between Upper & Lower Bound
    - $f(n) = θ g(n)$, $c$<sub>1</sub>$.g(n) \leq f(n) \leq c$<sub>2</sub>$.g(n)$
- **Example**: $f(n)=2n^2+n$
    - Find both the **closest smallest** term and **closest largest** term, for $g(n)$. **Both the terms are same**, $n^2$.
    - So, $c$<sub>1</sub>$.n^2 \leq (2n^2+n) \leq c$<sub>2</sub>$.n^2$
    - For $c$<sub>1</sub>$n^2 \leq (2n^2+n)$, c = 2.
    - For $(2n^2+n) \leq c$<sub>2</sub>$.n^2$, c = 3.
    - So, $2n^2 \leq (2n^2+n) \leq 3n^2$
    - This means that between the values $c=2$ & $c=3$ and $g(n)=n^2$, the condition will hold true.

# Time & Space Complexity (VVI)
# The Algorithms themselves
# 
