package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cup {

    private Die dieOne;
    private Die dieTwo;

    public Cup(Die dieOne, Die dieTwo)
    {
        this.dieOne = dieOne;
        this.dieTwo = dieTwo;
    }

    public int howManyIdenticalThrows (int times)
    {
        int count = 0;

        for (int i = 0; i < times; i++)
        {
            if(dieOne.roll() == dieTwo.roll())
            {
                count++;
            }
        }
        return count;
    }




}
