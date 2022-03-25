
    package person;
import java.util.Arrays;
    public class Java8Tester {

                

      public class ArrayList<E> extends AbstractList<E>
      implements List<E>, RandomAccess, 
             Cloneable, java.io.Serializable
{
transient Object[] elementData;   //backing array
private int size;         //array or list size

//more code
}

        public static void main(String args[]) {
         
         String[] array = new String[] {"John", "Mary", "Bob"};
         System.out.println(Arrays.toString(array));
         System.out.println("DONE");
         }


    }
