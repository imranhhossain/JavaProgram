class Employe{
    int id;
    int salary;
    String name;

    public void employeeDetails (){
        System.out.println("The Employee name is : " + name);
        System.out.println("The Employee id is : " + id);
        System.out.println("The Employee Salary is : " + salary );
    }
    public int getSalary(){
        return salary;
    }
}

public class p_12_Custom_Class {
    public static void main(String[] args) {
        Employe emp1 = new Employe();
        emp1.id = 1;
        emp1.salary = 1000;
        emp1.name = "Jack";

        emp1.employeeDetails();
//        System.out.println("The Employee name is : " + emp1.name);
//        System.out.println("The Employee id is : " + emp1.id);
//        System.out.println("The Employee Salary is : " + emp1.salary);

        Employe emp2 = new Employe();
        emp2.id = 5;
        emp2.salary = 12000;
        emp2.name = "jhon";


        emp2.employeeDetails();
        System.out.println("The Employee Salary is : " + emp1.getSalary());
    }
}
