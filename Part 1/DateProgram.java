import java.util.Date;

class DateProgram {
    public static void main(String[] args) {
//        Primitive type don't need to allocate memory
        byte age = 30;
//        Reference type needs to allocate memory
        Date now = new Date();
        System.out.println(now);
        System.out.println(age);
    }
}