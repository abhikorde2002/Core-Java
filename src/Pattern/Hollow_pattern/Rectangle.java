package Pattern.Hollow_pattern;

import classcomponent.Methodes.staticMethodes;

class Rectangle{
      public static void main(String[] args) {
        
        Zero_one(5);
       pattern_hollow(5,4);
      }

      static void pattern_hollow(int totalcol,int totalrow){
           for(int row=1;row<=totalrow;row++){
            for(int col=1;col<=totalcol;col++){
                 if(row==1 || row== totalrow || col==1 || col==totalcol ){
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
  
  static void Zero_one(int num){
  
    for(int row=1;row<=num;row++){
      for(int col=1;col<=row;col++){
        int sum=row+col;
         System.out.print((sum%2==0)?"1" :"0");
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
}