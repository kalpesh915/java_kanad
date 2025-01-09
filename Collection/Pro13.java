import java.util.*;


public class Pro13 {
    public static void main(String[] args) {
        String languages[] = {"C", "C++", "Java", "PHP", "Python", "JS", "CSS"};
        List<String> students1 = new LinkedList<>();
        List<String> students2 = new ArrayList<>();
        //List<String> languageList = new LinkedList<>();
        List<String> languageList = new LinkedList<>(Arrays.asList(languages));

        /*for(String tmp : languages){
            languageList.add(tmp);
        }*/

        //System.out.println(languageList);

        //String result[] = languageList.toArray(new String[languageList.size()]);
        //System.out.println(result);

        /*for(String tmp : result){
            System.out.print(" "+tmp);
        }*/

        //Collections.sort(languageList);
        //System.out.println(languageList);

        //languageList.sort((String s1, String s2) -> s1.compareTo(s2));
        //System.out.println(languageList);

        ListIterator list1 = languageList.listIterator();
        while(list1.hasNext()){
            System.out.print(" "+list1.next());
        }
    }
}
