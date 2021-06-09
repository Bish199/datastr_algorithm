//Time Complexity: O((m+n)log(m+n))
 var findMedianSortedArrays = function(nums1, nums2) {
    let num3=[];
    num3=nums1.concat(nums2);
    num3.sort((a,b)=>a-b);
    if(num3.length%2===0)return (num3[num3.length/2]+num3[(num3.length/2)-1])/2;
    let x=num3.length/2;
    x=Math.floor(x);
	return num3[x];
    
};