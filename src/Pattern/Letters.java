package Pattern;

public class Letters {
   public static void main(String[] args) {
     pattern3(5);
   }
   static void number(int num){
    for(int i=0;i<=num;i++){
        for(int col=1;col<=num-i;col++){
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

 static void peramid(int num){
    for(int row=0;row<=num;row++){
        for(int space=0;space<=row;space++){
            System.out.print(" ");
        }
        for(int col=row;col<=2*num-row;col++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
 /*
***********
*********
*******
*****
 ***
  *
  */

  static void character(int num){
    char ch='A';
    for(int row=0;row<=num;row++){
       for(int col=0;col<=row;col++){
        System.out.print(ch++ +" ");
       }
       System.out.println();
    }
  }
  /*
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
   */

   static void characters(int num){
    for(int i=0;i<=num;i++){
        char ch='A';
        for(int col=0;col<=i;col++){
            System.out.print(ch++ +" ");
        }
        System.out.println();
    }
   }
   /*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
    */

    static void pattern1(int num){
        for(int row=0;row<=2*num;row++){
            int totalcollum= row>num ? 2*num-row : row;
            for(int col=0;col<=totalcollum;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
     */

     static void pattern2(int num){
        for(int row=0;row<=2*num;row++){
            int totalcollum=row>num ? 2*num-row : row;
            int space=num-totalcollum;
            for(int spac=0;spac<=space;spac++){
                System.out.print(" ");
            }
            for(int col=0;col<=totalcollum;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
     /* 
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
      */

      static void pattern3(int num){
        for(int row=0;row<=2*num;row++){
            int totalcollum=row>num ? 2*num-row : row;
            int space=num-totalcollum;
            for(int spac=0;spac<=space;spac++){
                System.out.print(" ");
            }
            for(int col=0;col<=totalcollum;col++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     /*
      *
     **
    ***
   ****
  *****
 ******
  *****
   ****
    ***
     **
      *
      */

      static void pattern4(int num){
        for(int i=1;i<=num;i++){
            //stars -i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
     */
}
