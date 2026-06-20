public class P_03_String_Methods {
    public static void main(String[] args) {
        String name = "Imran";

        int value = name.length();
        System.out.println(value);

        boolean isempty = name.isEmpty();
        System.out.println(isempty);

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf('a'));
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2));
        System.out.println(name.startsWith("Im"));
        System.out.println(name.endsWith("ran"));

        System.out.println(name.equals("Imran"));
        System.out.println(name.equals("imran"));
        System.out.println(name.equalsIgnoreCase("imran"));


        System.out.println("Hello \n world");
        System.out.println("Hello \t world");
        System.out.println("Hello \b world");
        System.out.println("Hello \r world");
        System.out.println("Hello \f world");
        System.out.println("Hello \\ world");
        System.out.println("Hello \' world");



    }
}
