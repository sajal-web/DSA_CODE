public class LargestNumber{
    public static void main(String args[]){
        int numbers[]= {12,23,32,21,43,34,56,65,54};
        System.out.print(getLargest(numbers));
    }
    static int getLargest(int numbers[]){
        // creating largest variable assigning value as -infinity
        int largest = Integer.MIN_VALUE;
        // traverse the array and every time check if the number is grater then largest if largest then
        // store it in the largest variable and so on...
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
}