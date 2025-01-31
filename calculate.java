
import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("enter the operator(+,-,*,/):");
        char op= sc.next().charAt(0);
        int a=0;
        switch (op){
            case'+':
            a=num1+num2;
            break;
            case'-':
            a=num1-num2;
            break;
            case'*':
            a=num1*num2;
            break;
            case'/':
            a=num1/num2;
            default:
            System.out.println("you enter wrong input");
        }
        System.out.println("the final result:");
        System.out.println(num1+" "+op+" "+num2+"="+a);
    }
}
    

