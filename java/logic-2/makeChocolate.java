//Programmer: Malcolm Milton

/* We want make a package of goal kilos of chocolate. We have small bars
 * (1 kilo each) and big bars (5 kilos each). Return the number of small bars 
 * to use, assuming we always use big bars before small bars. Return -1 if it 
 * can't be done.
 */
public int makeChocolate(int small, int big, int goal) {
    int big5 = big*5;
    int remainder = goal-big5;

    if(remainder<0)
    {
        if(small>=goal%5)
        {
            return goal%5;
        }
        else
        {
            return -1;
        }
    }

    if(remainder==0)
    {
        return remainder;
    }

    if(remainder>0)
    {
        if(small>=goal-big5)
        {
            return goal-big5;
        }
        else
        {
            return -1;
        }
    }

    return -1;
}
