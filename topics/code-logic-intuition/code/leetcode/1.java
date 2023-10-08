// 387. https://leetcode.com/problems/first-unique-character-in-a-string/description/

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> frequency = new HashMap<>();

        for(int index = 0; index<s.length(); index++) {
            frequency.put(s.charAt(index),frequency.getOrDefault(s.charAt(index),0)+1);
        }

        for(int index = 0; index<s.length(); index++) {
            if(frequency.get(s.charAt(index)) == 1) {
                return index;
            }
        }
        
        return -1;
    }

}