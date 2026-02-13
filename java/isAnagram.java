import java.util.HashMap;

/**
 * by Suhail Tailor
 * Solution to determine if two strings are anagrams.
 * Uses two HashMaps to count character frequencies and compares them.
 * Returns true if both strings have identical character counts, false otherwise.
 */
class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length()!=t.length())return false;//quick check
       HashMap <Character,Integer>sMap=new HashMap<>();//map for string s
       HashMap <Character,Integer>tMap=new HashMap<>();//map for string t

       char[]sArray=s.toCharArray();//convert strings to char arrays
       char[]tArray=t.toCharArray();

       for(char c: sArray){//populate maps with char counts
       sMap.put(c,sMap.getOrDefault(c,0)+1);//if char exists increment count else set to 1
       }
       for(char a: tArray){//populate maps with char counts
        tMap.put(a,tMap.getOrDefault(a,0)+1);//if char exists increment count else set to 1
       }

       return sMap.equals(tMap);


    }
}