class Solution {
    public int missingNumber(int[] nums) {
        int total =0;
        int sum =0;
        int n = nums.length;
        total = n*(n+1)/2;
        for(int c : nums){
            sum+=c;
        }
        return total-sum;
        
        
    }
}
