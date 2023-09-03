public class q1{
    public static void main(String args[]){
        int nums[] = {1,1,2,3,5};
        System.out.print(checkDouble(nums));
    }
  static boolean  checkDouble(int arrayList[]){
        for(int  i=0;i<arrayList.length;i++){
            for(int j = i+1;j<arrayList.length;j++){
                if(arrayList[i] == arrayList[j]){
                    return true;
                }
            }
        }
        return false;
    }
}