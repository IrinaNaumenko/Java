package Homework.third_for_18_10_22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {

    public static void main(String[] args) {
        ArrayList<Integer> studID = new ArrayList<>();

        for (int i = 1; i < 10; i++) {

            studID.add(i);

        }
        System.out.println(studID);
        List<Integer> list = new LinkedList<>();
        for (int t = 0; t < 15; t++) {
            list.add(new Integer(t));
            System.out.println(t);
        }
    }
}
//