class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> l=new HashSet<>();
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums1.length;i++)m.add(nums1[i]);
        for(int i=0;i<nums2.length;i++){
            if(m.contains(nums2[i]))l.add(nums2[i]);
        }
        int []n=new int[l.size()];
        int k=0;
        for(int a:l)n[k++]=a;
        return n;
    }
}