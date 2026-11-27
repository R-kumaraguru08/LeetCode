class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i=0, n1=word1.length(), n2=word2.length();
        while(i<n1 || i<n2){
            if(i<n1)
                ans+=word1.charAt(i);
            if(i<n2)
                ans+=word2.charAt(i);
            i++;
        }
        return ans;
    }
}