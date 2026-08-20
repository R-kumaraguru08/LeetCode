class Solution {
    public int[] resultArray(int[] nums) {
        int[] out = new int[nums.length];
        int count = 0,j=1,i=0;
        while(i<nums.length-1 && j<nums.length-1){
            if(nums[i]>nums[j]){
                count++;
                i=Math.max(i,j)+1;
            }
            else{
                j=Math.max(i,j)+1;
            }
        }
        j=count+1;i=0;
        out[i] = nums[0];out[j] = nums[1];
        for(int k=2;k<nums.length;k++){
            if(out[i]<out[j]){
                out[++j] = nums[k];
            }
            else{
                out[++i] = nums[k];
            }
        }
        return out;
    }
}