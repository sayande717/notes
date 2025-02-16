# Neural Networks
## Feed-Forward Neural Network
- A feed-forward neural network is an artificial neural network where the connections between the nodes do not form a cycle. It is the simplest type of artificial neural network and consists of layers of neurons, where each layer is fully connected to the next one. Information moves in one direction—from the input layer, through the hidden layers, to the output layer. This type of network is typically used for tasks such as classification and regression.
- Formula to compute the weighted sum: $z = \sum_{i=1}^{n} x_i . w_{ij} + b_j$
    - $x_i$: Input i, $w_{ij}$: Weight from input i to hidden layer j, $b_j$: Bias for hidden node $j$.