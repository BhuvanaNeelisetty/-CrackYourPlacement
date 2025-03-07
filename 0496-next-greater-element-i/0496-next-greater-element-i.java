class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] res=new int[n1];
        Stack<Pair<Integer,Integer>> st=new Stack<>();
        Map<Integer,Integer> nextGreatestMap=new HashMap<>();
        for(int i=n2-1;i>=0;i--){
            int current=nums2[i];
            while(!st.isEmpty() && st.peek().getKey()<=current){
                st.pop();
            }
            int nextgreater=st.isEmpty()?-1:st.peek().getKey();
            nextGreatestMap.put(current,nextgreater);
            st.push(new Pair<>(current,nextgreater));
        }
        for(int i=0;i<n1;i++){
            res[i]=nextGreatestMap.get(nums1[i]);
        }
        return res;
    }
}