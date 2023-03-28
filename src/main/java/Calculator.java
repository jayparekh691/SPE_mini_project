import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    public static final Logger logger = LogManager.getLogger(Calculator.class);
    public long fact(long i){
        logger.info("[FACTORIAL] - " + i);
        long ans=1;
        while(i>0){
            ans=ans*i--;
        }
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public double sqRoot(double num){
        logger.info("[SQUARE ROOT] - " + num);
        double ans=Math.sqrt(num);
        logger.info("[RESULT - SQUARE ROOT] - " + ans);
        return ans;
    }
    public double naturalLog(double num){
        logger.info("[NATURAL LOG] - " + num);
        double ans=Math.log(num);
        logger.info("[RESULT - NATURAL LOG] - " + ans);
        return ans;
    }
    public double power(int a,int b){
        logger.info("[POWER] - " + a +" "+b);

        double ans=Math.pow(a,b);
        logger.info("[RESULT - POWER] - " + ans);
        return ans;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int flag=1;
        System.out.println("Press anything to enter application");
        sc.nextLine();
        while(flag==1) {
            System.out.println("Chose operation to perform :");
            System.out.println("1. Square Root function ");
            System.out.println("2. Find factorial ");
            System.out.println("3. Natural Logarithm ");
            System.out.println("4. Power function ");
            System.out.println("Anything else to exit");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter a positive number to find Square root : ");
                    double num;
                    num = sc.nextDouble();
                    if (num <= 0) {
//                        System.out.println("Please enter a positive number");
                        logger.warn("Negative number not allowed "+num);
                    }else
                        System.out.println(c.sqRoot(num));
                    break;
                }
                case 2: {
                    System.out.println("Enter a positive number to find factorial: ");
                    long num;
                    num = sc.nextLong();
                    if (num <= 0){
//                        System.out.println("Please enter a positive number");
                        logger.warn("Negative number not allowed "+num);
                    }
                    else
                        System.out.println(c.fact(num));
                    break;
                }
                case 3: {
                    System.out.println("Enter a positive number to find Natural Log : ");
                    double num;
                    num = sc.nextDouble();
                    if (num <= 0){
//                        System.out.println("Natural log for negative number is Undefined");
                        logger.warn("Natural log of negative number is Undefined "+num);
                    }
                    else
                        System.out.println(c.naturalLog(num));
                    break;
                }
                case 4:{
                    System.out.println("Enter x and y to find x to the power y : ");
                    int a,b;
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(c.power(a,b));
                    break;
                }
                default:
                    flag=0;
            }
        }
        sc.close();
    }
}
