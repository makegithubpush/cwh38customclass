//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
 class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); //Instantiating a new Employee Object
        Employee john = new Employee();  //Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 13;
        john.salary = 12;
        john.name = "John Tripathi";

        //Printing the attributes
        harry.printDetails();
        harry.getSalary();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        //System.out.println(Harry.id);
        //System.out.println(Harry.name);

    }
}