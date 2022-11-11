package Kunal.Array.Linearsearch;
//search in arr :return index if item found.
public class search {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int key=40;
        System.out.println(ser(arr,key));
        System.out.println(ser1(arr,key));
        System.out.println(ser2(arr,key));
    }



    //search target and return element
    static int ser1(int arr[],int key){
        if (arr.length==0){
            return -1;
        }

        for (int i=0;i< arr.length;i++){
            if (key==arr[i]){
                return arr[i];
            }

        }
        return -1;
    }

    //search target and return true or false
    static boolean ser2(int arr[],int key){
        for (int element:arr) {
            if (element==key){
                return true;
            }
        }
        return false;
    }

    //search target and return index
    static int ser(int arr[],int key){
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i< arr.length;i++){
            if (key==arr[i]){
                return i;
            }

        }
        return -1;
    }

}

