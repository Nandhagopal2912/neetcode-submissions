class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int max =0;
        int count=1;
        for(int num : nums){
            map.add(num);
        }

        for(int num : map){
            if(!map.contains(num-1)){
                count =1;
                int curr = num;

                while(map.contains(curr+1)){
                    count++;
                    curr++;
                }
                max = Math.max(max,count);
            }

        }
        return max;
    }
}
