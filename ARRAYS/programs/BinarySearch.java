public class BinarySearch{
    public static void main(String args[]){
        int numbers[]= {12,23,34,45,556,67,78};
        int key = 56;
        System.out.print(binarySearchFun(numbers,key));
    }
    static int binarySearchFun(int numbers[], int key){
        // variables
        int start = 0, end = numbers.length-1,mid;
        // Traversing the array and check....
        for(int i =0;i<numbers.length;i++){
            // calculate the mid
            mid = (start + end)/2;
            // check if the mid element is matched or not
            if(numbers[mid] == key){
                return mid;
            }
            // now if the key is not equal to mid if the key is grater than mid ...
            if(numbers[mid] < key ){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}