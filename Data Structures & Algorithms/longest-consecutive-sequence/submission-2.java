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

                while(map.contains(num+count)){
                    count++;
                }

                max = Math.max(count,max);
            }

        }
        return max;
    }
}
