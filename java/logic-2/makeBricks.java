//Programmer: Malcolm Milton

/* We want to make a row of bricks that is goal inches long. We have a number
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true 
 * if it is possible to make the goal by choosing from the given bricks.
 */
public boolean makeBricks(int small, int big, int goal) {
    int big5 = big*5;

    if((goal-big5)<=small && (goal-big5)>=0)
    {
        return true;
    }
    if(goal%5==0 && big5>=goal)
    {
        return true;
    }else{
        goal-=1;
    }

    if(goal%5==0 && big5>=goal && small>=1)
    {
        return true;
    }else{
        goal-=1;
    }

    if(goal%5==0 && big5>=goal && small>=2)
    {
        return true;
    }else{
        goal-=1;
    }

    if(goal%5==0 && big5>=goal && small>=3)
    {
        return true;
    }else{
        goal-=1;
    }

    if(goal%5==0 && big5>=goal && small>=4)
    {
        return true;
    }

    return false;
}
