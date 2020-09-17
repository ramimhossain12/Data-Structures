package Ramim_Apps_Ltd.company.ff;

public class Anonymous_A {

    void  display(){
        System.out.println("Person class");
    }





    public static void main(String[] args) {
        Anonymous_A a = new Anonymous_A(){
          void  display()
          {
              System.out.println("Test class");
          }
        };
        a.display();
    }
}
