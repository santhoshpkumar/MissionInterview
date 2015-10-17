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

####Quick Sort
+ QuickSort is a divide and conquer algorithm. Large list is divided into two and sorted separately (conquered), sorted list is merge later.

+ On "in-place" implementation of quick sort, list is sorted using same array, no additional array is required. Numbers are re-arranged pivot, also known as partitioning.

+ Partitioning happen around pivot, which is usually middle element of array.

+ Average case time complexity of Quicksort is O(n log n) and worst case time complexity is O(n^2), which makes it one of the fasted sorting algorithm. 

+ How nlogn? Each partitioning operation takes O(n) operations (one pass on the array). In average, each partitioning divides the array to two parts (which sums up to log n operations). In total we have O(n * log n) operations.

## Binary Trees
        In order Traversal
        Pre order Traversal
        Post order Traversal
        Level order Traversal
        Spiral order Traversal

## Binary Search Tree
        AVL Trees
        Red-Black Trees

**Segment tree** stores intervals, and optimized for "which of these intervals contains a given point" queries.

**Interval tree** stores intervals as well, but optimized for "which of these intervals overlap with a given interval" queries. It can also be used for point queries - similar to segment tree.

**Range tree** stores points, and optimized for "which points fall within a given interval" queries.

**Binary indexed** or **Febwick tree** stores items-count per index, and optimized for "how many items are there between index m and n" queries.

#### Performance / Space consumption for one dimension:

                Segment tree - O(n logn) preprocessing time, O(k+logn) query time, O(n logn) space
                Interval tree - O(n logn) preprocessing time, O(k+logn) query time, O(n) space
                Range tree - O(n logn) preprocessing time, O(k+logn) query time, O(n) space
                Binary Indexed tree (Fenwick Tree) - O(n logn) preprocessing time, O(logn) query time, O(n) space

## Disk Based Data Structures

#### B-Tree

#### B+ Tees

## Linked List

## Graphs
        Dijkstra's Single Source Shortest Path algorithm
        Bellman–Ford Single Source Shortest Path algorithm
        Floyd-Warshall (all pairs shortest paths)
        
        Prim's Minimum Cost Spanning Tree
        Kruskal Minimum Cost Spanning Tree Algorithm
        
        Topological Sort
        Breadth-First Search
        Depth-First Search
        
        Connected Components - Adjacency List Representation
        Connected Components - Adjacency Matrix Representation
 
 **Kruskal’s Minimum Spanning Tree (MST):** In Kruskal’s algorithm, we create a MST by picking edges one by one. The Greedy Choice is to pick the smallest weight edge that doesn’t cause a cycle in the MST constructed so far.
 
 **Prim’s Minimum Spanning Tree:** In Prim’s algorithm also, we create a MST by picking edges one by one. We maintain two sets: set of the vertices already included in MST and the set of the vertices not yet included. The Greedy Choice is to pick the smallest weight edge that connects the two sets.
 
 **Dijkstra’s Shortest Path:** The Dijkstra’s algorithm is very similar to Prim’s algorithm. The shortest path tree is built up, edge by edge. We maintain two sets: set of the vertices already included in the tree and the set of the vertices not yet included. The Greedy Choice is to pick the edge that connects the two sets and is on the smallest weight path from source to the set that contains not yet included vertices.
     
**Single source shortest path (SSSP)** : 
 
 Dijkstra's algorithm :  solves the single-source shortest path problem.
  
  + *constrains : no Negative edges.*
  + *unweighted graph : Dijekstra == BFS ( Breadth First Search )*
 
Bellman–Ford algorithm : solves the single-source problem where edge weights may be negative. O(EV)
 
*Time Complexity*
 + Undirected graph - O(E + V log V) - dijkstra
 + Unweighted graph - O(E + V) - BFS
 + Directed acyclic graphs - O(E + V) - topological sorting

**All pair sotest path (APSP)** : 
 
 Floyd–Warshall algorithm : solves all pairs shortest paths. Handles both +ve / -ve edges. O(V^3)
 
  + *Constraints : Cannot handle Negative cycles (an edge which comes back to the same vertex which we started with but with a path length less than zero)*
 
## Dynamic Programming

## Encoding
#### Huffman Coding
Huffman Coding is a loss-less compression technique. It assigns variable length bit codes to different characters. The Greedy Choice is to assign least bit length code to the most frequent character.

Morse is not a prefix-free code

Huffman is a prefix-free code

Huffman coding solves this problem.  The methodology used for Huffman coding results in a prefix-free code.  A prefix-free code is one in which the bit coding sequence representing some particular character is never a prefix of the bit coding sequence representing any other character.  For example, here is a possible bit sequence for a Huffman code on an alphabet with four characters where D is the most probable and A is the least probable:
        
        A 110
        D 0
        C 10
        B 111

