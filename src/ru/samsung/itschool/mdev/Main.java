package ru.samsung.itschool.mdev;

import javax.management.Query;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Car<String> bmw = new Car<>("BMW");
        Car<Integer> tesla = new Car<>(123);



        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add to the end  "+ (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to the end "+ (endTime-startTime));

        // ---------------------------------------------------------------------

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList add to begin  "+ (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add to begin "+ (endTime-startTime));

        //------------------------------------------------------------------

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get  "+ (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get "+ (endTime-startTime));

        // --------------------------------------------------------


        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove from begin  "+ (endTime-startTime));

        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList remove from begin "+ (endTime-startTime));

        // Stack - LIFO - Last in - First out
        // Queue - FIFO - First in - First out

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s);
            queue.offer(s);
        }
        while(!stack.isEmpty()) {
            System.out.print (stack.pop() + " "); // печатает значение и удаляет из стека
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " "); // удаляем сначала и печатем значение
        }
    }
}
