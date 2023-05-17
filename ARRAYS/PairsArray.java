public class PairsArray{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        pairArrayFun(numbers);

    }
    static void pairArrayFun(int numbers[]){
        // here we are going to use nested loop 
        // first loop is for the pairing number
        for(int i = 0;i<numbers.length;i++){
            // inner loop for print the numbers
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+"), ");
            }
        System.out.println();
        }
    }
} 