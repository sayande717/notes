# Index
- [Prerequisites:](#prerequisites)
- [Fundamentals of Machine Learning](#fundamentals-of-machine-learning)
    - [Definition](#definition)
    - [Types of Machine Learning](#types-of-machine-learning)
    - [Supervised Learning](#supervised-learning)
    - [How a Machine Learning Model works](#how-a-machine-learning-model-works)
    - [Breaking up the Dataset](#breaking-up-the-dataset)
- [Project 1](#project-1)
    - [Dataset](#dataset)
    - [Classes](#classes)
    - [Code Description](#code-description)


## Prerequisites:
- Install Miniconda: Download the installer script & run it.
[Download link](https://docs.conda.io/en/latest/miniconda.html)
- Create a Miniconda environment: <br>
    ```bash
    # myenv: Name of the environment
    # python=3.10: Python compiler version
    $ conda create -n myenv python=3.10 pandas jupyter seaborn scikit-learn keras tensorflow
    ```
- Activate & Deactivate the environment:
    ```bash
    $ conda activate myenv
    $ conda deactivate
    ```

## Fundamentals of Machine Learning
### Definition
- **Artificial Intelligence**: AI is an area of computer science, where the goal is to enable computers and machines to perform human like tasks and simulate human behaviour.
- **Machine Learning**: Machine Learning is a sub-domain of computer science that focuses on algorithms that help the computer learn from data without explicit programming. It is a subset that tries to solve a specific problem and make predictions based on certain data.
- **Data Science**: Data Science is a field that attempts to find patterns and draw insights from the data.
### Types of Machine Learning
- Supervised Learning: Uses labelled data to train models and learn outputs. Each input has a corresponding output associated with it.
- Unsupervised Learning: Uses unlabelled data, identifies patterns within that data. Each input does not have a corresponding output associated with it.
- Reinforcement Learning: Agent learns in an interactive environment based on rewards and penalties.

### Supervised Learning
#### Types of Features: Input Vector
- **Qualitative**: Categorical data, finite number of categories or groups, example `gender, nationality`.
    - Nominal Data: They have no inherent order. One-Hot encoding is used to classify these.
        ```
        One-Hot Encoding: The item that corresponds to the output is set to 1, while the rest remain 0.
        Output: [USA, India, Canada, France]
        USA:    [1,0,0,0]
        India:  [0,1,0,0]
        Canada: [0,0,1,0]
        France: [0,0,0,1]
        ```
    - Ordinal Data: There have an inherent order.
        ```
        Outputs: [Very Bad, Bad, Average, Good, Very Good]
        Good is closer to Very Good than it is to Bad. So, we can just number them.
        Very Bad:  1
        Bad:       2
        Average:   3
        Good:      4
        Very Good: 5

        ```
- **Quantative**: Numerical valued data, can be discrete or continuous, for example, `Continous: the level of flame`,`Discrete: Number of eggs in a basket.`

#### Types of Predictions: Output Vectors
- **Classification**: Predict discrete classes
    - Binary Classification: True or false, exists or doesn't exist, 1 or 0, Spam or Not Spam
    - Multi-class Classification: A/B/C,Cat/Dog/Lizard/Dolphin
- **Regression**: Predict continuous values, for things that don't fit into discrete classes. Example: Price of a house over time, temperature changes over time, etc.

### How a Machine Learning Model works
Feature Vector: X | Target Vector: Y
1. It takes a feature vector as input.
2. Our model predicts a value.
3. That value is compared to the actual (target) value.
4. We go back & adjust the weights of the features so as to get closer to our target value, for that tuple.
5. This training process is repeated over and over again, till the accuracy is good enough.

### Breaking up the Dataset
We divide the input dataset into training, testing & validation dataset.
- Training dataset: Used to train the ML model. The model then predicts some values, and the output vector is compared to the target vector. The difference between them is known as `loss`. Then, we make some adjustments.
- Validation dataset: After training, we feed the validation set into the ML model. It is used to check if the model can still handle unseen data. The `loss` here is not used to train the model.
- Testing dataset: After training is over and the accuracy is good enough, the test dataset is fed into the ML model. It is used to check if how generalisable the final model is, for data that it has never seen before.

## Project 1
### Dataset
[Magic Gamma Particles](https://archive.ics.uci.edu/dataset/159/magic+gamma+telescope)

### Classes
- g = Gamma
- h = hadron

### Code Description
```python
cols = ['fLength','fWidth','fSize','fConc','fConc1','fAsym','fM3Long','fM3Trans','fAlpha','fDist','class'] # Columns
pd.read_csv('../datasets/magic04.data',names=cols) # Read the file, set the column headers to `cols`.

```