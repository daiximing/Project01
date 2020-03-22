package com.wondersgroup;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);

        String[] arr = new String[]{"one","two","three"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println("s = " + s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("123");
        objects.add("223");
        objects.add("323");

        for (int i = 0; i < objects.size(); i++) {

        }

        if (objects == null) {

        }

        if (objects != null) {

        }
    }
}
