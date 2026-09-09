class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int res[] = new int[n+n];
        for(int i =0 ; i<res.length ; i++){
            res[i] = nums[i%n];
        }
        return res;
    }
}