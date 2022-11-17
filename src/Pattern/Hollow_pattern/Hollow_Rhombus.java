package Pattern.Hollow_pattern;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        rhombus_hollow(4, 5);
    }
    static void rhombus_hollow(int totalrow,int totalcollum){
        for(int i=1;i<=totalrow;i++){
            for(int space=1;space<=totalrow-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalcollum;j++){
                if(i==1 || i==totalrow || j==1 || j==totalcollum ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
   *****
  *   *
 *   *
*****
         */
    }
}
