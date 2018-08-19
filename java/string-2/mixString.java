//Programmer: Malcolm Milton

/* Given two strings, A and B, create a bigger string made of the first char
 * of A, the first char of B, the second char of A, the second char of B, 
 * and so on. Any leftover chars go at the end of the result.
 */
public String mixString(String a, String b) {
    String str = "";
    int min = Math.min(a.length(),b.length());

    for(int j=0; j<min; j++)
    {
        str += a.charAt(j);
        str += b.charAt(j);
    }

    str += a.substring(min,a.length());
    str += b.substring(min,b.length());

    return str;
}
