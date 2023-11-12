package sda.exercise6;

import java.util.Scanner;
import java.util.TreeMap;

public class Exercise6 {

    public static void main(String[] args) {
        TreeMap <Integer,String> treeMap = new TreeMap<>();
        populateTree(treeMap);
        firsLastTreeValue(treeMap);
    }

    private static void firsLastTreeValue(TreeMap< Integer,String> treeMap) {
        System.out.println("First: " + treeMap.firstEntry());
        System.out.println("Last: " + treeMap.lastEntry());
    }

    private static void populateTree(TreeMap< Integer,String> treeMap) {
        Scanner in = new Scanner(System.in);
        System.out.println("Put the length of the map ");
        int length = in.nextInt();
        for(int i =0 ; i<length; i++){
            Integer key ;
            System.out.println("Put key");
            key = in.nextInt();
            String value ;
            System.out.println("Put value");
            value = in.next();
            treeMap.put(key , value);
        }
    }
}







