//Programmer: Malcolm Milton

/* Given a string, consider the prefix string made of the first N chars of
 * the string. Does that prefix string appear somewhere else in the string? 
 * Assume that the string is not empty and that N is in the range 
 * 1..str.length().
 */
public boolean prefixAgain(String str, int n) {
    String str2 = str.substring(0,n);
    String str3 = str.substring(1,str.length());

    if(str3.indexOf(str2)==-1)
    {
        return false;
    }

    return true;
}
