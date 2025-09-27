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
        HashMap<String,ArrayList<String>>map=new HashMap<>();//map to store sorted string as key and list of anagrams as value


        for( String str:strs){//loop over input strings
           char []strArray=str.toCharArray();//convert string to char array
            Arrays.sort(strArray);//sort char array
            String sorted=new String(strArray);//convert sorted char array back to string

            if(!map.containsKey(sorted)){//check if map contains sorted string
                map.put(sorted,new ArrayList<String>());//if not, add it with an empty list
            }
            map.get(sorted).add(str);//add original string to the corresponding list

        }

        return new ArrayList<>(map.values());      //return all lists of anagrams
}
}