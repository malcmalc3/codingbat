//Programmer: Malcolm Milton

/* Count the number of "xx" in the given string. We'll say that overlapping is
 * allowed, so "xxx" contains 2 "xx".
 */
int countXX(String str) {
    int count = 0;

    for(int j=0; j<str.length()-1;j++)
    {
        if(str.substring(j,j+2).equals("xx"))
        {
            count++;
        }
    }
    return count;
}
