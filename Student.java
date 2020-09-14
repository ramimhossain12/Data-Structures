package Ramim_Apps_Ltd.company.ff;

import java.util.LinkedList;

public class Student {

    String  name,className;
    int id;

    public Student(String name, String className, int id) {
        this.name = name;
        this.className = className;
        this.id = id;
    }


}
     class  StudentList{
    public static void main(String[] args) {

        //student linkedlist
        LinkedList<Student> list = new LinkedList<>();

        //student create
        System.out.println("Name  ClassName  Id");
        Student student  = new Student("Ramim","Ten",101);
        Student student1  = new Student("karim","Nine",101);
        Student student2  = new Student("Hridoy","Four",101);
        Student student3 = new Student("Binte","Five",101);


        //adding student to the student list

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);


        // information display
        for (Student s :list){
            System.out.println(s.name+" "+s.className+" "+s.id);
        }



    }
}
