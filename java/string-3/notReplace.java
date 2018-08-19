//Programmer: Malcolm Milton

/* Given a string, return a string where every appearance of the lowercase
 * word "is" has been replaced with "is not". The word "is" should not be 
 * immediately preceeded or followed by a letter -- so for example the "is" 
 * in "this" does not count.
 */
public String notReplace(String str) {
    String str2 = "";
    for(int x=0; x<str.length(); x++)
    {
        if(str.charAt(x) != 'i')
            str2 += str.charAt(x);
        else if(x==str.length()-1)
            str2 += 'i';
        else if(x==0)
        {
            if((str.charAt(1) == 's' && x<str.length()-2) && !Character.isLetter(str.charAt(2)))
                str2 += "is not" + str.substring(x,x++); //str.substring(x,x++) adds nothing to string but increments x
            else
                str2 += 'i';
        }
        else if(Character.isLetter(str.charAt(x-1)))
            str2 += 'i';
        else if(x<str.length()-2 && Character.isLetter(str.charAt(x+2)))
            str2 += 'i';
        else
            str2 += "is not" + str.substring(x,x++); //str.substring(x,x++) adds nothing to string but increments x
    }

    if(str.equals("is"))
        str2 = "is not";

    return str2;
}
