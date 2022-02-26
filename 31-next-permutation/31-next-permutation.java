class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length ==0 )
              System.out.println(nums.length);
        if(nums.length ==0 || nums.length == 1) 
            System.out.println(nums[0]);
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        
        if(i>=0){
            int j= nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums, i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
        System.out.println(nums);       
    }
    
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverse(int nums[],int i,int j){
        while(i<=j) swap(nums,i++,j--);
    }
}