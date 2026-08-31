class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        int count =1;
        int n = nums.length;
        if(n<=1) return n;

        for(int i =1 ; i<n;i++){
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else if(nums[i]==nums[i-1]){
                count = count;
            }
            else{
                count=1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
