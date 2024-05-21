# Mini Desktop Search Engine

This project is a program implementing a "mini desktop search engine" in the Java programming language. The task of this search engine is to search for words that the user wants in a collection of selected documents and return the list of documents where the words are found and the count of those words in these documents. Additionally, words taken from these selected files are added to a binary search tree, and the user can list all the words as desired by pressing the "order" buttons in the interface.

## Design

### Binary Search Tree Node Structure

The structure of a binary search tree node is as follows:
![Node Structure](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/9a7ccbc8-64be-4d7d-81f6-8f83e80ae2dd)

The nodes in the BST are designed as shown in the image above. When a bstNode is created, it appears with the following properties: left, data (word), a linked list that holds file names and counts related to the word, and right.

### General View of the Search Engine

The general view of the search engine is as follows:
![Search Engine Overview](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/ebf1a97d-55be-4a02-89a3-8c07af08431c)

## Project Output

### Example Outputs
1)
![Output 1](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/2bc48f4f-219f-475e-b8b8-834d5dfae349)

2)
![Output 2](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/0cf5f932-3bc8-40d1-89f5-ca01523df716)

3)
![Output 3](https://github.com/beyzasevigen/MiniSearchingEngine/assets/131770848/f467217c-833b-41cd-810d-df7a44563cec)
