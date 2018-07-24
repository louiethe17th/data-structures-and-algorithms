package day11;

import java.util.Stack;

public class QueueWithStacks {


    static class Queue{
        Stack<Integer> stack1;
    }

    //Push an item t0 a stack
    static void push(Stack<Integer> top, int data){
        //adding new data
        top.push(data);
    }

    //pops from stack
    static  int pop(Stack<Integer> top){

        if(top == null){
            System.out.println("Stack Underflow");
            System.exit(0);
        }

        return  top.pop();
    }

    //enQueue
    static int enQueue(Queue q, int x){
        push(q.stack1, x);
        return x;
    }

    //deQueue
    static int deQueue(Queue q){
        int x, res =0;

        if(q.stack1.isEmpty()){
            System.out.println("Q is empty");
            System.exit(0);
        }else if(q.stack1.size() == 1){
            return pop(q.stack1);
        }else{
            x = pop(q.stack1);
            res = deQueue(q);
            push(q.stack1, x);
            return res;
        }
        return 0;

    }


    public static void main(String[] args){



        /* Create a queue with items 1 2 3*/
        Queue q = new Queue();
        q.stack1 = new Stack<>();

        System.out.println(enQueue(q, 1) + " ");
        enQueue(q, 2);
        enQueue(q, 3);

        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");






    }

}
