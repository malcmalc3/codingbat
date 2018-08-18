//Programmer: Malcolm Milton

/* Given 2 strings, a and b, return the number of the positions where they
 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
 * since the "xx", "aa", and "az" substrings appear in the same place in both 
 * strings.
 */
public int stringMatch(String a, String b) {
    int min = Math.min(a.length(),b.length());
    int count = 0;

    for(int j=0; j<min-1; j++)
    {
        if(a.substring(j,j+2).equals(b.substring(j,j+2)))
        {
            count++;
        }
    }
    return count;
}
