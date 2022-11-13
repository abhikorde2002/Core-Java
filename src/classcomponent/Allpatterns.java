package classcomponent;

public class Allpatterns {
    public static void main(String[] args) {
        int num=5;
        pattern8(num);
    }    
    static void pattern(int num){
        for (int row = 0; row <num; row++) {
            for(int col=0;col<=row;col++){
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
* * * * *  */
static void pattern1(int num){
    for(int row=num ; row>=1 ;row--){
        for(int space=num;space>=row;space--){
            System.out.print("a ");
        }
        for(int col=1;col<=row;col++){
            System.out.print("*  ");
        }
    System.out.println();    
    }
}
/*
a *  *  *  *  *  
a a *  *  *  *
a a a *  *  *
a a a a *  *
a a a a a *
 */

 static void pattern2(int num){
    for(int row=0;row<=num;row++){
        for(int col=1;col<=((num+1)-row);col++){
            System.out.print("* ");
        }
        System.out.println();
    }
 }
 /*
* * * * * * 
* * * * *
* * * *
* * *
* *
*
  */

  static void pattern3(int num){
    for(int row=0;row<=num;row++){
        for(int col=0;col<=num;col++){
            System.out.print("* ");
        }
        System.out.println();
    }
  }
  /*
* * * * * * 
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
   */
  static void patterns4(int num){
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

   static void patterns5(int num){
    for(int row=0;row<=2*num;row++){
        int totalcollums=row>num ? (2*num)-row :row;
        for(int col=0;col<totalcollums;col++){
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
* * * *
* * *
* *
*
    */

    static void patterns6(int num){
        for(int row=0;row<= 2*num;row++){
            int totalcollum=row>num? 2*num-row:row;
            int sp=num-totalcollum;
            for(int space=0;space<=sp;space++){
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

    static void peramid(int num){
        for(int row=0;row<=num;row++){
            for(int space=0;space<= (num-row);space++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
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
     */
    static void peramid1(int num){
        for(int row=0;row<=num;row++){
            for(int space=0;space<= (num-row);space++){
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
    static void patterns7(int num){
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

     static void peramid2(int num){
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
  static void pattern8(int num){
    for(int row=1;row<=num;row++){
        for(int col=2*(num-row);col>0;col--){
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++){
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
   */
}
