package Pattern.Pattern_with_Number;

import java.io.FileDescriptor;

public class Numbers {
    public static void main(String[] args) {
        int num=4;
        patterns(num);
    }
    static void Floyd(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print((count < 10) ? " " + count++ + " " : count++ + " ");
                if(count<=10){
                   System.out.print(count++ +" ");
                }
               
            }
            System.out.println();
        }
    }
    static void patterns(int n){
        int cou=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(cou+" ");
                cou++;
            }
            System.out.println();
        }

    }
    // pattern output
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(((i - j) % 2 == 1) ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
    // pattern output
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    static void patterns3(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" " +col);
            }
            System.out.println();
        }
      }
      /*
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
       */
      static void patterns4(int num){
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" " +row);
            }
            System.out.println();
        }
      }
      /*
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
       */
      static void peramid1(int num){
        for(int row=0;row<=num;row++){
            for(int space=0;space<= 2*num-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<= row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    /*
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
     */
    static void patterns5(int num){
        for(int row=0;row<= 2*num;row++){
            int totalcollum=row>num? 2*num-row:row;
            int sp=num-totalcollum;
            for(int space=0;space<=sp;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcollum;col++){
                System.out.print(col+"  ");
            }
            System.out.println();
        }
    }
    /*
      1
     1  2
   1  2  3
  1  2  3  4
 1  2  3  4  5
  1  2  3  4
   1  2  3
    1  2
     1
     */
    static void peramid6(int num){
        for(int row=0;row<=num;row++){
            for(int space=0;space<=num-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
     }
        
  /*
     1
    212
   32123
  4321234
 543212345
   */
  static void pattern7(int num){
    for(int row=1;row<=num;row++){
        for(int col=2*(num-row);col>0;col--){
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
  }
  /*
        1 
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
   */
  static void patterns8(int num){
    for(int row=0;row< num; row++){
        for(int col=1;col<=num-row;col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
}
/*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
 */
static void patttern9(int num){
    for(int row=0;row<= num; row++){
        for(int col=1;col<=num-row;col++){
            System.out.print((row+1)+" ");
        }
        System.out.println();
    }
}
/*
1 1 1 1 1 
2 2 2 2
3 3 3
4 4
5
 */

 static void peramid(int num){
    for(int row=0;row<=num;row++){
        for(int space=0;space<= 2*(num-row);space++){
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
            System.out.print(col+" ");
        }
        System.out.println();
    }
}
/*
           
         1 
       1 2 
     1 2 3 
   1 2 3 4 
 1 2 3 4 5 
 */
}
