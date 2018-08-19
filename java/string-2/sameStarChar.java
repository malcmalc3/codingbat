//Programmer: Malcolm Milton

/* Returns true if for every '*' (star) in the string, if there are chars
 * both immediately before and after the star, they are the same.
 */
public boolean sameStarChar(String str) {
    boolean star=true;

    for(int j=1; j<str.length()-1;j++)
    {
        if(str.charAt(j)=='*'&&str.charAt(j-1)!=str.charAt(j+1))
        {
            star=false;
        }
    }

    return star;
}
