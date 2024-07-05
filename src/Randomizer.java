import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Randomizer {
    List<String> boys= new ArrayList<>();
    List<String> girls= new ArrayList<>();
    int n;
    Scanner keyboard= new Scanner(System.in);


    public void setBoys() {

        for(int i=0; i<n; i++){
            System.out.println(STR."Enter the name of boy: \{i + 1}");
            String name= keyboard.nextLine();
            boys.add(name);
        }
    }

    public void setGirls() {

        for(int i=0; i<n; i++){
            System.out.println(STR."Enter the name of girl: \{i + 1}");
            String name= keyboard.nextLine();
            girls.add(name);
        }
    }

    public void printBoys(){
        System.out.println(boys);

    }
    public void printGirls(){
        System.out.println(girls);
    }

    public void randomize(){
        Collections.shuffle(boys);
        Collections.shuffle(girls);

        for(int i=0; i<n; i++){
            System.out.println(boys.get(i)+" + "+girls.get(i));
        }


    }

}