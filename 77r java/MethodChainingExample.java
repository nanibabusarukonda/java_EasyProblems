class MethodChainingExample {
    static int a = 20;
    static int b = 30;
    static void sum() {
        int s = a + b;
        System.out.println("Sum = " + s);
    }
    static void average() {
        sum();
        double avg = (a + b) / 2.0;
        System.out.println("Average = " + avg);
    }
    public static void main(String[] args) {
        average();
}
    }