public class StringManipMethods{
    //Method 1:
    public String trimAndConcat(String word1, String word2){
        /*  input:
        "       Hello       " "        World      "
            output:
            HelloWorld
        */
        // Trims spaces
        String trimWord1 = word1.trim();
        String trimWord2 = word2.trim();

        //combines words
        String combinedWord = trimWord1.concat(trimWord2);

        //return combined word
        return combinedWord;
    }

    //Method 2:
    public Integer getIndexOrNull(String sentence, char letter){
        Integer idxNumber = sentence.indexOf(letter);
        if (idxNumber == -1 || idxNumber < 0){
            return null;
        }
        return idxNumber;
    }

    //Method 3: 
    // public Integer getIndexOrNull(String word, Integer startIdx, Integer endIdx, String subString){
    //     startIdx = word.indexOf();
    //     if (idxStart < 0){
    //         return null;
    //     }
        
    //     return startIdx;
    // }
}