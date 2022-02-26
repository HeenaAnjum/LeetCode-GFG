class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                r++;
            else if(nums[i]==1)
                w++;
            else
                b++;
        }
        
        for(int i=0;i<r;i++){
             nums[i]=0;
            j++;
        }
           
        for(int i=0;i<w;i++){
            nums[j]=1;
            j++;
        }
            
        for(int i=0;i<b;i++){
            nums[j]=2;
            j++;
        }
        System.out.println(nums);
    }
}