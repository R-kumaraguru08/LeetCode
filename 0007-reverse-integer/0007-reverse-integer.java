class Solution {
    public int reverse(int x) {
       int  y=(x>=0?x:-x);
        long rev=0;
        while(y>0){
            int digit=y%10;
            rev=rev*10+digit;
            y=y/10;
        }
         if (rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (x>=0?rev:-rev);
    }
}