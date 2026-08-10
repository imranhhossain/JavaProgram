class MYEmployee1 {
    private int id;
    private String name;

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


public class p_13_access_modifier {
    public static void main(String[] args) {
        MYEmployee1 emp = new MYEmployee1();
        emp.setName("jhon");
        emp.setId( 1 );

        System.out.println(emp.getId());
        System.out.println(emp.getName());

    }
}
