class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       int hash1[]=new int[26];
       int hash2[]=new int[26];
       for(int i=0;i<s.length();i++){
        hash1[s.charAt(i)-'a']++;
       }
       for(int j=0;j<t.length();j++){
        hash2[t.charAt(j)-'a']++;
       }
       for(int k=0;k<26;k++){
        if(hash1[k]!=hash2[k]) return false;
       }
       return true;
    }
}