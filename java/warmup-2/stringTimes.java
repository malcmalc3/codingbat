//Programmer: Malcolm Milton

/* Given a string and a non-negative int n, return a larger string that is n
 * copies of the original string.
 */
public String stringTimes(String str, int n) {
    String str2="";

    for(int x=0; x<n; x++)
    {
        str2+=str;
    }

    return str2;
}
