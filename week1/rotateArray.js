//Time Complexity O(N) Space-> O(1)
//leetcode submit- success
var rotate=function(nums,k){
    k=k%nums.length;
    nums=reverse(nums,0,nums.length-1);
    nums=reverse(nums,0,k-1);
    nums=reverse(nums,k,nums.length-1)
    return nums;
};

function reverse(nums,a,b){
    while(a<b){
        let temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        a++;
        b--;
    }
    return nums;
}

let nums=[1,2,3,4,5,6,7]
let out=rotate(nums,3);
console.log(out);