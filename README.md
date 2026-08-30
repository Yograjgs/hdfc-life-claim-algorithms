**Time & Extra Space Complexity**

| Method / Algorithm          |         Time | Extra Space |
| --------------------------- | -----------: | ----------: |
| Recursive Binary Search     |   `O(log n)` |  `O(log n)` |
| Brute-Force Pair Sum        |      `O(n²)` |      `O(1)` |
| Two-Pointer Pair Sum        | `O(n log n)` |      `O(n)` |
| Palindrome Checker          |       `O(n)` |      `O(n)` |
| Array Partition             |       `O(n)` |      `O(1)` |
| Maximum Sliding Window Sum  |       `O(n)` |      `O(1)` |
| Longest Unique Substring    |       `O(n)` |      `O(n)` |
| Claim Amount Store — Add    |       `O(1)` |      `O(1)` |
| Claim Amount Store — Insert |       `O(n)` |      `O(1)` |
| Claim Amount Store — Delete |       `O(n)` |      `O(1)` |


1,000,000 Daily Claim Amounts

For 1,000,000 claim amounts, I would use the two-pointer pair-sum approach rather than brute force. 
Brute force takes O(n²) time, which means an enormous number of pair comparisons at this scale. 
The two-pointer approach first sorts the claim amounts in O(n log n) and then scans them in O(n). Therefore, its overall complexity is O(n log n), making it far more practical for large daily datasets. The trade-off is the additional O(n) extra space in the current implementation because it creates a sorted copy.

This wording is suitable for your project because it explains why the optimized algorithm is preferable in the actual claim-amount scenario, rather than just stating the Big-O values.
