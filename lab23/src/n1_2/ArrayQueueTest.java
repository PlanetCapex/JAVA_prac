package n1_2;

import n1_2.QueueOnArray.ArrayQueue;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.display();
        queue.enqueue(20);
        queue.enqueue(10);
        queue.enqueue(10);
        queue.enqueue(23);
        queue.enqueue(42);
        queue.enqueue(71);
        queue.enqueue(91);
        queue.enqueue(0);
        queue.display();
        System.out.println("Первый элемент в очереде: " + queue.element());
        System.out.println("Очередь пустая? " + queue.isEmpty());
        System.out.println("В очереде нет места? " + queue.isFull());
        queue.clear();
        queue.display();
    }
}
