//Programmer: Malcolm Milton

/* Given a string, return a "rotated right 2" version where the last 2 chars
 * are moved to the start. The string length will be at least 2.
 */
public String right2(String str) {
    String str2="";

    str2+=str.charAt(str.length()-2);
    str2+=str.charAt(str.length()-1);

    for(int j=0; j<str.length()-2; j++)
    {
        str2+=str.charAt(j);
    }

    return str2;
}
