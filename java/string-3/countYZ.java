//Programmer: Malcolm Milton

/* Given a string, count the number of words ending in 'y' or 'z' -- so the
 * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
 * (not case sensitive). We'll say that a y or z is at the end of a word if 
 * there is not an alphabetic letter immediately following it.
 */
public int countYZ(String str) {
    int count=0;
    char letter;

    for(int x=0; x<str.length(); x++)
    {
        letter = Character.toLowerCase(str.charAt(x));

        if((letter=='y' ||letter=='z') && (x == str.length()-1 || !Character.isLetter(str.charAt(x+1))))
        {
            count ++;
        }
    }

    return count;
}
