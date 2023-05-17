public class PrefixSubarraySum{
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        prefixSubarraySumCalculateFun(numbers);
    
    }
    static void prefixSubarraySumCalculateFun(int numbers[]){
        // declare necessary variables
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // create the prefix subarray
        int prefix[] = new int[numbers.length];
        // update values in prefix array
        prefix[0] = numbers[0];
        // now let's create a loop to update values in the prefix array
        for(int i=1;i<prefix.length;i++){
            // start from index 1 because we know the index 0 value of prefix is numbers 0 index value
            prefix[i] = prefix[i-1] + numbers[i];
            // prefix array created and value are added to the array now lets go to next step
        }

        // now let's find out the start and ending index by using nested loop 
        for(int i = 0 ;i<numbers.length;i++){
            // get the ending index in the inner loop
            for(int j = i;j<numbers.length;j++){
                // now calculate the subarray sun by using prefix array
                currentSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            }
            // now compair the values which is the max
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.print(maxSum);
    }
}