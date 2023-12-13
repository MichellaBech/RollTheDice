package src;

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

    public String[] result (int times)
    {
        String[] resultRolls = new String[times];
        for (int i = 0; i < times; i++)
        {
            int roll1 = dieOne.roll();
            int roll2 = dieTwo.roll();

            int sum = roll1 + roll2;

            resultRolls[i] = ("First die: " + roll1 + ", Second die: " + roll2 + ", Sum: " + sum);
        }

        return resultRolls;
    }





}
