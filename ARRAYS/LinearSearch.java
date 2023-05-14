public class LinearSearch{
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};
        int key = 10;
       System.out.print(LinearSearchFunction(numbers,key));

       // Homework
       String menu[] = {"chola batora","luchi","dim toast","cha","coffee","pokora"};
       String item = "dim toast";
       System.out.print(FoundMenuIteam(menu,item));
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
    static int FoundMenuIteam(String menu[],String item){
        for(int i = 0;i<menu.length;i++){
            if(menu[i] == item){
                return i;
            }
        }
        return -1;
    }
}