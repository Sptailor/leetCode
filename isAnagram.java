/**
 * by Suhail Tailor
 * Solution to determine if two strings are anagrams.
 * Uses two HashMaps to count character frequencies and compares them.
 * Returns true if both strings have identical character counts, false otherwise.
 */
class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length()!=t.length())return false;
       HashMap <Character,Integer>sMap=new HashMap<>();
       HashMap <Character,Integer>tMap=new HashMap<>();

       char[]sArray=s.toCharArray();
       char[]tArray=t.toCharArray();

       for(char c: sArray){
       sMap.put(c,sMap.getOrDefault(c,0)+1);
       }
       for(char a: tArray){
        tMap.put(a,tMap.getOrDefault(a,0)+1);
       }

       return sMap.equals(tMap);


    }
}