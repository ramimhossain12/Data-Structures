package Ramim_Apps_Ltd.company.ff;

public class Queue {

    int []queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        } else {
            System.out.println("Queue is Full");
        }


    }

    public int deQueue() {

        int data = queue[front];

        if (!isEmpty()){
            front = (front + 1) % 5;
            size = size - 1;
        }
        else {
            System.out.println("Queue is Empty");
        }
        return data;
    }

    public void show() {
        System.out.print("Element  : ");

        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % 5] + " ");
        }
        System.out.println();

        for (int n : queue) {
            System.out.print(n + "");
        }

    }


    //if code size;
    public int getSize() {
        return size;
    }
    //if data is full;
    public boolean isFull() {
        return getSize() == 5;
    }
    //if code Empty;
    public boolean isEmpty() {
        return getSize() == 0;
    }




    //main method
    public static void main(String[] args) {
        Queue q = new Queue();

        //for data insert
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(87);
        q.enQueue(90);

        //for remove
         q.deQueue();
         q.deQueue();

        //again data add
        q.enQueue(1);
        q.enQueue(2);


        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        System.out.println("Size " + q.getSize());

        
        q.show();
    }

}
