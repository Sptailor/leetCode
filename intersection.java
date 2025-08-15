
//Finds common integer keys between two sets and returns them as an array
//creates two maps to only look at unique values
//loops over smaller map
//converts arrayList to array


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();

        for (int num : nums1) {
            map1.add(num);
        }
        for (int num : nums2) {
            map2.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();

         if (map1.size() > map2.size()) {
            HashSet<Integer> temp = map1;
            map1 = map2;
            map2 = temp;
        }
        for (int key : map1) {
            if (map2.contains(key)) {
                list.add(key);
            }
        }


        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}