//Programmer: Malcolm Milton

/* Return true if the string "cat" and "dog" appear the same number of times
 * in the given string.
 */
public boolean catDog(String str) {
    int catCount=0;
    int dogCount=0;

    for(int j=1; j<str.length()-1; j++)
    {
        if(str.charAt(j-1)=='c'&&str.charAt(j)=='a'&&str.charAt(j+1)=='t')
        {
            catCount++;
        }
    }

    for(int j=1; j<str.length()-1; j++)
    {
        if(str.charAt(j-1)=='d'&&str.charAt(j)=='o'&&str.charAt(j+1)=='g')
        {
            dogCount++;
        }
    }

    if(dogCount == catCount)
    {
        return true;
    }

    return false;
}
