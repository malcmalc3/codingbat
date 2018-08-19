//Programmer: Malcolm Milton

/* Given a string, return the sum of the digits 0-9 that appear in the
 * string, ignoring all other characters. Return 0 if there are no digits in 
 * the string.
 */
public int sumDigits(String str) {
    int sum = 0;

    for(int x=0; x<str.length(); x++)
        if(Character.isDigit(str.charAt(x)))
         sum += Integer.parseInt(str.substring(x,x+1));

    return sum;
}
