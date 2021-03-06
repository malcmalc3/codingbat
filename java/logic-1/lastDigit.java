//Programmer: Malcolm Milton

/* Given three ints, a b c, return true if two or more of them have the same
 * rightmost digit. The ints are non-negative.
 */
public boolean lastDigit(int a, int b, int c) {
    a = a%10;
    b = b%10;
    c = c%10;

    return a==b || a==c || b==c;
}
