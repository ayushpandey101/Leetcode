class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int i = 0; i < dimensions.length; i++) {
            double diagonal = Math.sqrt(Math.pow(dimensions[i][0], 2) + Math.pow(dimensions[i][1], 2));
            int area = dimensions[i][0] * dimensions[i][1];
            
            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        
        return maxArea;
    }
}