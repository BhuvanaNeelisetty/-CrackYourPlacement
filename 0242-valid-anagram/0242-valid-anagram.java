class Solution {
    public static String sortString(String s1){
        char c[]=s1.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        s1=sortString(s1);
        s2=sortString(s2);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}