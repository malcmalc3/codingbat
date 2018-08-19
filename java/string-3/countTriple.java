//Programmer: Malcolm Milton

/* We'll say that a "triple" in a string is a char appearing three times in a
 * row. Return the number of triples in the given string. The triples may 
 * overlap.
 */
public int countTriple(String str) {
    int triple = 0;

    for(int x=0; x<str.length()-2; x++)
        if(str.charAt(x)==str.charAt(x+1) && str.charAt(x)==str.charAt(x+2))
            triple++;

    return triple;
}
