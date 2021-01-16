package ru.vsu.cs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListUtils {

    public static List<Integer> createListWithRandom(int n, int bound) {
        Random rnd = new Random();
        List<Integer> list = new ArrayList();

        for (int i = 0; i < n; i++) {
           list.add(rnd.nextInt(bound));
        }
        return list;
    }

    public static List<Integer> createListFromFile(String path) throws IOException {
        File file = new File(path);
        Scanner cin = new Scanner(file);

        List<Integer> list = new ArrayList();

        while (cin.hasNext()) {
            list.add(Integer.parseInt(cin.nextLine()));
        }

        return list;
    }
}

