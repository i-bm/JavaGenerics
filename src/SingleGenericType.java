public class SingleGenericType<T> {
   private T dataType;
   public SingleGenericType(T dataType){
       this.dataType = dataType;
   }

   void printType(){
       System.out.println(dataType.getClass().getName());
   }

   void printValue(){
       System.out.println(dataType);
   }
}
