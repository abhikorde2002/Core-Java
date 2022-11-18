package Arrays.Search;

public class linear {
    public static void main(String[] args) {
        int arr[]={12,23,34,56};
        int key=56;
        int index=Linear(arr, key);
       // System.out.println(index);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Index found at index :- "+index);
        }
    }
    static int Linear(int arr[],int key){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;       
    }

}
