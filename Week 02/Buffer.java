public class Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println("Original: " + stringBuffer);
        stringBuffer.delete(5, 12);
        System.out.println("After deletion: " + stringBuffer);
        stringBuffer.insert(5, "!");
        System.out.println("After insertion: " + stringBuffer);
    }
}
