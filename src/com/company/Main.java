package com.company;

import java.util.*;

public class Main {
   

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        LinkedList<String> listA= new LinkedList<>();
        LinkedList<String> listB= new LinkedList<>();
        LinkedList<String> listC= new LinkedList<>();
        LinkedList<String> listB_reversedSample= new LinkedList<>();


        for (int i = 0; i <5 ; i++) {
            System.out.println("enter smth to list A" );
            String quetion = scanner.nextLine();
            listA.add(quetion);
        }
       System.out.println("List A " +listA);

        for (int i = 0; i <5 ; i++) {
            System.out.println("enter smth  to List B");
            String quetion = scanner.nextLine();
            listB.add(quetion);
        }
        System.out.println("List B " +listB);

        for (int i = 4; i >-1 ; i--) {
            listB_reversedSample.add(listB.get(i));
        }
        for (int i = 0; i <listA.size() ; i++) {
            listC.add(listA.get(i));
            listC.add(listB_reversedSample.get(i));

        }
        System.out.println("List C "+listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println("sorted list C"+listC);
    }

}

