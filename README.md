# MissionInterview
Interview preparation - Java - Algorithms - Data Structures 

## Sorting

        Bubble Sort
        Selection Sort
        Insertion Sort
        Shell Sort
        Heap Sort
        Merge Sort
        Quick Sort

        Counting Sort
        Radix Sort
          MSD Vs LSD
        Bucket Sort

## Binary Trees
        In order Traversal
        Pre order Traversal
        Post order Traversal
        Level order Traversal
        Spiral order Traversal

## Binary Search Tree
        AVL Trees
        Red-Black Trees

#### Segment tree 
stores intervals, and optimized for "which of these intervals contains a given point" queries.

#### Interval tree 
stores intervals as well, but optimized for "which of these intervals overlap with a given interval" queries. It can also be used for point queries - similar to segment tree.

#### Range tree 
stores points, and optimized for "which points fall within a given interval" queries.

#### Binary indexed or Febwick tree 
stores items-count per index, and optimized for "how many items are there between index m and n" queries.

#### Performance / Space consumption for one dimension:

                Segment tree - O(n logn) preprocessing time, O(k+logn) query time, O(n logn) space
                Interval tree - O(n logn) preprocessing time, O(k+logn) query time, O(n) space
                Range tree - O(n logn) preprocessing time, O(k+logn) query time, O(n) space
                Binary Indexed tree (Fenwick Tree) - O(n logn) preprocessing time, O(logn) query time, O(n) space

## B-Tree

## B+ Tees

## Linked List

## Graphs
        Dijkstra's Shortest Path
        Prim's Minimum Cost Spanning Tree
        Floyd-Warshall (all pairs shortest paths)
        Kruskal Minimum Cost Spanning Tree Algorithm
        Topological Sort
        Breadth-First Search
        Depth-First Search
        Connected Components - Adjacency List Representation
        Connected Components - Adjacency Matrix Representation
        
## Dynamic Programming

## Huffman Coding

## Tries

A prefix tree, or trie (often pronounced "try"), is a tree whose nodes don't hold keys, but rather, hold partial keys.  For example, if you have a prefix tree that stores strings, then each node would be a character of a string.  If you have a prefix tree that stores arrays, each node would be an element of that array.  The elements are ordered from the root.  So if you had a prefix tree with the word "hello" in it, then the root node would have a child "h," and the "h" node would have a child, "e," and the "e" node would have a child node "l," etc.  The deepest node of a key would have some sort of boolean flag on it indicating that it is the terminal node of some key.  (This is important because the last node of a key isn't always a leaf node... consider a prefix tree with "dog" and "doggy" in it).  Prefix trees are good for looking up keys with a particular prefix.

A radix tree or a patricia treeis a compressed trie. In a standard trie the label of each edge is a single letter, and thus you often have vertices with only one child. A radix tree gets rid of these useless vertices by allowing edge labels to be strings of any positive length. This optimizes the data structure not only in terms of storage space, but also in terms of lookup speed. The time needed to construct a radix tree from a given set of strings is linear in the sum of their lengths: basically, you just insert them as you would insert them into a standard trie.

A suffix tree is a radix tree that stores a special set of strings: the set of all suffixes of one given string. 
There is one technical detail: in a suffix tree it's beneficial to have a unique endmarker, so that each suffix corresponds to a different leaf of the tree. Thus, the suffix tree for "candy" would actually be equal to the radix tree for "candy$", "andy$", "ndy$", "dy$", and "y$".
The important thing to note here is the time complexity. Sure, we could construct a suffix tree of a given string S of length n in the same way as we construct a general radix tree: by taking the suffixes of S one at a time, and inserting them into the radix tree. However, the total  length of all suffixes of S is quadratic in n, and therefore the time complexity of this algorithm is Θ(n2). There are smarter specialized algorithms that can construct a suffix tree in Θ(n) time.
        
## Pattern Matching
        Knuth-Morris Pratt
        Boyer-Moore
        Rabin-Karp
      
## Heap
        Binary Heap
        Binomial Heap
        Fibonacci Heap
