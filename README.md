## Big O Complexity Hierarchy

| Complexity | Name        | Efficiency  | Description                                                                          |
|------------|-------------|-------------|--------------------------------------------------------------------------------------|
| O(1)       | Constant    | 🟢 Best     | Time remains the same regardless of input size, such as accessing an array by index. |
| O(log N)   | Logarithmic | 🟢 Good     | Run time grows very slowly; doubling input only adds a small constant time.          |
| O(√N)      | Sublinear   | 🟡 Fair     | Grows faster than but slower than linear;                                            |
| O(N)       | Linear      | 🟡 Fair     | Time grows in direct 1:1 proportion to input size.                                   |
| O(N log N) | Log-linear  | 🟠 Bad      | Slightly faster growth than linear; typical for efficient sorting like Merge Sort.   |
| O(N^2)     | Quadratic   | 🔴 Very Bad | Time is proportional to the square of the input; common in nested loops.             |
| O(N^3)     | Cubic       | 🔴 Worst    | Polynomial growth that becomes extremely slow for large.                             |
| O(2^N)     | Exponential | 🔴 Worst    | Time doubles with each additional element in the input.                              |
| O(N!)      | Factorial   | 🔴 Worst    | The most extreme growth; considers every possible permutation of elements.           |

