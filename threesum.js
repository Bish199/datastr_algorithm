//Time Complexity O(n2) space->O(n)
function threesum(nums){
    nums=nums.sort((a,b)=>a-b);
    let result=[];
    for(let i=0;i<nums.length-2;i++){
        let left=i+1;
        let right=nums.length-1;
        while(right>left){
            let currSum=nums[i]+nums[left]+nums[right];
            if(currSum===0){
                let flag=true;
                console.log(nums[i], nums[left], nums[right]);
                for(let ar of result){
                    console.log(ar)
                    if(ar[0]===nums[i] && ar[1]===nums[left] && ar[2]===nums[right]) flag=false;
                }
                if(flag){
                    result.push([nums[i],nums[left],nums[right]])
                }
                left++;
                right--;
            }
            else if(currSum>0)
                right--;
            else
                left++
        }
    }
    return result;
}



let out =threesum([-1,0,1,2,-1,-4]);

