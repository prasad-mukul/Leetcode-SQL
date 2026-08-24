class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();

        for(int n1 : nums1){
            for(int n2 : nums2){
                if(n1 == n2){
                    ans.add(n1);
                }
            } 
        }
        int[] arr = new int[ans.size()];
        int i = 0;
        for(int n : ans){
            arr[i++] = n;
        }
        return arr;
    }
}