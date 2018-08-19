//Programmer: Malcolm Milton

/* Given a string and an int n, return a string made of the first n
 * characters of the string, followed by the first n-1 characters of the 
 * string, and so on. You may assume that n is between 0 and the length of 
 * the string, inclusive (i.e. n >= 0 and n <= str.length()).
 */
public String repeatFront(String str, int n) {
    String str2 = "";
    int n2 = n;

    for(int j=0; j<=n2;j++)
    {
        str2 += str.substring(0,n);
        n--;
    }

    return str2;
}
