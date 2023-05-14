public class LinearSearch{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        int key = 10;
       System.out.print(LinearSearchFunction(numbers,key));
    }
    static int LinearSearchFunction(int numbers[],int key){
        // Traversing and checking the key 
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
}