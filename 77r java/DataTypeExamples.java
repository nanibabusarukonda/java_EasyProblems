public class DataTypeExamples {

    // 1. Method to return a byte value
    public byte getByteValue() {
        return 10;
    }

    // 2. Method to return a short value
    public short getShortValue() {
        return 200;
    }

    // 3. Method to return an int value
    public int getIntValue() {
        return 3000;
    }

    // 4. Method to return a long value
    public long getLongValue() {
        return 40000L;
    }

    // 5. Method to return a float value
    public float getFloatValue() {
        return 12.34f;
    }

    // 6. Method to return a double value
    public double getDoubleValue() {
        return 123.456;
    }

    // 7. Method to return a char value
    public char getCharValue() {
        return 'A';
    }

    // 8. Method to return a boolean value
    public boolean getBooleanValue() {
        return true;
    }

    // 9. Method to return a String value
    public String getStringValue() {
        return "Hello, Java!";
    }

    // Main method
    public static void main(String[] args) {
        // Create object of class to call instance methods
        DataTypeExamples obj = new DataTypeExamples();

        // Call and print each method
        byte byteValue = obj.getByteValue();
        System.out.println("Byte Value: " + byteValue);

        short shortValue = obj.getShortValue();
        System.out.println("Short Value: " + shortValue);

        int intValue = obj.getIntValue();
        System.out.println("Int Value: " + intValue);

        long longValue = obj.getLongValue();
        System.out.println("Long Value: " + longValue);

        float floatValue = obj.getFloatValue();
        System.out.println("Float Value: " + floatValue);

        double doubleValue = obj.getDoubleValue();
        System.out.println("Double Value: " + doubleValue);

        char charValue = obj.getCharValue();
        System.out.println("Char Value: " + charValue);

        boolean booleanValue = obj.getBooleanValue();
        System.out.println("Boolean Value: " + booleanValue);

        String stringValue = obj.getStringValue();
        System.out.println("String Value: " + stringValue);
    }
}