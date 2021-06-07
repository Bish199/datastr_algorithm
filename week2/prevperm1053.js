/**
 * @param {number[]} arr
 * @return {number[]}
 */
 var prevPermOpt1 = function(arr) {
    let idx=-1;
    for(let i=arr.length-1;i>=0;i--){
        if(arr[i]<arr[i-1]){
            idx=i-1;
            break;
        }
    }
    if(idx===-1)return arr;
    for(let j=arr.length-1;j>=0;j--){
        if((arr[j]<arr[idx]) && (arr[j]!=arr[j-1])){
            swap(arr,j,idx);
            break;
        }
    }
    function swap(arr,j,idx){
    let temp=arr[j];
    arr[j]=arr[idx];
    arr[idx]=temp;
    }
    
    return arr;
    
};