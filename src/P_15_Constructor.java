class MYEmployee {
    private int id;
    private String name;

    //Constructor
//    public MYEmployee() {
//        this.id = 5;
//        this.name = "Jhon";
//    }

    //Constructor Overloading
    public MYEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int   getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


public class P_15_Constructor {
    public static void main(String[] args) {

        MYEmployee emp = new MYEmployee(4, "jack");// Argument pass by using Constructor
//        emp.setName("jhon");
//        emp.setId( 1 );

        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
