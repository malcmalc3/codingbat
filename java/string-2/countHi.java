//Programmer: Malcolm Milton

/* Return the number of times that the string "hi" appears anywhere in the
 * given string.
 */
public int countHi(String str) {
    int count=0;

    for(int j=0; j<str.length()-1;j++)
    {
        if(str.charAt(j)=='h' && str.charAt(j+1)=='i')
        {
            count++;
        }
    }
    return count;
}
