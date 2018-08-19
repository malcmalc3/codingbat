//Programmer: Malcolm Milton

/* Given a string and an int N, return a string made of N repetitions of the
 * last N characters of the string. You may assume that N is between 0 and 
 * the length of the string, inclusive.
 */
public String repeatEnd(String str, int n) {
    String str2 = "";

    for(int j=0; j<n;j++)
    {
        str2 += str.substring(str.length()-n,str.length());
    }

    return str2;
}
