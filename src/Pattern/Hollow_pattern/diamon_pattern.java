package Pattern.Hollow_pattern;

public class diamon_pattern {
    public static void main(String[] args) {
        invers_peramid(4);
    }
    static void peramid(int num){
        for(int row=1;row<=num;row++){
            for(int spaces=1;spaces<=num-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int )
      /*
   *
  ***
 *****
*******
       */  
    }
    
    static void invers_peramid(int num){
        for(int row=num;row>=1;row--){
            for(int spaces=1;spaces<=num-row;spaces++){
                System.out.print("-");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
*******
 *****
  ***
   *
         */
    
    

    } 
    static void diamon(int num){ 
        for(int row=1;row<=num;row++){
            for(int spaces=1;spaces<=num-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=num;row>=1;row--){
            for(int spaces=1;spaces<=num-row;spaces++){
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
*******
 *****
  ***
   *
       */
    }

