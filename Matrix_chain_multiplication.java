
package matrix_chain_multiplication;
import java.util.*;
import java.lang.*;

public class Matrix_chain_multiplication {
static int f(int[] arr, int i, int j){
    
    // base condition
    if(i == j)
        return 0;
        
    int mini = Integer.MAX_VALUE;
    
    // partioning loop
    for(int k = i; k<= j-1; k++){
        
        int ans = f(arr,i,k) + f(arr, k+1,j) + arr[i-1]*arr[k]*arr[j];
        
        mini = Math.min(mini,ans);
        
    }
    
    return mini;
}


static int matrixMultiplication(int[] arr, int N){
    
    int i =1;
    int j = N-1;
    
    
    return f(arr,i,j);
    
    
}
    public static void main(String[] args) {
        // TODO code application logic here
       int arr[] = {10, 20, 30, 40, 50};
	
	int n = arr.length;
	
	System.out.println("The minimum number of operations are "+
        matrixMultiplication(arr,n));
	
    }
    
}
