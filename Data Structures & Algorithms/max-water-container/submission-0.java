class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;
        int area =0;

        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int width = right-left;
            int current_area = height*width;

            area = Math.max(current_area, area);

            if(heights[left]<heights[right]) left++;
            else right--;
        }

        return area;
    }
}
