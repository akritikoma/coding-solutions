# Lowercase to Uppercase

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s containing only lowercase English letters, convert all its characters to uppercase and return the resulting string.

 **Examples:** 

```
Input: s = "geeks"
Output: GEEKS
Explanation: All lowercase characters are converted to their corresponding uppercase characters.
```

```
Input: s = "geeksforgeeks"
Output: GEEKSFORGEEKS
Explanation: Each lowercase character in the string is converted to uppercase.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T10:49:00.595Z  

```java
class Solution {
    public String toUpper(String s) {
        // code here
        
        return s.toUpperCase();
        //  String ans = "";

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     if (ch >= 'a' && ch <= 'z') {
        //         ch = (char)(ch - 32);
        //     }

        //     ans += ch;
        // }

        // return ans;
    }
}
        


```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/1)