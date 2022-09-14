import java.util.Scanner;

public class NestedSw {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int empId = s.nextInt();

        switch (empId) {

            case 1:
                System.out.println("Ted Thomas");
                break;
            case 2:
                System.out.println("Rahul Nair");
                break;
            case 3:
                System.out.println("Department");
                String dept = s.next();

                switch (dept) {

                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Network":
                        System.out.println("Network dept");
                        break;
                    default:
                        System.out.println("Enter a dept");

                }
                break;
            default:
                System.out.println("Enter a emp number");
        }
    }
}
