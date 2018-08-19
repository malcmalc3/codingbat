//Programmer: Malcolm Milton

/* We'll say that a lowercase 'g' in a string is "happy" if there is another
 * 'g' immediately to its left or right. Return true if all the g's in the 
 * given string are happy.
 */
public boolean gHappy(String str) {
    for(int x=0; x<str.length(); x++)
    {
        if(str.charAt(x)=='g')
        {
            if(str.length()<2)
                return false;
            else if(x==0 && str.charAt(x+1) != 'g')
                return false;
            else if(x>0 && str.charAt(x-1) != 'g' && x+1==str.length())
                return false;
            else if(x>0 && str.charAt(x-1) != 'g' && str.charAt(x+1) != 'g')
                return false;
        }
    }

    return true;
}

