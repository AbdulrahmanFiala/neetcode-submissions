class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int l = 0, r = heights.length - 1;
        while(l < r){
            int area  = 0;
            area = Math.min(heights[l], heights[r]) * (r - l);
            res = Math.max(area, res);
            if(heights[l] < heights[r]) l++;
            else if(heights[l] >= heights[r])r--;
        }
        return res;
    }
}
