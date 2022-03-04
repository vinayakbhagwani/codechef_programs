import java.util.*;

class DuplicatesInString {

    public static void main(String[] args) {

        String str = "aacdbbbpokkkk";
        printDups(str);
    }

    public static void printDups(String str) {

        Map<Character,Integer> count = new HashMap<>();
        
        for(int i=0;i<str.length();i++) {
            if(!count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i),1);
            } else {
                count.put(str.charAt(i), count.get(str.charAt(i))+1);
            }
        }

        for(Map.Entry mapElement:count.entrySet()) {
            char key = (char) mapElement.getKey();
            int value = (int) mapElement.getValue();

            if(value > 1) {
                System.out.println(key +", count: "+value);
            }
        }
    }
}
