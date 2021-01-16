package ru.vsu.cs;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String pathToList1 = "res/list1.txt";
        String pathToList2 = "res/list2.txt";

        System.out.println("Working with lists from files.");
        List<Integer> list1 = ListUtils.createListFromFile(pathToList1);
        System.out.print("List №1: ");
        System.out.println(list1);
        List<Integer> list2 = ListUtils.createListFromFile(pathToList2);
        System.out.print("List №2: ");
        System.out.println(list2);

        List<Integer> result = Solution.createNewList(list1, list2);
        System.out.println("Function result:" + result);

        System.out.println();

        System.out.println("Working with random lists.");
        List<Integer> list11 = ListUtils.createListWithRandom(10, 10);
        System.out.print("Random list №1: ");
        System.out.println(list11);
        List<Integer> list21 = ListUtils.createListWithRandom(10, 10);
        System.out.print("Random list №2: ");
        System.out.println(list21);

        List<Integer> result1 = Solution.createNewList(list11, list21);
        System.out.println("Function result:" + result1);
    }
}
