# Two Pointer Technique

---

It is a powerful yet simple algorithmic strategy used to efficiently traverse or search through linear data structures like arrays or linked lists. By using two indices (pointers) simultaneously, you can often reduce a problem's time complexity from to O(N^2) to O(N). 

## Core Strategies

- **Opposite Direction (Converging Pointers):** Pointers start at the far ends (beginning and end) and move toward the center. 

* [x] Finding pairs in a sorted array.
* [x] Checking for palindromes.

- **Same Direction (Fast and Slow Pointers):** Both pointers start at the same end and move at different speeds. 

* [x] Detecting cycles in linked lists (Floyd's Tortoise and Hare algorithm).
* [x] Finding the middle node.

- **Sliding Window:** Two pointers move in the same direction to define a dynamic range (a "window") that expands or contracts based on specific conditions. It is frequently used for 

* [x] Finding subarrays.
* [x] Finding substrings.

### Hint:
1. Sorted Array.
2. Pair/Triplet searching.
3. symmetry detection.