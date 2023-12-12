package src;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Die dieOne = new Die(6);
        Die dieTwo = new Die(4);


        System.out.println(dieOne.roll());

        Cup cup = new Cup(dieOne, dieTwo);

        System.out.println(cup.howManyIdenticalThrows(55));


    }
}
