class Solution {
    public int maxArea(int[] height) {
        int n =height.length;
        int maxWater=0;
        for(int i =0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int width = j - i;
                int minHeight=Math.min(height[i], height[j]);
                int area =width*minHeight;
                maxWater =Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
}
