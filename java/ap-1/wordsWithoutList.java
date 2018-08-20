//Programmer: Malcolm Milton

/* Given an array of strings, return a new List (e.g. an ArrayList) where all
 * the strings of the given length are omitted. See wordsWithout() below 
 * which is more difficult because it uses arrays.
 */
public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> list = new ArrayList<String>();

    for(int j=0; j<words.length; j++){
        if(words[j].length()!=len){
            list.add(words[j]);
        }
    }

    return list;
}
