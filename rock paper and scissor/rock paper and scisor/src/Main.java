import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int userchoice,computer;
//        int count = 0;
        int tie =0;
        int uWin =0;
        int cWin = 0;
        System.out.println("Welcome to the Game");
        System.out.println("Your Options are \n 1.Rock \n 2. Paper \n 3. Scissor");
        System.out.println("Your Choice : ");
        userchoice = sc.nextInt();
        computer = r.nextInt(3);
            // to know computer choices Rock -1; Paper -2; Scissor -3;
        if (computer==0)
            System.out.println("Computer chose Rock.");
        else if (computer == 1)
            System.out.println("Computer chose Paper.");
        else if (computer == 2)
            System.out.println("Computer chose Scissor.");
        switch (userchoice) {
           case 1:
                System.out.println("You chose Rock ");
                break;
            case 2:
                System.out.println("You chose Paper ");
                break;
            case 3:
                System.out.println("You chose Scissor ");
                break;
            default:
                System.out.println("Wrong choice ");
        }
        if ((userchoice == 1 && computer == 0) || (userchoice == 2 && computer == 1) || (userchoice == 3 && computer == 2)) {
            System.out.println("Tie");
            tie++;
        } else if ((userchoice == 1 && computer == 2) || (userchoice == 2 && computer == 0) || (userchoice == 3 && computer == 1)) {
            System.out.println("Win!");
            uWin++;
        } else if ((userchoice == 2 && computer == 2) || (userchoice == 1 && computer == 1) || (userchoice == 3 && computer == 0)) {
            System.out.println("Loosed!");
            cWin++;
        }
    }
}