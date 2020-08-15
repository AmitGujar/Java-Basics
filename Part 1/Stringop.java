class Stringop {
    public static void main(String[] args) {
        //reference type but short hand method of string
        //strings in java are immuatable/we can't change them
        String message = " Hello World " + "!!";
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);
//        escape sequence are same as c++/c
        String escape = "Hello\tAmit";
        System.out.println(escape);

    }
}