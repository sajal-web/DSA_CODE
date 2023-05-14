import java.util.*;
public class ArrayCreation{
    public static void main(String args[]){
        int marks[] = new int[50];// array memory allocation
        // creation of array
        int numbers[] =  {12,34,45,56}; // creation with memory allocation
        String fruits[] = {"Mango","Apple","Graps"};

        // Input / Output in array
        // 1. Input
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        // 2. output 
        System.out.print(marks[0]+" , "+marks[1]+"  , "+marks[2]);
    }
}