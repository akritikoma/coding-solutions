# Ransom Note

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `ransomNote` and `magazine`, return `true` *if* `ransomNote` *can be constructed by using the letters from* `magazine` *and* `false` *otherwise*.

Each letter in `magazine` can only be used once in `ransomNote`.

 

 **Example 1:** 

```
Input: ransomNote = "a", magazine = "b"
Output: false

```

 **Example 2:** 

```
Input: ransomNote = "aa", magazine = "ab"
Output: false

```

 **Example 3:** 

```
Input: ransomNote = "aa", magazine = "aab"
Output: true

```

 

 **Constraints:** 

- 1 <= ransomNote.length, magazine.length <= 105
- ransomNote and magazine consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 46.67%)  
**Memory:** 45.6 MB (beats 98.86%)  
**Submitted:** 2026-10-31T10:40:26.480Z  

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]= new int[26];

        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i< ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';

            if(arr[index]==0){
                return false;
            }
            arr[index]--;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/ransom-note/)