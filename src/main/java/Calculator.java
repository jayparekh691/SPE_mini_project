import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    public static final Logger logger = LogManager.getLogger(Calculator.class);
    public int fact(int i){
        logger.info("[FACTORIAL] - " + i);
        int ans=1;
        while(i>0){
            ans=ans*i--;
        }
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.print("Enter number to find factorial  ");
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        int ans = c.fact(f);
        System.out.println(ans);

    }
}