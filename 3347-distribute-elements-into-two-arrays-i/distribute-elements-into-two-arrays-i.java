class Solution {
    public int[] resultArray(int[] nums) {
        int i=0,j=1;
        int count=0;
        while(i<nums.length-1 && j<nums.length-1){
            if(nums[i]>nums[j]){
                count++;
                i=Math.max(i,j)+1;
            }
            else
                j=Math.max(i,j)+1;
        }
      
        int[] op=new int[nums.length];
        i=0;j=count+1;
        op[0]=nums[0];
        op[j]=nums[1];
        for(int k=2;k<nums.length;k++){
            if(op[i]>op[j])
                op[++i]=nums[k];
            else
                op[++j]=nums[k];

        }
        return op;
    }
}