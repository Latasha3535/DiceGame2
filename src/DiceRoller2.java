import java.util.Scanner;

/**
 * Created by Student on 2/4/17.
 */
public class DiceRoller2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sides = 0;
        int die1 = 0;
        int die2 = 0;
        //int sides = (int) (Math.random() * sides+ 1);


        System.out.println(" Welcome the Dice game at the LMM Casion ");
        System.out.println();
        System.out.println();

        // System.out.println(" HOW MANY SIDES SHOULD EACH DICES HAVE");
        // sides = scan.nextInt();

        RollDice(die1, die2);
    }



    public static int RollDice (int die1, int die2) {
        Scanner scan = new Scanner(System.in);
        int sides = 1;
        String choice = "y";
        System.out.println(" HOW MANY SIDES SHOULD EACH DICES HAVE ");
        sides = scan.nextInt();
        while (choice.equals("y")) {

            System.out.println("Roll");
            die1 = roll(sides);
            die2 = roll(sides);
           // int dicThree = roll(7);

            System.out.println(die1);
            System.out.println(die2);

            // die1=scan.nextInt();

            //System.out.println ( " Press enter to roll the dices");
            //die2=scan.nextInt();
            System.out.println("Enter y/n to Countine"); // Ask this user to input y/ or n
            choice = scan.next();

        }

        //System.out.println("Enter y/n to Countine"); // Ask this user to input y/ or n
        //choice = scan.next();
        return 6;
    }

    public static int roll(int max) {
        return (int) (Math.random() * max + 1);
    }
}

