package Pattern.patterns_;

public class Practice {
    public static void main(String[] args) {
        // pat(5);
        // pat1(5);
        // pat2(4);
        // patt(5);
        // pattern1(5);
        // // diamond(5);
        // patterns(5);
        // numbers(5);
        hollow(5, 4);
    }

    static void pat(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<row;col++){
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
     */

    static void pat1(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
*****
*****
*****
*****
*****
     */

     static void pat2(int n){
        for(int row=0;row<=n;row++){
            for(int col=n-row;col>=0;col--){
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

      static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
      }
      /*
     *
    ***
   *****
  *******
 *********
       */

       static void pattern(int n){
         for(int i=0;i<=n;i++){
            for(int space=0;space<=i;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=n-i;col++){
                System.out.print("* ");
            }
            System.out.println();
         }
       }
       /*
 ******
  *****
   ****
    ***
     **
      *
        */
       
        static void pattern1(int n){
            for(int i=0;i<=n;i++){
               for(int space=0;space<=i;space++){
                   System.out.print(" ");
               }
               for(int col=0;col<=n-i;col++){
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
     
      static void diamond(int n){
        for(int row=0;row<=2*n;row++){
            int totalcollum= row>n ? 2*n -row : row; 
            int space=n-totalcollum;
            for(int sp=0;sp<=space;sp++){
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

    
    static void patterns(int n){
        for(int row=0;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    
    static void numbers(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                 System.out.print(((row-col )% 2 == 1) ? "0" : "1" );
            }
            System.out.println();
        }
    }
    /*
1
01
101
0101
10101
     */

    static void hollow(int totalcollum,int totalrow){
        for(int i=1;i<=totalrow;i++){
            for(int col=1;col<=totalcollum;col++){
                if(i==1 || i==totalrow || col==1 ||col==totalcollum ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
    }
    /*
*****
*   *
*   *
*****
     */

    
    }
