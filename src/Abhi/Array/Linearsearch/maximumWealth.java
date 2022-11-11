package Kunal.Array.Linearsearch;

public class maximumWealth {
    public static void main(String[] args) {
         int accounts[][]={{1,2,3},
                 {2,5,7},
                 {5,10,5}};
        System.out.println(maximum(accounts));
    }
    static int maximum(int [][]accounts){

        int ans=Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++){
            //when you start a new col, take a new sum for that row
            int sum=0;

            for (int account=0;account<accounts[person].length;account++){
                sum=sum+accounts[person][account];
            }
        if ( sum > ans){
            ans = sum;
        }
        }
        return ans;
    }
}

