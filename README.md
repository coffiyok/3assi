Project Overview

This project compares three algorithms: Insertion Sort, Merge Sort, and Binary Search.
The goal is to analyze how different algorithms perform on arrays of different sizes and input types.

Insertion Sort

Insertion Sort is a simple algorithm that builds a sorted array step by step.
It works efficiently for small or already sorted arrays.
O(n) best case
o(n^2) average
o(n^2) worst


*Merge Sort

Merge Sort is an advanced algorithm that uses divide and conquer.
It splits the array into parts, sorts them, and merges them.
o(n log n) best
o(n log n) average
o(n log n) worst


* Binary Search

Binary Search works only on sorted arrays.
It repeatedly divides the search space in half.

O(log n)


Experimental Setup

Arrays of different sizes were tested:
- 10 elements
- 100 elements
- 1000 elements
- 5000 elements

Input types:
- Random arrays
- Sorted arrays

Execution time was measured using System.nanoTime().

Results

| Size | Input Type | Insertion Sort | Merge Sort | Binary Search |


| 10   | Random     | 4500 ns        | 7300 ns    | 1300 ns       |
| 10   | Sorted     | 1300 ns        | 5000 ns    | 800 ns        |

| 100  | Random     | 50100 ns       | 49900 ns   | 700 ns        |
| 100  | Sorted     | 3100 ns        | 37200 ns   | 800 ns        |

| 1000 | Random     | 1590000 ns     | 128300 ns  | 1000 ns       |
| 1000 | Sorted     | 2800 ns        | 73600 ns   | 1400 ns       |

| 5000 | Random     | 5291500 ns     | 643600 ns  | 1900 ns       |
| 5000 | Sorted     | 12800 ns       | 404900 ns  | 3100 ns       |

Analysis

The results clearly show differences between the algorithms:

Insertion Sort performs very fast on sorted arrays, but becomes much slower on large random arrays.
