package com.alexandrova;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> listX = new ArrayList<>();
        ArrayList<Object> listY = new ArrayList<>();
        listX.add("letter1");
        listX.add("letter2");
        listY.add("letter1");
        listY.add("letter3");
        listY.add("letter4");
        listY.add("letter1");
        listY.retainAll(listX);

        if (listX.size() == listY.size()) {
            checkUnique(listX, listY);
        } else {
            System.out.println("No");
        }
    }

    private static void checkUnique(ArrayList<Object> listX, ArrayList<Object> listY) {
        boolean isCorrect = true;
        for (Object o1 : listX) {
            isCorrect = listY.contains(o1);
        }
        if (isCorrect) {
            System.out.println("Yes, we got listX from listY.");
        } else {
            System.out.println("No, collections is not the same");
        }
    }
}
