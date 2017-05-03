public class Solution {
    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        // write your code here
        if (heights.length==0){return 0;}
        
        int left=0;
        int right=heights.length-1;
        
        int maxArea=0;
        
        while (left<=right){
            int a=area(heights,left,right);
            maxArea=Math.max(a,maxArea);
            
            if (heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return maxArea;
    }
    
    public int area(int [] array, int i, int j){
        int width=j-i;
        int height=Math.min(array[i],array[j]);
        return width*height;
    }
}
