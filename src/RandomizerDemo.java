import java.util.Scanner;

public class RandomizerDemo {
    public static void main(String[] args){
        Randomizer random=new Randomizer();
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter the number of pairs:");
        random.n = keyboard.nextInt();
        keyboard.nextLine();
        random.setBoys();
        random.setGirls();
        random.printBoys();
        random.printGirls();
        random.randomize();
    }
}
