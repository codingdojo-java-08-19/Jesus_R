import java.util.HashMap;
import java.util.Set;

public class TrackList{
    public static void main(String [] args){
        HashMap<String, String> songList = new HashMap<String, String>();

        songList.put("Twinkle Twinkle", "Twinkle Twinkle Little Star...");
        songList.put("ABC's", "A,B,C,D,E,F,G...");
        songList.put("Maneater", "Watch out boy she'll chew you up");
        songList.put("Love Me Again", "I need to know now, know now, can you love me again?");

        //Pulling out one song's lyrics
        String manEater = songList.get("Maneater");
        System.out.println(manEater);

        //Looping through all songs and their lyrics
        Set<String> keys = songList.keySet();
        for (String key: keys){
            System.out.println(key);
            System.out.println(songList.get(key));
        }
    }
}