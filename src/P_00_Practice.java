
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perameter(){
        return 4*side;
    }
}

public class P_00_Practice {
    public static void main(String[] args) {

        //practice 1
        Employee emp = new Employee();
        emp.salary = 1300;

        emp.setName("jhon");
        System.out.println("The Employee Salary is : " + emp.getSalary());
        System.out.println("The Employee name is : " + emp.getName());

        Square sq = new Square();
        sq.side = 3;
        System.out.println( sq.area());
        System.out.println(sq.perameter());
    }
}

