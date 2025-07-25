# DSA-Task-

# For Any Doubt 💬

Reach out to *Piyush* at *6397415707* Or *Parth* at *9559805577*.


# Week 1 Task: Let's Master "Subarray" Related Problems 🚀

## 1. Understand the Problem Clearly:

- Carefully read the problem and break it down.
- Are you asked to find a subarray with certain properties (e.g., smallest, largest sum, divisible sum)?
- Are you asked to maximize, minimize, or check for the existence of a condition?
- Does the problem allow for negative numbers or only positive ones?

Understanding these questions is the first step towards identifying which algorithm or technique might work best for solving the problem.

---

## 2. Analyze the Subarray Nature:

Subarrays are contiguous parts of an array, and different categories of subarray-related problems exist. 
- *Key Point*: Each category has specific patterns and hints towards a particular type of solution, so recognizing the subarray nature in the problem is crucial.

---

## 3. Look for Common Patterns:

### 1) Sliding Window or Two-Pointer Technique:

- *When to Use*:
  - Finding a subarray with a fixed sum or length.
  - Finding a subarray with conditions that can be checked as you move from one end of the array to another.
  
- *Why It Works*: This technique is efficient because it processes the array in linear time, expanding and contracting the window as needed.

- *Common Problem Types*:
  - Finding the smallest subarray with a sum greater than X.
  - Longest subarray with distinct elements or fixed-length subarrays.

- *Example*:
  - If you’re asked to find the longest subarray with sum ≤ k, sliding window is often the best approach.

---

### 2) Kadane’s Algorithm (Dynamic Programming):

- *When to Use*:
  - Finding the maximum subarray sum.

- *Why It Works*:
  - This algorithm efficiently tracks the maximum subarray sum ending at each index.
  - It's optimal as it builds solutions to subproblems (maximum sums ending at earlier indices) and extends them to solve larger problems.

- *Common Problem Types*:
  - Finding the maximum subarray sum, especially when there are no constraints on subarray length or when negative values are allowed.

- *Example*:
  - Given an array, find the maximum sum of any subarray.

---

### 3) Prefix Sum & HashMap:

- *When to Use*:
  - Modulo arithmetic (e.g., sum divisible by a number).
  - Checking sums over subarrays (especially when the subarray can be of any size).

- *Why It Works*:
  - The prefix sum allows us to break down a subarray sum into differences between two prefix sums.
  - HashMaps are used for fast lookups of previously seen sums, especially useful for problems with conditions like "sum divisible by k."

- *Common Problem Types*:
  - Finding subarrays that sum to k, or removing a subarray to make a sum divisible by a given value.

- *Example*:
  - Find the smallest subarray whose sum is divisible by a number p.

---

## 4. Practice Questions

### Easy Problems:

