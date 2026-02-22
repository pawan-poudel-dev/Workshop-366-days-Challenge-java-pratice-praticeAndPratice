public class DefaultValue {
    // Instance variables are automatically assigned default values
    static boolean valBoolean;
    static byte valByte;
    static short valShort;
    static int valInt;
    static long valLong;
    static float valFloat;
    static double valDouble;
    static char valChar;
    static String valString; // String is a reference type, defaults to null

    public static void main(String[] args) {
        System.out.println("Default values of instance/static variables:");
        System.out.println("boolean: " + valBoolean);
        System.out.println("byte: " + valByte);
        System.out.println("short: " + valShort);
        System.out.println("int: " + valInt);
        System.out.println("long: " + valLong);
        System.out.println("float: " + valFloat);
        System.out.println("double: " + valDouble);
        System.out.println("char: " + (valChar == '\u0000' ? "'\\u0000' (null character)" : valChar));
        System.out.println("String: " + valString);
    }
}
