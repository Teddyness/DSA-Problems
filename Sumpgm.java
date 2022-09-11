import java.util.Scanner;

public class Sumpgm{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num1;
        int num2;

        int sum;

        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the Second number");
        num2=sc.nextInt();

        sum=num1+num2;

        System.out.println(sum+" is the sum of two numbers");

    }
}