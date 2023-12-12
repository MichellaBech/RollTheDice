package src;

import java.util.Random;

public class Die {

    private int sides;

    public Die (int sides)
    {
        this.sides = sides;
    }

    public int roll()
    {
        Random random = new Random();
        return random.nextInt(1, sides+1);
    }
}
