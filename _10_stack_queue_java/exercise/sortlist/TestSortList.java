package _10_stack_queue_java.exercise.sortlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TestSortList {
    public static void main(String[] args) {
        Queue<Person> male = new LinkedList<>();
        Queue<Person> female = new LinkedList<>();
        Person[] person = new Person[5];
        person[0] = new Person("trung", 19, true);
        person[1] = new Person("hao", 23, true);
        person[2] = new Person("hoang", 25, true);
        person[3] = new Person("huong", 20, false);
        person[4] = new Person("trinh", 22, false);

        Arrays.sort(person);


        for (Person item : person) {
            if (item.isGender()) // so sánh nếu như true thì thêm vào NAM
            {
                male.add(item);

            } else // ngược lại
                {
                female.add(item);

            }
        }
        for (Person item : male) {
            System.out.println(item);
        }
        for (Person item : female) {
            System.out.println(item);
        }
    }

}
