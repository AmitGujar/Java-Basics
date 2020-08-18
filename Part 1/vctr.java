import java.util.Vector;
//understanding vectors
public class vctr {
    public static void main(String[] args) {
        Vector V = new Vector();
        V.add(0); //[0]
        V.add(1); //[0, 1]

        V.addElement(2);    //[0, 1, 2]
        V.addElement("SY");     //[0, 1, 2, SY]

        V.setElementAt("FY",2); //To sets/replace element at specified index [0, 1, FY, SY]
        V.setElementAt("TY", 3); //To insert element specified index [1, FY, TY, SY]

        System.out.println(V);

        System.out.println("Default Capacity of vector = " + V.capacity()); //capacity if vactor
        System.out.println("Size of vector = " + V.size()); //size of vector

        System.out.println("get()" + V.get(2)); // get () FY
        System.out.println("firstelement() " + V.firstElement()); //first element fro vector
        System.out.println("lastelement() " + V.lastElement());

        if (V.contains("FY"))
            System.out.println("Present");
        else
            System.out.println("Not Present");
        V.remove(1);
        System.out.println(V);

        V.clear();
        if (V.isEmpty())
            System.out.println("Vector is clear");
        Vector V1 = new Vector();
        V1.add(0);
        V1.add(1);
        V1.add(2);
        Vector V2 = new Vector();
        V2.add(0);
        V2.add(1);
        V2.add(3);

        if (V1.equals(V2))
            System.out.println("both are equal");
        else
            System.out.println("both r not equal");

        V1.removeAllElements();
        if (V1.isEmpty())
            System.out.println("Empty");
        String [] str = new String[7];
        V.copyInto(str);
        for (int i = 0; i < 7; i++) {
            System.out.println(str[i]);
        }
    }
}
