/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
 var rotate = function(matrix) {
    
    //find transpose of the matrix(swapping)
    for(let i=0;i<matrix.length;i++){
        for(let j=i;j<matrix[0].length;j++){
            let temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    
    
    //reverse rows(swapping)
    
    for(let k=0;k<matrix.length;k++){
        let i=0,j=matrix[k].length-1;    
        while(j>i){
            let temp=matrix[k][i];
            matrix[k][i]=matrix[k][j];
            matrix[k][j]=temp;
            i++;
            j--;
                
        
    }
        
    }    
    
};