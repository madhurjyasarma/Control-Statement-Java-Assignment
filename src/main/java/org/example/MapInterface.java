package org.example;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("B");
        hash.add("1");
        hash.add("*");

        hash.add("C");
        hash.add("B");
        hash.add("A");

//        System.out.println(hash);
//
//        for (String str: hash) {
//            System.out.println(str);
//        }

        ArrayList<String> arr = new ArrayList<>();
        arr.add("F");
        arr.add("O");
        arr.add("R");
        arr.add("W");
        arr.add("A");
        arr.add("R");
        arr.add("D");

//        ListIterator itr = arr.listIterator();
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + " ");
//        }
//        System.out.println();
//
//        // Backward
//        while (itr.hasPrevious()) {
//            System.out.print(itr.previous() + " ");
//        }

        HashMap<String,String> myMap = getCapital();
        System.out.println(myMap);



    }
    public static HashMap<String, String> getCapital() {
        HashMap<String,String> map = new HashMap<>();

        map.put("Assam","Dispur");
        map.put("Bihar","patna");
        map.put("Kerala","Trivandrum");

        return map;
    }
}
