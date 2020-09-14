package Ramim_Apps_Ltd.company.ff;

public class StackUsingArray {


    int capacity =3 ;
    int[] stack = new int[capacity];
    int top = -1;


    //for push
    void  push(int x){
        if (top <capacity-1){
            top = top+1;
            stack[top]=x;
            System.out.println("Successfully added"+ x);
        }
        else {
            System.out.println("Exception! Stack Overflow");
        }


    }
    //for pop
    int pop(){

        if(top<0){
            System.out.println("Exception! Stack Underflow");
            return  -1;
        }
        int val  = stack[top];
        top = top-1;
        return val;
    }
    //for peek
    int peek(){

        if(top<0){
            System.out.println("Exception! Stack Underflow");
            return  -1;
        }
      return stack[top];

    }

    public static void main(String[] args) {
        System.out.println("Implementing My Stack ");
        StackUsingArray obj = new StackUsingArray();
        System.out.println("Peek Returned:"+obj.peek());
        obj.push(30);
        obj.push(20);
        obj.push(10);
        System.out.println("Pop Deleted:"+obj.pop());
        obj.push(90);
        System.out.println("Peek Returned:"+obj.peek());
    }
}
