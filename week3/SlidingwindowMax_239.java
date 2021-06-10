//Time complexity:-O(N)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> st=new Stack<>();
        st.push(nums.length-1);
        int[] arr=new int[nums.length];
        arr[nums.length-1]=nums.length;
        for(int i=nums.length-2;i>=0;i--){
            while(st.size()>0 && nums[i]>nums[st.peek()]) st.pop();
            if(st.size()==0) arr[i]=nums.length;
            else arr[i]=st.peek();
            st.push(i);
        }

        int[] out=new int[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++){
            int j=i;
            while(arr[j]<i+k) j=arr[j];
            out[i]=nums[j];
        }
            
        return out;
        
    }
}
