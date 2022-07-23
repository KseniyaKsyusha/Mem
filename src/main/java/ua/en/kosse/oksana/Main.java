package ua.en.kosse.oksana;

import java.util.*;
;import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        // Creating an array list
        String[] name = { "Антонов", "Шевченко", "Бойко","Шевченко", "Кравченко", "Савицький",
                "Антонов","Шевченко", "Тетерів", "Мамченко"};
        List<String> nameLst = new ArrayList<>();
        List<String> nameOrd = new ArrayList<>();
        for (String nameM:name){
            nameLst.add(nameM);
        }

        System.out.println("ArrayList: " + nameLst);
        System.out.println("SizeArrayList: " + nameLst.size());
        Collections.sort(nameLst);
        System.out.println("ArrayListOrd: " + nameLst);

        Set<String> set = new HashSet<>(nameLst);
        nameLst.clear();
        nameLst.addAll(set);
        Collections.sort(nameLst);
        System.out.println("ArraySet: " + nameLst);

        HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
        for (String nameS:nameLst){
            myHashMap.put(nameS, nameS.length());
        }
        System.out.println("Map: " + myHashMap);
    }
}
