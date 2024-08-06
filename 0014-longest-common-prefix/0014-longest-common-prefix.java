class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        if(strs.length==1) return strs[0];
        int minLen=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen) minLen=strs[i].length();
        }
        for(int i=0;i<minLen;i++){
            char current=strs[0].charAt(i);
            for(String str:strs){
                if(str.charAt(i)!=current){
                    return str.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLen);
    }
}