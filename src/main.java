import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        menu();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("> ");
        int op;
        while(true)
        {
            op = Integer.parseInt(keyboard.nextLine());
            if (op == 0)
            {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }
    }

    public static void menu()
    {
        System.out.println("Welcome to Pokemon Battler");
        System.out.println("What would you like to do?");
        System.out.println("Enter \"0\" to exit at any time.");
        System.out.print("1.Create a team\n2.Battle a gym leader\n3.Battle an Elite 4\n5.Battle a Champion.\n");

    }
}
