import java.util.Random;
public class Craps {
    public static void main(String[] args) {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        System.out.println(die1);
        System.out.println(die2);
        System.out.println(crapsRoll);

        if ((crapsRoll == 2) || (crapsRoll == 3) || (crapsRoll == 12))
        {
            System.out.println("You crapped out, GAME OVER!");
        }

        else if ((crapsRoll == 7) || (crapsRoll == 11))
        {
            System.out.println("You got natural, you win! Game over.");
        }
        else
        {

            System.out.println("You have a point, keep playing!");
        }

}
}