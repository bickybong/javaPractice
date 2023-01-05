import java.util.HashMap;
import java.util.Map;

public class MapsExercise {
    public static void main(String[] args) {
        String str = "This is an awesome occasions! This has never happened before.";

        Map<String,Integer> occurrences = new HashMap<>();

        char[] chars = str.toCharArray();
        for(char chr:chars){
            Integer integer = occurrences.get(String.valueOf(chr));
            if(integer==null){
                occurrences.put(String.valueOf(chr), 1);
            } else{
                occurrences.put(String.valueOf(chr), integer+1);
            }
        }
        System.out.println(occurrences);

        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = str.split(" ");
        for(String word:words){
            Integer integer = wordsMap.get(String.valueOf(word));
            if(integer==null){
                wordsMap.put(String.valueOf(word), 1);
            } else{
                wordsMap.put(String.valueOf(word), integer+1);
            }
        }
        System.out.println(wordsMap);
    }
}
