package src;


public class Main {
    public static void main(String[] args) {


        Die dieOne = new Die(6);
        Die dieTwo = new Die(4);


        System.out.println("You rolled the dice: " + dieOne.roll());

        Cup cup = new Cup(dieOne, dieTwo);

        System.out.println("Identical throws: " + cup.howManyIdenticalThrows(55));

        String[] result = cup.result(3);

         //Print each value in the array
       for (String value : result) {
            System.out.println(value);
        }


    }
}
