/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

//not working
 var findMedianSortedArrays = function(nums1, nums2) {
    let shortarr,longarr;
    if(nums1.length<=nums2.length){
        shortarr=nums1;longarr=nums2;
    }else{
        shortarr=nums2;longarr=nums1;
    }
    
    let total=nums1.length+nums2.length;
    let left=0;
    let right=nums1.length-1;
    while(left<right){
        let shortpart=Math.ceil((left+right)/2);
        let shortleft=shortpart-1>=0?shortarr[shortpart-1]:Number.NEGATIVE_INFINITY;
        let shortright=shortpart<nums1.length?shortarr[shortpart]:Number.POSITIVE_INFINITY;
        
        let longpart=Math.ceil((total+1)/2)-shortpart;
        let longleft=longpart-1>=0?longarr[longpart-1]:Number.NEGATIVE_INFINITY;
        let longright=longpart<nums2.length?longarr[longpart]:Number.POSITIVE_INFINITY;
                
        if(shortleft<=longright && longleft<=shortright){
            if(total%2===0) return (Math.max(shortleft,longleft)+Math.min(shortright+longright))/2;
            else return Math.max(shortleft,longleft);
        }else if(shortleft>longright) right=shortpart-1;
        else left=shortpart+1;
    }
    
    
    return -1;
    
    
};