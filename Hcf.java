import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class Hcf {
    
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);

        int n1, n2, min, i, gcd=0, lcm;

        System.out.println("Enter first number");
        n1=s.nextInt();
        System.out.println("Enter second number");

        n2=s.nextInt();

        if(n1<n2){
            min=n1;
        }
        else{
            min=n2;
        }

        for(i=1; i<=min; i++)
        {
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        lcm=(n1*n2)/gcd;

        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
}
