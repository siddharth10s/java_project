package ObjectOrientedProgramming.Constructor;

import memoryManagement.binaryOperator.arithematicOperator.mod;

class Employee{

    String name;
    String post;
    int id;
    float salary;
    float increment;

    Employee(String name, String post, int id){
        this.name=name;
        this.post=post;
        this.id=id;
    }

    Employee(String name, String post, int id, float salary){
        this(name, post, id); //constructor calling from previous constructor. it must be done before adding new "this" property
        this.salary=salary;
    }
    Employee(String name, String post, int id, float salary, float increment){
        this(name, post, id, salary);
        this.increment=increment;
    }

    void disp(){
        System.out.println("Name of emploee is " + name + " working on " + post + " with id " + id);
        System.out.println("The salary is " + salary);
        System.out.println("He gets annual increment of " + increment + "%");

    }
}

public class ConstrctorOverloading {
    public static void main(String[] args) {
        Employee e1 = new Employee("kullu", "sales", 456);
        Employee e2 = new Employee("paji", "tech",123, 1025.5f );
        Employee e3 = new Employee("lali","marketing", 789, 1235.654f, 10.5f);

        e1.disp();
        e2.disp();
        e3.disp();

    }    
}
