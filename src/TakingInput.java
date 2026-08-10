import java.util.Scanner;

public class TakingInput {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstnum = sc.nextInt();
        System.out.println("Enter your Second number");
        int secondnum = sc.nextInt();
        int ans = firstnum + secondnum;
        System.out.println("The addition of two number is : " + ans);


    }
}
