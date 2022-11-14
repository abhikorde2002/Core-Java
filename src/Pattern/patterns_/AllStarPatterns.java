package Pattern.patterns_;

public class AllStarPatterns {
    public static void main(String[] args) {
        int num=5;

    }
    static void pattern(int num){
        for(int row=0;row< num;row++){
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
    for(int row=0;row< num; row++){
        for(int col=0;col<num-row;col++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
/*
*****
****
***
**
*
 */
static void pattern2(int num){
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

static void pattern3(int num){
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

  static void pattern4(int num){
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
}
