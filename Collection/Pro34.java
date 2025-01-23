import java.util.*;

public class Pro34 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("CPP");
        languages.add("Core Java");
        languages.add("PHP");

        System.out.println(languages);
        Collections.addAll(languages, "Advance Java", "JS");
        System.out.println(languages);
        String newLang[] = {"MERN", "MEAN"};
        //int data[] = {11, 22, 33};
        Collections.addAll(languages, newLang);
        System.out.println(languages);
    }
}
