package Pattern.Hollow_pattern;

class solid_rhombus{
    public static void main(String[] args) {
        int num=5;
        rhombus(num);
    }

    static void rhombus(int num){
        for(int i=1;i<=num;i++){
            for(int space=1;space<=num-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
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
   

}