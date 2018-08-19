//Programmer: Malcolm Milton

/* Given a string, return a string where for every char in the original,
 * there are two chars.
 */
public String doubleChar(String str) {
    String str2 = "";

    for(int j=0; j<str.length(); j++)
    {
        str2 += str.charAt(j);
        str2 += str.charAt(j);
    }

    return str2;
}
