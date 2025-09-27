//Suhail Tailor
//Finds common integer keys between two sets and returns them as an array
//creates two maps to only look at unique values
//loops over smaller map
//converts arrayList to array

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> map1 = new HashSet<>();//map for nums1
        HashSet<Integer> map2 = new HashSet<>();//map for nums2 

        for (int num : nums1) {//populate maps with unique values
            map1.add(num);
        }
        for (int num : nums2) {//populate maps with unique values
            map2.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();//list to store intersection values

         if (map1.size() > map2.size()) {//swap to loop over smaller map
            HashSet<Integer> temp = map1;
            map1 = map2;
            map2 = temp;
        }
        for (int key : map1) {//loop over smaller map
            if (map2.contains(key)) {
                list.add(key);
            }
        }


        int[] result = list.stream().mapToInt(Integer::intValue).toArray();//convert arrayList to arrays
        return result;
    }
}