public class DoubleGenericType<T, V> {
    T t1;
    V t2;

    public DoubleGenericType(T t1, V t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    void printType(){
        System.out.println("Data Type of Parameters: " + t1.getClass().getName() + " & "+ t2.getClass().getName() );
    }

    void printValue(){
        System.out.println("Values of Parameters: " + t1 +" & " + t2);

    }
}
