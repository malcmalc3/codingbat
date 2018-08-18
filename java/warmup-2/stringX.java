//Programmer: Malcolm Milton

/* Given a string, return a version where all the "x" have been removed.
 * Except an "x" at the very start or end should not be removed.
 */
public String stringX(String str) {
    String str2="";

    if(str.length()>0 && str.charAt(0)=='x')
    {
        str2+="x";
    }

    for(int j=0; j<str.length(); j++)
    {
    if(str.charAt(j)!='x')
        {
            str2+=str.charAt(j);
        }
    }

    if(str.length()>1 && str.charAt(str.length()-1)=='x')
    {
        str2+="x";
    }

    return str2;
}
