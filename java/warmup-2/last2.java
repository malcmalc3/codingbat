//Programmer: Malcolm Milton

/* Given a string, return the count of the number of times that a substring
 * length 2 appears in the string and also as the last 2 chars of the string, 
 * so "hixxxhi" yields 1 (we won't count the end substring).
 */
public int last2(String str) {
    int count = 0;

    if(str.length()<3)
    {
        return count;
    }

    String last2 = str.substring(str.length()-2,str.length());

    for(int j=0; j<str.length()-2; j++)
    {
        if(str.substring(j,j+2).equals(last2)){count++;}
    }

    return count;
}
