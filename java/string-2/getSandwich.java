//Programmer: Malcolm Milton

/* A sandwich is two pieces of bread with something in between. Return the
 * string that is between the first and last appearance of "bread" in the 
 * given string, or return the empty string "" if there are not two pieces 
 * of bread.
 */
public String getSandwich(String str) {
    int first = str.indexOf("bread");
    int second = first;

    if(first == -1)
    {
        return "";
    }

    for(int x=first; x<str.length()-4; x++)
    {
        if(str.substring(x,x+5).equals("bread"))
        {
            second=x;
        }
    }

    if(first == second)
    {
        return"";
    }
    else
    {
        return str.substring(first+5, second);
    }
}
