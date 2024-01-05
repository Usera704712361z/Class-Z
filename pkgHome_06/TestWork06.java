package com.hspedu.pkgHome_06;

public class TestWork06 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("john", 'M', 30, 5);
        teacher.printInfo();
        System.out.println("-------------------");

        Student student = new Student("tom", 'M', 18, "20240103");
        student.printInfo();
        System.out.println("-------------------");

        Person[] persons = new Person[4];
        persons[0] = new Student("jerry", 'M', 16, "20240104");
        persons[1] = new Student("scott", 'M', 17, "20240105");
        persons[2] = new Teacher("jack", 'M', 30, 10);
        persons[3] = new Teacher("smith", 'M', 35, 15);

        TestWork06 test = new TestWork06();
        test.bubbleSort(persons);
        System.out.println("---ソートされた配列---");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        System.out.println("-------------------");

        for (int i = 0; i < persons.length; i++) {
            test.show(persons[i]);
        }
    }
    public void bubbleSort (Person[] persons){
        Person temp = null;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    public void show(Person p) {
        if(p instanceof Student) {
            Student stu = (Student) p;
            stu.study();
        } else if(p instanceof Teacher) {
            Teacher tea = (Teacher) p;
            tea.teach();
        } else {
            System.out.println("do nothing...");
        }
    }
}
