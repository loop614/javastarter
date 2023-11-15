package cadence.stride;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class JvArray extends AbstractStride {
    @Override
    public void run() {
        this.queueExample();
        this.dequeExample();
        this.stackExample();
        this.boringExample();
        int[] nums = new int[]{1, 2, 3, 4, 2, 6};

        // https://leetcode.com/problems/remove-element/
        int newLen = this.inlineDelete(nums, 2);
        System.out.println(newLen);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
    }

    private int inlineDelete(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }

    private void boringExample() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("James May loves a " + cars[0]);
    }

    private void queueExample() {
        ArrayBlockingQueue<Character> blockingQueue = new ArrayBlockingQueue<Character>(3);
        blockingQueue.offer('a');
        blockingQueue.offer('b');
        blockingQueue.offer('c');
        while (!blockingQueue.isEmpty()) {
            System.out.println("Take an poll out of my queue " + blockingQueue.poll());
        }
    }

    private void dequeExample() {
        ArrayDeque<Number> deque = new ArrayDeque<Number>();
        deque.addFirst(1);
        deque.push(3);
        deque.addLast(2);
        deque.addLast(4);

        while (!deque.isEmpty()) {
            System.out.println("Take a first last out of my deque " + deque.pollFirst() + " " + deque.pollLast());
        }
    }

    private void stackExample() {
        Stack<Double> stack = new Stack<Double>();
        stack.push(1.1);
        stack.push(1.2);
        stack.push(1.3);
        while (!stack.empty()) {
            System.out.println("Take a pop out of my stack " + stack.pop());
        }
    }
}
