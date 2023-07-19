package CollectionAndMap;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    TreeSet<Student> students = new TreeSet<Student>(new OrderNameComparator());


        students.add(new Student("Barış", 50));
        students.add(new Student("Berrin", 60));
        students.add(new Student("Nuriye", 70));
        students.add(new Student("Eylül", 85));
        students.add(new Student("Yavuz", 90));

        for (Student stu: students) {
            System.out.println(stu.getName() + " " + stu.getNote());
        }


    }

}
