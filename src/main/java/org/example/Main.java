package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static int sum(List<Integer> list) {
        int sum = 0;
        try {
            for (Integer el : list) {
                sum += el;
            }
        } catch (Exception e) {
            System.out.println("Please make sure all numbers are valid and not null");
        } finally {
            if (sum == 0) {
                System.out.println("List is empty");
            }
            return sum;
        }

    }

    public static double average(List<Integer> list) {
        double average = 0;
        try {
            average = sum(list) / (double) list.size();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            if (list == null || list.isEmpty()) {
                System.out.println("List is empty");
                return 0.0;
            } else {
                return average;
            }
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);

        Set<Integer> set = new HashSet<>(list);
        List<Integer> listNoDupes = new ArrayList<>(set);
        System.out.println(listNoDupes);
        System.out.println(sum(listNoDupes));
        System.out.println(average(listNoDupes));
    }
}