public class App {
    public static void main(String[] args) {
    SingleGenericType<Integer> integer = new SingleGenericType<>(22);
    SingleGenericType<Double> doub = new SingleGenericType<>(22.9);
       integer.printType();
       integer.printValue();

        doub.printType();
        doub.printValue();
        System.out.println();
        
        DoubleGenericType<Integer, Double> integerDouble = new DoubleGenericType<>(21,3.3);
        integerDouble.printType();
        integerDouble.printValue();
    }
}
