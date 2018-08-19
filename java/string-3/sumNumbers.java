//Programmer: Malcolm Milton

/* Given a string, return the sum of the numbers appearing in the string,
 * ignoring all other characters. A number is a series of 1 or more digit 
 * chars in a row.
 */
public int sumNumbers(String str) {
    int sum = 0;
    int start;
    int end;

    for(int x=0; x<str.length(); x++)
    {
        if(Character.isDigit(str.charAt(x)))
        {
            start = x;
            end = x+1;

            while(end<str.length() && Character.isDigit(str.charAt(end)))
                end++;

            x = end;
            sum += Integer.parseInt(str.substring(start, end));
        }
    }

    return sum;
}
