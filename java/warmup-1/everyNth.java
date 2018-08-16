//Programmer: Malcolm Milton

/* Given a non-empty string and an int N, return the string made starting
 * with char 0, and then every Nth char of the string. So if N is 3, use 
 * char 0, 3, 6, ... and so on. N is 1 or more.
 */
public String everyNth(String str, int n) {
    String str2 = "";
    char letter;

    for (int x = 0; x<str.length(); x+=n)
    {
        letter=str.charAt(x);
        str2+=letter;
    }
    return str2;
}
