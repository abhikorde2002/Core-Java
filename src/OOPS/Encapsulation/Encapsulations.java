package OOPS.Encapsulation;

public class Encapsulations {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.UserName = "Abhishek";
        bank.setPassword(12);
        bank.setLogin_Id(2343);
        System.out.println(bank.UserName + " " + bank.getLogin_Id() + " " + bank.getPassword());

    }
}

class Bank {
    public String UserName;

    private int Login_Id;

    private int password;

    public int getPassword() {
        return password;
    }

    public int getLogin_Id() {
        return Login_Id;
    }

    public void setLogin_Id(int login_Id) {
        this.Login_Id = login_Id;
    }

    public void setPassword(int password) {
        boolean isAdmin = false;
        if (!isAdmin) {
            System.out.println("No");
        } else {
            2this.password = password;
            System.out.println("You can do");
        }
    }
}
