public class cdemo {
    //working wid more then one class
    public static void main(String[] args) {
        A obj = new A();
        obj.a = 10;
        obj.b = 20;
        obj.display();
    }
}
class A
{
    int a, b;
    void display()
    {
        System.out.println("a + b = " + (a+b));
    }
}