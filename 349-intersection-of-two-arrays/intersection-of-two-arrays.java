class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(!l.contains(nums2[j])&&nums1[i]==nums2[j])l.add(nums2[j]);
            }
        }
        int []n=new int[l.size()];
        for(int i=0;i<l.size();i++)n[i]=l.get(i);
        return n;
    }
}