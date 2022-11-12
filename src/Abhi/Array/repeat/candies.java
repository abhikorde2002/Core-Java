package Abhi.Array.repeat;

import java.util.ArrayList;
import java.util.List;

public class candies {
    public static void main(String[] args) {
      int candies[]={3,4,5,2,1};
      int extra=3;
        System.out.println(Kids(candies,extra));
    }
    static List<Boolean> Kids(int []candie, int extra){
        int max=Integer.MIN_VALUE;

        ArrayList<Boolean> list = new ArrayList<>();
        for (int i=0;i< candie.length;i++){
            if (candie[i]>max){
                max=candie[i];
            }
        }
        for (int i=0;i< candie.length;i++){
            if (candie[i]+extra >= max){
                list.add(i,true);
            }
            else {
                list.add(i,false);
            }
        }
        return list;
    }
}
