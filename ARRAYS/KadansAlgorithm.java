public class KadansAlgorithm{
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadansAlgo(numbers);
    }
    static void kadansAlgo(int numbers[]){
        // declare the necessary variables
        int currentSum = 0;
        int maxSum  = Integer.MIN_VALUE;
        // now traverse the array and calculate currentsum and compaire with maxsum and store 
        // max value into maxSum variable
        for(int i =0;i<numbers.length;i++){
            // calculate the currentsun
            currentSum += numbers[i];
            // now check if the currentSum less then 0 if less then, currentSum will be 0
            if(currentSum < 0){
                currentSum = 0;
            }
            // we got the value of currentsum now lets compair with maxsum and get the max value to maxSum
            maxSum = Math.max(currentSum,maxSum);

        }
        // print maxSum
        System.out.print(maxSum);
    }
}