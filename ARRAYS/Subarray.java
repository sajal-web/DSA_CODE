public class Subarray{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
    static void printSubArray(int numbers[]){
        // here we are using 3 nested loop to get our subarray 
        // first loop or the outer loop is for geting the start index
        for(int i = 0;i<numbers.length;i++){
            // secound loop or first inner loop is for getting the ending index
            for(int j =i;j<numbers.length;j++){
                // third loop to print the subarrays
                for(int k = i;k<j;k++){
                    System.out.print(numbers[k]+"  ");
                }
                System.out.println();
            }
        }
    }
}