Code length is based on probability of occurrence - As with Morse code, the methodology used for the Huffman coding causes the bit coding sequence to be shortest for the most frequently occurring characters, and causes the coding sequence to be longest for the least frequently occurring characters.  Unlike the Morse code, however, the probabilities for Huffman are usually determined on a message-by-message basis instead of being based on some general overall expectation of the probability of occurrence of the characters.

Message-by-message probabilities - The upside of determining the probabilities on a message-by-message basis is that the encoding can be optimized for each specific message.  The downside is that the probability encoding table used to encode a specific message must also be used to decode the message.  The requirement to transport the encoding table along with the message adds some overhead to the overall process.

## Tries

A **prefix tree**, or **trie** (often pronounced "try"), is a tree whose nodes don't hold keys, but rather, hold partial keys.  For example, if you have a prefix tree that stores strings, then each node would be a character of a string.  If you have a prefix tree that stores arrays, each node would be an element of that array.  The elements are ordered from the root.  So if you had a prefix tree with the word "hello" in it, then the root node would have a child "h," and the "h" node would have a child, "e," and the "e" node would have a child node "l," etc.  The deepest node of a key would have some sort of boolean flag on it indicating that it is the terminal node of some key.  (This is important because the last node of a key isn't always a leaf node... consider a prefix tree with "dog" and "doggy" in it).  Prefix trees are good for looking up keys with a particular prefix.

A **radix tree** or a **patricia tree** is a compressed trie. In a standard trie the label of each edge is a single letter, and thus you often have vertices with only one child. A radix tree gets rid of these useless vertices by allowing edge labels to be strings of any positive length. This optimizes the data structure not only in terms of storage space, but also in terms of lookup speed. The time needed to construct a radix tree from a given set of strings is linear in the sum of their lengths: basically, you just insert them as you would insert them into a standard trie.

A **suffix tree** is a radix tree that stores a special set of strings: the set of all suffixes of one given string. 
There is one technical detail: in a suffix tree it's beneficial to have a unique endmarker, so that each suffix corresponds to a different leaf of the tree. Thus, the suffix tree for "candy" would actually be equal to the radix tree for "candy$", "andy$", "ndy$", "dy$", and "y$".
The important thing to note here is the time complexity. Sure, we could construct a suffix tree of a given string S of length n in the same way as we construct a general radix tree: by taking the suffixes of S one at a time, and inserting them into the radix tree. However, the total  length of all suffixes of S is quadratic in n, and therefore the time complexity of this algorithm is Θ(n2). There are smarter specialized algorithms that can construct a suffix tree in Θ(n) time.
        
## Pattern Matching
        Knuth-Morris Pratt
        Boyer-Moore
        Rabin-Karp
**KMP**

The KMP matching algorithm uses degenerating property (pattern having same sub-patterns appearing more than once in the pattern) of the pattern and improves the worst case complexity to O(n). The basic idea behind KMP’s algorithm is: whenever we detect a mismatch (after some matches), we already know some of the characters in the text (since they matched the pattern characters prior to the mismatch). We take advantage of this information to avoid matching the characters that we know will anyway match.

KMP algorithm does some preprocessing over the pattern pat[] and constructs an auxiliary array lps[] of size m (same as size of pattern). Here name lps indicates **longest proper prefix which is also suffix..** For each sub-pattern pat[0…i] where i = 0 to m-1, lps[i] stores length of the maximum matching proper prefix which is also a suffix of the sub-pattern pat[0..i].

        lps[i] = the longest proper prefix of pat[0..i] 
              which is also a suffix of pat[0..i]. 

Examples:

        For the pattern “AABAACAABAA”, lps[] is [0, 1, 0, 1, 2, 0, 1, 2, 3, 4, 5]
        For the pattern “ABCDE”, lps[] is [0, 0, 0, 0, 0]
        For the pattern “AAAAA”, lps[] is [0, 1, 2, 3, 4]
        For the pattern “AAABAAA”, lps[] is [0, 1, 2, 0, 1, 2, 3]
        For the pattern “AAACAAAAAC”, lps[] is [0, 1, 2, 0, 1, 2, 3, 3, 3, 4]

*Searching Algorithm*:

Unlike the Naive algo where we slide the pattern by one, we use a value from lps[] to decide the next sliding position. Let us see how we do that. When we compare pat[j] with txt[i] and see a mismatch, we know that characters pat[0..j-1] match with txt[i-j+1…i-1], and we also know that lps[j-1] characters of pat[0…j-1] are both proper prefix and suffix which means we do not need to match these lps[j-1] characters with txt[i-j…i-1] because we know that these characters will anyway match.

