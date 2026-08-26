class Solution {
    public int arrangeCoins(int n) {
       if(n==1) return 1;
        int i=1;
       for(i=1;n>=0;i++){
        n=n-i;
       }
        return i-2;

    }
}