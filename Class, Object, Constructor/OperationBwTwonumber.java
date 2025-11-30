import java.util.Scanner;
public class OperationBwTwonumber {


    float num1,num2;
    private void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :- ");
        num1 = sc.nextFloat();
        System.out.println("Enter Second number :- ");
        num2 = sc.nextFloat();
    }
    private void display(){
        System.out.println("First number is "+num1);
        System.out.println("Second number is "+num2);

    }
    void addition(){
        System.out.println("The Sum of "+num1 + " and "+num2 + " is "+(num1+num2));
    }
    void Difference(){
        float diff = Math.abs(num1 - num2);
        System.out.println("The Difference bw "+num1 + " and "+num2 + " is "+(diff));
    }
    void product(){
        System.out.println("The product of "+num1 + " and "+num2 + " is "+(num1*num2));
    }
    private void operations(){
       addition();
       Difference();
       product();
    }
    public static void main(String[] args) {
OperationBwTwonumber obj = new OperationBwTwonumber();
obj.input();
obj.display();
obj.operations();
    }
}
