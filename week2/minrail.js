function findPlatform(arr, dep, n)
{
    arr = arr.sort((a,b)=>a-b);
    dep = dep.sort((a,b)=>a-b);
    console.log(arr);
    console.log(dep);
    let plat_needed = 0,result = 0,i = 0,j = 0;
    while (i < n-1 && j < n-1)
    {
        if (arr[i] <= dep[j])
        {
            plat_needed++;
            i++;
        }
        else if (arr[i] > dep[j])
        {
            plat_needed--;
            j++;
        }
        result=plat_needed > result? plat_needed:result;
    }
    return result;
}
 
    // Driver Code
    let arr = new Array(900, 940, 950, 1440, 1500, 1800);
    let dep = new Array(1400, 1200, 1120, 1480, 1900, 2000);
    let n = arr.length;
    console.log("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));