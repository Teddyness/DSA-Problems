import java.util.Scanner;
public class Multiplication {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to display its table");

        int num=sc.nextInt();

        for(int i=1; i<=9; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }
    }

}
