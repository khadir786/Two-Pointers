package jav;

public class Container {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int area = Math.min(height[left], (height[right])) * (right-left);
            if (area > maxArea)  maxArea = area;
            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        Container con = new Container();
        System.out.println(con.maxArea(height));
    }
}