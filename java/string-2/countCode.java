//Programmer: Malcolm Milton

/* Return the number of times that the string "code" appears anywhere in the
 * given string, except we'll accept any letter for the 'd', so "cope" and 
 * "cooe" count.
 */
public int countCode(String str) {
    int count=0;

    for(int j=0; j<str.length()-3;j++)
    {
        if(str.charAt(j)=='c'&&str.charAt(j+1)=='o'&&str.charAt(j+3)=='e')
        {
            count++;
        }
    }

    return count;
}
