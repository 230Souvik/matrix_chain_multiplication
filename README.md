# matrix_chain_multiplication

Matrix Chain Multiplication is an algorithm that is applied to determine the lowest cost way for multiplying matrices. The actual multiplication is done using the standard way of multiplying the matrices, i.e., it follows the basic rule that the number of rows in one matrix must be equal to the number of columns in another matrix. Hence, multiple scalar multiplications must be done to achieve the product.

C[i,j]={0ifi=jmini≤k<j{C[i,k]+C[k+1,j]+di−1dkdjifi<j
