package Pattern.Patterns_with_spaces;

public class Pattern1 {
    public static void main(String[] args) {
        int num=5;
        pattern4(num);
    }
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
    static void pattern1(int num){
        for(int row=num ; row>=1 ;row--){
            for(int space=num;space>row;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
        System.out.println();    
        }
    }
    /*
     * * * * * 
      * * * *
       * * *
        * *
         *
     */
    static void pattern2(int num){
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
    static void patterns3(int num){
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
    static void pattern4(int num){
        for(int row=0;row<num;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=row;col<num;col++){
                System.out.print("* ");
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
}
