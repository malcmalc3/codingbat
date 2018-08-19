//Programmer: Malcolm Milton

/* Given a string, return the length of the largest "block" in the string.
 * A block is a run of adjacent chars that are the same.
 */
public int maxBlock(String str) {
    int currentBlock = 0;
    int maxBlock = 0;

    if(str.length()>1 && str.charAt(0) == str.charAt(1))
    {
        currentBlock++;
    }

    for(int x=1; x<str.length(); x++)
    {
        if(str.charAt(x-1) == str.charAt(x))
            currentBlock++;
        else
            currentBlock = 1;

        if(currentBlock > maxBlock)
            maxBlock = currentBlock;
    }
    return maxBlock;
}
