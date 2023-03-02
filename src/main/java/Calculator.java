import java.util.Scanner;

public class Calculator {
    public int fact(int i){
        if(i==1) return 1;
        return i*fact(i-1);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
//        System.out.println("2. Factorial");
//        System.out.println("Enter choice :");
        System.out.print("Enter number to find factorial  ");
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        int ans = c.fact(f);
        System.out.println(ans);
    }
}