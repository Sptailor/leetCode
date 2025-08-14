

//By Suhail Tailor
// Finds the index of the first non-repeating character in a string.
// Uses a HashMap to count character frequencies, then returns the first index with count == 1.


class Solution {
    public int firstUniqChar(String s) {
        HashMap <Character,Integer>map=new HashMap<>();
        char[]sArr=s.toCharArray();
        for(char c: sArr){
            map.put(c,map.getOrDefault(c,0)+1);
           
        }
        for(int i=0;i<sArr.length;i++){
           if ( map.get(sArr[i]) == 1){
    
                return i;
            }
        }
        return -1;      
    }
}