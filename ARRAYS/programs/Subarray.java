public class Subarray{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
    static void printSubArray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        // here we are using 3 nested loop to get our subarray 
        // first loop or the outer loop is for geting the start index
        for(int i = 0;i<numbers.length;i++){
            
            // secound loop or fi rst inner loop is for getting the ending index
            for(int j =i;j<numbers.length;j++){
                currentSum = 0;
                // third loop to print the subarrays
                for(int k = i;k<=j;k++){
                    currentSum+=numbers[k];
                }
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
               
            }
        }
     System.out.print(maxSum);  
    }
}