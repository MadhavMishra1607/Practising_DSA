class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int left_intersection_point = Math.max(ax1,bx1);
        int right_intersection_point = Math.min(ax2,bx2);
        int top_intersection_point = Math.min(ay2,by2);
        int bottom_intersection_point = Math.max(ay1,by1);
        int sum_area = (bx2-bx1)*(by2-by1) + (ax2-ax1)*(ay2-ay1);
        if((right_intersection_point - left_intersection_point)<0 || (top_intersection_point - bottom_intersection_point)<0){
            return sum_area;
        }
        return sum_area - ((right_intersection_point - left_intersection_point)*(top_intersection_point - bottom_intersection_point));
    }
}
