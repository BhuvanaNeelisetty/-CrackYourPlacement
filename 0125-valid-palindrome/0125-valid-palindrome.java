class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}