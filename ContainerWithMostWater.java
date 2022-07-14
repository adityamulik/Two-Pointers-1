class ContainerWithMostWater {
		/*
		 * Two pointers 
		 * O(n)Time Complexity
		 */
    public int maxArea(int[] height) {
        // base case
        if (height.length == 0) return 0;
        
        // logic - two pointers
        
        int area = Integer.MIN_VALUE;
        int p1 = 0, p2 = height.length - 1;
        
        while (p1 <= p2 && p1 >= 0 && p2 < height.length) {
            int h = Math.min(height[p1], height[p2]);
            int b = p2 - p1;
            area = Math.max(area, h * b);
            
            if (height[p1] <= height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        
        return area;
    }
}
