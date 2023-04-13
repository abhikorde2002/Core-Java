package Practice_Quesion.Array;

public class Duplicate_Count {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,4};
        Duplicate_Count d= new Duplicate_Count();
        d.Count(arr);
    }

     void Count(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0; 
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            System.out.println("Duplicate Count of number "+arr[i]+" "+count);
        }
    }
}