**Boyer-Moore**
 
Boyer-Moore algorithm "is an efficient string searching algorithm that is the standard benchmark for practical string search literature. It was developed by Robert S. Boyer and J Strother Moore in 1977. The algorithm preprocesses the string being searched for (the pattern), but not the string being searched in (the text). The Boyer-Moore algorithm uses information gathered during the preprocess step to skip sections of the text, resulting in a lower constant factor than many other string algorithms. In general, the algorithm runs faster as the pattern length increases".

The BM algorithm have two shifting functions: bad character rule (occurrence shift) and the good suffix rule (matching shift):

+ The bad character rule keeps information about how pattern matches against shifts of itself. This information is to avoid useless shifts of the pattern.

+ The good suffix rule uses the prefix function, the pattern and the text as inputs to find the occurrence of the pattern within the text and returns the number of shifts after the first occurrence.


**Rabin-Karp** 

Rabin Karp algorithm matches the hash value of the pattern with the hash value of current substring of text, and if the hash values match only then it starts matching individual characters. So Rabin Karp algorithm needs to calculate hash values for following strings.

+ Pattern itself (length m).
+ All the substrings of text of pattern length (m).

The average and best case running time of the Rabin-Karp algorithm is O(n+m), but its worst-case time is O(nm). Worst case of Rabin-Karp algorithm occurs when all characters of pattern and text are same as the hash values of all the substrings of txt[] match with hash value of pat[]. For example pat[] = “AAA” and txt[] = “AAAAAAA”.

**Substring search applications:** Pattern in streaming input, Screen scraping

## Heap
        Binary Heap
        Binomial Heap
        Fibonacci Heap
        
A **Binary Heap** is a Binary Tree with following properties.

1) It’s a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array.

2) A Binary Heap is either Min Heap or Max Heap. In a Min Binary Heap, the key at root must be minimum among all keys present in Binary Heap. The same property must be recursively true for all nodes in Binary Tree. Max Binary Heap is similar to Min Heap.

Examples of Min Heap:

            10                      10

         /      \               /       \  

       20        100          15         30  

      /                      /  \        /  \

    30                     40    50    100   40

Applications of Heaps:

1) Heap Sort: Heap Sort uses Binary Heap to sort an array in O(nLogn) time.

2) Priority Queue: Priority queues can be efficiently implemented using Binary Heap because it supports insert(), delete() and extractmax(), decreaseKey() operations in O(logn) time. Binomoial Heap and Fibonacci Heap are variations of Binary Heap. These variations perform union also efficiently.

3) Graph Algorithms: The priority queues are especially used in Graph Algorithms like *Dijkstra’s Shortest Path* and *Prim’s Minimum Spanning Tree*.

4) Many problems can be efficiently solved using Heaps. See following for example.
                a) K’th Largest Element in an array.
                b) Sort an almost sorted array.
                c) Merge K Sorted Arrays.

## Caching Replacement 

"Caching is a temp location where we store data in (data that we need it frequently) as the original data is expensive to be fetched, with caching we can retrieve required data faster. "

Caching is made of pool of entries and these entries are a copy of real data which are in storage (database for example) and it is tagged with a tag (key identifier) value for retrieval.

Cache Hit: If an entry can be found with a tag matching that of the desired data (say product Id), the entry is used instead. This is known as a cache hit (cache hit is the primary measurement for the caching effectiveness we will discuss that later on).
And the percentage of accesses that result in cache hits is known as the hit rate or hit ratio of the cache.

Cache Miss: On the contrary when the tag isn’t found in the cache (no match were found) this is known as cache miss , a hit to the back storage is made and the data is fetched back and it is placed in the cache so in future hits it will be found and will make a cache hit.

Replacement Policy: When cache miss happens, the cache ejects some other entry in order to make room for the previously uncached data (in case we don’t have enough room). The heuristic used to select the entry to eject is known as the replacement policy.

+ Least Frequently Used (LFU)
+ Least Recently Used (LRU)
    - Least Recently Used 2(LRU2)
    - Two Queues
+ Most Recently Used (MRU)
+ First in First out (FIFO)
    - Second Chance
    - Clock
+ Simple time-based

## Miscellaneous 
 
 + Given a list of strings, group anagrams - Sort each string and finally sort the entire collection. 
 
 + Merge sort implementation using linked list
 
 + Kadane's algorithm (Linear time algorithm) - the maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional 
 array of numbers (containing at least one positive number) which has the largest sum. 
 For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6. 
 
 + Disjoint sets - Union and Find (HashSet ot TreeSet)
