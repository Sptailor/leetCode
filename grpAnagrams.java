// Groups a list of strings into lists of anagrams using a HashMap.
// Sorts each string alphabetically to use as a key for grouping.
// Stores original strings in lists mapped to their sorted form.
// Returns all grouped anagram lists as a list of lists.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();


        for( String str:strs){
           char []strArray=str.toCharArray();
            Arrays.sort(strArray);
            String sorted=new String(strArray);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(str);
           
        }

        return new ArrayList<>(map.values());      
}
}