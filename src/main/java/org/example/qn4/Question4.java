package org.example.qn4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

    public static void main(String [] args){
        List<Integer> input = List.of(8, 8, 8, 5, 5, 3, 2, 7, 2, 7, 8, 4, 1, 6, 9);
        List<Integer> output = filterList(input);// Expected output [8, 6, 4, 2]
        System.out.println(output);
    }


    public static List<Integer> filterList(List<Integer> list){
        return list.stream().filter(num -> num % 2 == 0) // filter out even num
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());
    }

}
