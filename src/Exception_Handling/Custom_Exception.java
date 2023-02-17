package Exception_Handling;

import String.Str;

class Custom_Exception {
   int age =16;


void display(){
    try{
        if(age<18){
            throw new underAgeException();
        }

    }
    catch (underAgeException e){
        System.out.println(e.getMessage());
    }
    try{
         if(age>60){
            throw new OverAgeException();
        }
    }
    catch (OverAgeException e){
        System.out.println(e.getMessage());
    }
        {
        System.out.println("Hello");
    }
   }
}

class underAgeException extends Exception{
    public String getMessage(){
        return "age less than 18";
    }
}

class OverAgeException extends Exception{
    public String getMessage(){
        return "age is grater than 60";
    }
}
class RTO{
    public static void main(String[] args) {
        Custom_Exception exp=new Custom_Exception();
        exp.display();
    }
}