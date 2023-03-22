package Practice_Quesion.Array;

import java.util.Arrays;

public class TwoArray {
    public static void main(String[] args) {
     Object o[]={1,2,3,4,5};
     Object i[]={1,2,3,4,5};
     Object a[]={2,3,4,5,7};


     Arrays.sort(o);
     Arrays.sort(i);

     boolean arr=Arrays.equals(o, i);
     System.out.println("Array o and i are equal :-"+arr);
     
     boolean str=Arrays.equals(i, a);
     System.out.println("Array i and a are equal :- "+str);
    }

    
}
