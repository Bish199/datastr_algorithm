//Time Comp->O(logn) Space->O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a=seachLeftIdx(nums,target);
        int b=searchRightIdx(nums,target);
        return new int[]{a,b};
    }
    
    public int seachLeftIdx(int[] nums,int target){
        
        int low=0;
        int high=nums.length-1;int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target) high=mid-1;
            else low=mid+1;
            
            if(nums[mid]==target) index=mid;
        }
        return index;
        
    }
    
    public int searchRightIdx(int[] nums,int target){
        
        int low=0;
        int high=nums.length-1;int index=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target) low=mid+1;
            else high=mid-1;
            
            if(nums[mid]==target) index=mid;
        }
        return index;
        
    }
    
}
