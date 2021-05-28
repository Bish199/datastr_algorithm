//Time Complexity O(N), Space O(N)
var productExceptSelf = function(nums) {
    res=[];
    res[0]=1;
    for(let i=1;i<nums.length;i++) res[i]=nums[i-1]*res[i-1];
    let right=1;
    for(let i=nums.length-1;i>=0;i--){
        res[i]=right*res[i];
        right=right*nums[i];
    }
    return res;
};