1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
2. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)
3. [Count Elements with Maximum Frequency](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
4. [Divide Array into Arrays with Max Difference](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
5. [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
6. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
7. [Minimum Common Value](https://leetcode.com/problems/minimum-common-value/)

---

### Two-Pointer Problems:

1. [3Sum](https://leetcode.com/problems/3sum/)
2. [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
3. [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
4. [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
5. [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)

---

### Prefix Sum Problems:

1. [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
2. [Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)
3. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays)
4. [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
5. [K-radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/)

---

## 5. Let's Solve Some Problems:

### Leetcode Problems:

1. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
2. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)
4. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### OA Problem:

1. LinkedIn - SDE Intern:
   - *Question*: Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions so the final string contains no adjacent equal characters.
   
   Example:  
   Input: ['add', 'boook', 'break']  
   Output: [1, 1, 0]

---

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0018-4sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0040-combination-sum-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0040-combination-sum-ii) |
| [0042-trapping-rain-water](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0042-trapping-rain-water) |
| [0051-n-queens](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0051-n-queens) |
| [0063-unique-paths-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0063-unique-paths-ii) |
| [0075-sort-colors](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0075-sort-colors) |
| [0152-maximum-product-subarray](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0152-maximum-product-subarray) |
| [0239-sliding-window-maximum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0239-sliding-window-maximum) |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
| [0300-longest-increasing-subsequence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0300-longest-increasing-subsequence) |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
| [0455-assign-cookies](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0455-assign-cookies) |
| [0494-target-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0494-target-sum) |
| [0542-01-matrix](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0542-01-matrix) |
| [0787-sliding-puzzle](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0787-sliding-puzzle) |
| [0875-longest-mountain-in-array](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0875-longest-mountain-in-array) |
| [0890-lemonade-change](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0890-lemonade-change) |
| [1044-find-common-characters](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1044-find-common-characters) |
| [1063-best-sightseeing-pair](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1063-best-sightseeing-pair) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [1468-check-if-n-and-its-double-exist](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1468-check-if-n-and-its-double-exist) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [1755-defuse-the-bomb](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1755-defuse-the-bomb) |
| [1813-maximum-erasure-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1813-maximum-erasure-value) |
| [1972-rotating-the-box](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1972-rotating-the-box) |
| [2089-maximum-matrix-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2089-maximum-matrix-sum) |
| [2211-k-radius-subarray-averages](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2211-k-radius-subarray-averages) |
| [2232-adding-spaces-to-a-string](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2232-adding-spaces-to-a-string) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2343-count-unguarded-cells-in-the-grid) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2552-maximum-sum-of-distinct-subarrays-with-length-k](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2552-maximum-sum-of-distinct-subarrays-with-length-k) |
| [2634-minimum-common-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2634-minimum-common-value) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [2756-buy-two-chocolates](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3241-divide-array-into-arrays-with-max-difference) |
| [3242-count-elements-with-maximum-frequency](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3242-count-elements-with-maximum-frequency) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
| [3522-find-the-power-of-k-size-subarrays-i](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3522-find-the-power-of-k-size-subarrays-i) |
## Two Pointers
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0005-longest-palindromic-substring) |
| [0011-container-with-most-water](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0018-4sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0042-trapping-rain-water](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0042-trapping-rain-water) |
| [0075-sort-colors](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0075-sort-colors) |
| [0455-assign-cookies](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0455-assign-cookies) |
| [0875-longest-mountain-in-array](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0875-longest-mountain-in-array) |
| [1468-check-if-n-and-its-double-exist](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1468-check-if-n-and-its-double-exist) |
| [1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [1972-rotating-the-box](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1972-rotating-the-box) |
| [2232-adding-spaces-to-a-string](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2232-adding-spaces-to-a-string) |
| [2634-minimum-common-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2634-minimum-common-value) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0011-container-with-most-water) |
| [0455-assign-cookies](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0455-assign-cookies) |
| [0890-lemonade-change](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0890-lemonade-change) |
| [1515-find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1515-find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k) |
| [2089-maximum-matrix-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2089-maximum-matrix-sum) |
| [2756-buy-two-chocolates](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3241-divide-array-into-arrays-with-max-difference) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0018-4sum) |
| [0075-sort-colors](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0075-sort-colors) |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
| [0455-assign-cookies](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0455-assign-cookies) |
| [1468-check-if-n-and-its-double-exist](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1468-check-if-n-and-its-double-exist) |
| [2756-buy-two-chocolates](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3241-divide-array-into-arrays-with-max-difference) |
## Hash Table
|  |
| ------- |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
| [1044-find-common-characters](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1044-find-common-characters) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [1468-check-if-n-and-its-double-exist](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1468-check-if-n-and-its-double-exist) |
| [1813-maximum-erasure-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1813-maximum-erasure-value) |
| [2552-maximum-sum-of-distinct-subarrays-with-length-k](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2552-maximum-sum-of-distinct-subarrays-with-length-k) |
| [2599-take-k-of-each-character-from-left-and-right](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2599-take-k-of-each-character-from-left-and-right) |
| [2634-minimum-common-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2634-minimum-common-value) |
| [3242-count-elements-with-maximum-frequency](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3242-count-elements-with-maximum-frequency) |
## Counting
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
| [3242-count-elements-with-maximum-frequency](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/3242-count-elements-with-maximum-frequency) |
## String
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0005-longest-palindromic-substring) |
| [0022-generate-parentheses](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0022-generate-parentheses) |
| [1044-find-common-characters](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1044-find-common-characters) |
| [1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence) |
| [2232-adding-spaces-to-a-string](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2232-adding-spaces-to-a-string) |
| [2599-take-k-of-each-character-from-left-and-right](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2599-take-k-of-each-character-from-left-and-right) |
## Binary Search
|  |
| ------- |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
| [0300-longest-increasing-subsequence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0300-longest-increasing-subsequence) |
| [1468-check-if-n-and-its-double-exist](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1468-check-if-n-and-its-double-exist) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [2634-minimum-common-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2634-minimum-common-value) |
## Dynamic Programming
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0005-longest-palindromic-substring) |
| [0022-generate-parentheses](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0022-generate-parentheses) |
| [0042-trapping-rain-water](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0042-trapping-rain-water) |
| [0062-unique-paths](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0062-unique-paths) |
| [0063-unique-paths-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0063-unique-paths-ii) |
| [0070-climbing-stairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0070-climbing-stairs) |
| [0152-maximum-product-subarray](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0152-maximum-product-subarray) |
| [0300-longest-increasing-subsequence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0300-longest-increasing-subsequence) |
| [0494-target-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0494-target-sum) |
| [0542-01-matrix](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0542-01-matrix) |
| [0875-longest-mountain-in-array](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0875-longest-mountain-in-array) |
| [1013-fibonacci-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1013-fibonacci-number) |
| [1063-best-sightseeing-pair](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1063-best-sightseeing-pair) |
| [2562-count-ways-to-build-good-strings](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2562-count-ways-to-build-good-strings) |
## Enumeration
|  |
| ------- |
| [0875-longest-mountain-in-array](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/0875-longest-mountain-in-array) |
## Sliding Window
|  |
| ------- |
| [0239-sliding-window-maximum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0239-sliding-window-maximum) |
| [1755-defuse-the-bomb](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1755-defuse-the-bomb) |
| [1813-maximum-erasure-value](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/1813-maximum-erasure-value) |
| [2211-k-radius-subarray-averages](https://github.com/VarsKhushi/DSA-Task-Khushi-2215000645-Batch2/tree/master/2211-k-radius-subarray-averages) |
| [2552-maximum-sum-of-distinct-subarrays-with-length-k](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2552-maximum-sum-of-distinct-subarrays-with-length-k) |
| [2599-take-k-of-each-character-from-left-and-right](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2599-take-k-of-each-character-from-left-and-right) |
| [3522-find-the-power-of-k-size-subarrays-i](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3522-find-the-power-of-k-size-subarrays-i) |
## Backtracking
|  |
| ------- |
| [0022-generate-parentheses](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0022-generate-parentheses) |
| [0040-combination-sum-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0040-combination-sum-ii) |
| [0051-n-queens](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0051-n-queens) |
| [0494-target-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0494-target-sum) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0042-trapping-rain-water) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0042-trapping-rain-water) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
## Linked List
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0023-merge-k-sorted-lists) |
## Divide and Conquer
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0023-merge-k-sorted-lists) |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
## Heap (Priority Queue)
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0023-merge-k-sorted-lists) |
| [0239-sliding-window-maximum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0239-sliding-window-maximum) |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
## Merge Sort
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0023-merge-k-sorted-lists) |
## Tree
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0104-maximum-depth-of-binary-tree) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0515-find-largest-value-in-each-tree-row) |
| [2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level) |
| [3439-find-minimum-diameter-after-merging-two-trees](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3439-find-minimum-diameter-after-merging-two-trees) |
## Depth-First Search
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0104-maximum-depth-of-binary-tree) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0515-find-largest-value-in-each-tree-row) |
| [2201-valid-arrangement-of-pairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2201-valid-arrangement-of-pairs) |
| [3439-find-minimum-diameter-after-merging-two-trees](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3439-find-minimum-diameter-after-merging-two-trees) |
## Breadth-First Search
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0104-maximum-depth-of-binary-tree) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0515-find-largest-value-in-each-tree-row) |
| [0542-01-matrix](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0542-01-matrix) |
| [0787-sliding-puzzle](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0787-sliding-puzzle) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [3439-find-minimum-diameter-after-merging-two-trees](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3439-find-minimum-diameter-after-merging-two-trees) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
## Binary Tree
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0104-maximum-depth-of-binary-tree) |
| [0515-find-largest-value-in-each-tree-row](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0515-find-largest-value-in-each-tree-row) |
| [2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2558-minimum-number-of-operations-to-sort-a-binary-tree-by-level) |
## Matrix
|  |
| ------- |
| [0063-unique-paths-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0063-unique-paths-ii) |
| [0542-01-matrix](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0542-01-matrix) |
| [0787-sliding-puzzle](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0787-sliding-puzzle) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [1972-rotating-the-box](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1972-rotating-the-box) |
| [2089-maximum-matrix-sum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2089-maximum-matrix-sum) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2343-count-unguarded-cells-in-the-grid) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
## Simulation
|  |
| ------- |
| [2232-adding-spaces-to-a-string](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2232-adding-spaces-to-a-string) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2343-count-unguarded-cells-in-the-grid) |
## Math
|  |
| ------- |
| [0062-unique-paths](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0062-unique-paths) |
| [0070-climbing-stairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0070-climbing-stairs) |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
| [1013-fibonacci-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1013-fibonacci-number) |
| [1515-find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1515-find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k) |
| [2610-closest-prime-numbers-in-range](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2610-closest-prime-numbers-in-range) |
## Combinatorics
|  |
| ------- |
| [0062-unique-paths](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0062-unique-paths) |
## Graph
|  |
| ------- |
| [2201-valid-arrangement-of-pairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2201-valid-arrangement-of-pairs) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [3189-find-champion-ii](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3189-find-champion-ii) |
| [3439-find-minimum-diameter-after-merging-two-trees](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3439-find-minimum-diameter-after-merging-two-trees) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
## Shortest Path
|  |
| ------- |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
## Eulerian Circuit
|  |
| ------- |
| [2201-valid-arrangement-of-pairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2201-valid-arrangement-of-pairs) |
## String Matching
|  |
| ------- |
| [1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1566-check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0070-climbing-stairs) |
| [1013-fibonacci-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1013-fibonacci-number) |
## Recursion
|  |
| ------- |
| [1013-fibonacci-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/1013-fibonacci-number) |
## Bit Manipulation
|  |
| ------- |
| [0268-missing-number](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0268-missing-number) |
## Queue
|  |
| ------- |
| [0239-sliding-window-maximum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0239-sliding-window-maximum) |
## Monotonic Queue
|  |
| ------- |
| [0239-sliding-window-maximum](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0239-sliding-window-maximum) |
## Bucket Sort
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
## Quickselect
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/0347-top-k-frequent-elements) |
## Number Theory
|  |
| ------- |
| [2610-closest-prime-numbers-in-range](https://github.com/VarsKhushi/DSA-Task-Khushi-Varshney-2215000913-Batch2/tree/master/2610-closest-prime-numbers-in-range) |
<!---LeetCode Topics End-->