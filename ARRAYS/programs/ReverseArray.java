public class ReverseArray{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        reverseTheArray(numbers);
        printArray(numbers);
    }
    static void reverseTheArray(int numbers[]){
        // variables 
        int start = 0, end = numbers.length-1;
        // run the loop until start   index is less then to ending index
        while(start<end){
            int temp = numbers[start];
            numbers[start]= numbers[end];
            numbers[end] = temp;
            
            start++;end--;

        }

    }
    static void printArray(int numbers[]){
        // function for print the array..
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+"  ");
        }
    }
}