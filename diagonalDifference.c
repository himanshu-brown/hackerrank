int diagonalDifference(int arr_rows, int arr_columns, int** arr) {
    
    int d1=0, d2=0, i=0, j=0;
    
    while(i<arr_rows && j<arr_columns){
        d1 += arr[i++][j++];
    }
    i=0;j=arr_columns-1;
    
    while(i<arr_rows && j>=0){
        d2 += arr[i++][j--];
    }
    
    if(d1 >= d2) return d1-d2;
    return d2-d1;

}

