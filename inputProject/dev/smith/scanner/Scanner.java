import java.util.Scanner;
public class scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Hello Human, What do they call you?");
            String name = scan.next();
            System.out.println(name +  "........That sounds very primitive");

        } catch (Exception e) {
            System.out.println("I may have broken your brain, silly human,
                    that isn't even a name"):
        }


        try {
            System.out.println("What is your favorite food?");
            String food = scan.next();

            System.out.println(food + ".......sounds like a disease that only humans
                    would eat.");

        } catch(Exception e) {
            System.out.println("That is a number you fool...So like a primate");
        }


    }
}

