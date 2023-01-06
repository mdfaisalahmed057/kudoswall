// 1. Write a function that takes a number and returns an array of its digits.

import java.util.ArrayList;
import java.util.List;

public class takeintegerreturnarr {
    public static void main(String[] args) {
        int num = 1213;
        System.out.println(toarr(num));
    }

    public static List<Integer> toarr(int num) {

        ArrayList<Integer> ls = new ArrayList<>();
        // this line of code will run till number greater then zero
        while (num > 0) {
            // this both lines of code will iterate each number and return each integer
            ls.add(num % 10);
            num = num / 10;

        }
        return ls;

    }
}