# Binary Search Tree (BST) Implementation

This Java repository, collaboratively developed by Yarin Ackerman and Rami Abu Rabia, showcases the implementation of a Binary Search Tree (BST) with various functionalities.

## Table of Contents
- [Overview](#overview)
- [Functions](#functions)
- [Usage](#usage)
- [License](#license)
- [Authors](#authors)

## Overview
The BST implementation provides a basic structure for a binary tree that follows the rules of a binary search tree, where each node has at most two children, and the key in each node is greater than or equal to all keys stored in the left subtree and less than or equal to all keys stored in the right subtree.

## Functions
1. `add(BinNode newNode)`: Adds a new node to the BST while maintaining the binary search tree property.
2. `search(int key)`: Searches for a node with a given key in the BST.
3. `delete(int key)`: Deletes a node with a given key from the BST.
4. `printAscendic(BinNode node)`: Prints the keys of the BST in ascending order.
5. `printDescendic(BinNode node)`: Prints the keys of the BST in descending order.
6. `printByLevels()`: Prints the keys of the BST level-wise.
7. `binaryTreeCheck(BinNode root)`: Checks if the given tree is a binary search tree.

## Usage
Explore the functionalities of the BST by running the `Main` class, where nodes are added, deleted, and various traversal methods are applied. Modify the tree creation and manipulation in the `main` method for different scenarios.

## License
This code is released under the MIT License. Refer to the [LICENSE](LICENSE) file for details.

## Authors
- Yarin Ackerman
- Rami Abu Rabia

Feel free to utilize, modify, or extend this implementation for educational purposes or reach out to the authors for any inquiries or improvements.
