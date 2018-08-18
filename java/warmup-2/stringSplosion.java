//Programmer: Malcolm Milton

/* Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
public String stringSplosion(String str) {
    String str2 = "";

    for(int j=0; j<str.length();j++)
    {
        str2 += str.substring(0,j+1);
    }

    return str2;
}
