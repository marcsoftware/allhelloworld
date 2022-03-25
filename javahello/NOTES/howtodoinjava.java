////////////////////////////////////////////////////////////
/////////////////array//////////////////////////////////////
////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
import java.util.Arrays;
  
public class Print2dArray 
{
    public static void main(String[] args) 
    {
        int [][] cordinates = { {1,2}, {2,4}, {3,6,9} };
 
        System.out.println( Arrays.deepToString( cordinates ) );
    }
}


////////////////////////////////////////////////////////////
///////////////Array list///////////////////////////////////
https://howtodoinjava.com/java-arraylist/
////////////////////////////////////////////////////////////
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, 
               Cloneable, java.io.Serializable
{
  transient Object[] elementData;   //backing array
  private int size;         //array or list size
 
  //more code
}

////////////////////////////////////////////////////////////
Integer[] numArray = new Integer[5];
ArrayList<Integer> numList = new ArrayList<>();

ArrayList list = new ArrayList();
 
List<Integer> numbers = new ArrayList<>(6); 
 
Collection setOfElements = ...;
List<Integer> numbers = new ArrayList<>(setOfElements); 

/////////////////////////////////////////////////////////////

//Non-generic arraylist - NOT RECOMMENDED !!
ArrayList list = new ArrayList();
 
//Generic Arraylist with default capacity
List<Integer> numbers = new ArrayList<>(); 
 
//Generic Arraylist with the given capacity
List<Integer> numbers = new ArrayList<>(6); 
 
//Generic Arraylist initialized with another collection
List<Integer> numbers = new ArrayList<>( Arrays.asList(1,2,3,4,5) ); 

//////////////////////////////////////////////////////////

List<Integer> numbers = new ArrayList<>(6); 
 
numbers.add(1); // This runs fine
ArrayList<String> charList = new ArrayList<>(Arrays.asList(("A", "B", "C"));

ArrayList<String> alphabetsList = new ArrayList<>(Arrays.asList(("A", "B", "C"));
 
String aChar = alphabetsList.get(0);  // A
System.out.print( charList.size() );
//////////////////////////////////////////////////////////

ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
 
Iterator<Integer> iterator = digits.iterator();
 
while(iterator.hasNext()) 
{
  System.out.println(iterator.next());
}
//////////////////////////////////////////////////////////

ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
 
for(int i = 0; i < digits.size(); i++) 
{
    System.out.print(digits.get(i));
}

ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
 
for(Integer d : digits) 
{
    System.out.print(d);
}
////////////////////////////////////////////////////////////

AgeSorter.java
public class AgeSorter implements Comparator<Employee> 
{
    @Override
    public int compare(Employee e1, Employee e2) {
        //comparison logic
    }
}
AgeSorter.java
ArrayList<Employee> employees = new ArrayList<>();
 
employees.add(new Employee(...));
employees.add(new Employee(...));
employees.add(new Employee(...));
 
employees.sort(new NameSorter());
////////////////////////////////////////////////////////////////
/////////////linked list////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

LinkedList.java
public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
{
  //implementation
}

////////////////////////////////////////////////////////////////
LinkedListExample examples
import java.util.LinkedList;
import java.util.ListIterator;
 
public class LinkedListExample 
{
    public static void main(String[] args) 
    {
        //Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
         
        //Add elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
         
        System.out.println(linkedList);
         
        //Add elements at specified position
        linkedList.add(4, "A");
        linkedList.add(5, "A");
         
        System.out.println(linkedList);
         
        //Remove element
        linkedList.remove("A");   //removes A
        linkedList.remove(0);   //removes B
         
        System.out.println(linkedList);
         
        //Iterate
        ListIterator<String> itrator = linkedList.listIterator();
 
        while (itrator.hasNext()) {
            System.out.println(itrator.next());
        }
    }
}
///////////////////////////////////////////////////////////////

LinkedListExample examples
LinkedList<String> linkedList = new LinkedList<>();
 
linkedList.add("A");
linkedList.add("C");
linkedList.add("B");
linkedList.add("D");
 
//Unsorted
System.out.println(linkedList);
 
//1. Sort the list
Collections.sort(linkedList);
 
//Sorted
System.out.println(linkedList);
 
//2. Custom sorting
Collections.sort(linkedList, Collections.reverseOrder());
 
//Custom sorted
System.out.println(linkedList);


///////////////////////////////////////////////////////////////
////////////////hash map///////////////////////////////////////
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////


public class HashMap<K,V> extends AbstractMap<K,V> 
        implements Map<K,V>, Cloneable, Serializable  

///////////////////////////////////////////////////////////////        
static class Entry&lt;K ,V&gt; implements Map.Entry&lt;K, V&gt;
{
    final K key;
    V value;
 
    Entry&lt;K ,V&gt; next;
    final int hash;
 
    ...//More code goes here
}
/////////////////////////////////////////////////////////////
import java.util.HashMap;
 
public class HashMapExample 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        HashMap&lt;Integer, String&gt; map = new HashMap&lt;&gt;();
         
        map.put(1,  &quot;A&quot;);
        map.put(2,  &quot;B&quot;);
        map.put(3,  &quot;C&quot;);
         
        System.out.println(map);
    }
}
////////////////////////////////////////////////////////////////
HashMap&lt;Integer, String&gt; map = new HashMap&lt;&gt;();
         
map.put(1,  &quot;A&quot;);
map.put(2,  &quot;B&quot;);
map.put(3,  &quot;C&quot;);
 
String value = map.get(2);
 
System.out.println(&quot;The value is :: &quot;+  value );
///////////////////////////////////////////////////////////////////
HashMap&lt;Integer, String&gt; map = new HashMap&lt;&gt;();
 
map.put(1, &quot;A&quot;);
map.put(2, &quot;B&quot;);
map.put(3, &quot;C&quot;);
 
System.out.println(map);
 
map.remove(3);
 
System.out.println(map);
//////////////////////////////////////////////////////////////
HashMap&lt;Integer, String&gt; map = new HashMap&lt;&gt;();
 
map.put(1, &quot;A&quot;);
map.put(2, &quot;B&quot;);
map.put(3, &quot;C&quot;);
 
System.out.println(&quot;//Iterate over keys&quot;);
 
Iterator&lt;Integer&gt; itr = map.keySet().iterator();
 
while (itr.hasNext()) 
{
    Integer key = itr.next();
    String value = map.get(key);
     
    System.out.println(&quot;The key is :: &quot; + key + &quot;, and value is :: &quot; + value );
}
 
System.out.println(&quot;//Iterate over entries set&quot;);
 
Iterator&lt;Entry&lt;Integer, String&gt;&gt; entryIterator = map.entrySet().iterator();
 
while (entryIterator.hasNext()) 
{
    Entry&lt;Integer, String&gt; entry = entryIterator.next();
     
    System.out.println(&quot;The key is :: &quot; + entry.getKey() + &quot;, and value is :: &quot; + entry.getValue() );
}
///////////////////////////////////////////////////
///////HASH TABLE//////////////////////////////////
///////////////////////////////////////////////////
///////////////////////////////////////////////////
///////////////////////////////////////////////////

public class Hashtable<K,V>
    extends Dictionary<K,V>
    implements Map<K,V>, Cloneable, java.io.Serializable 
{
  //implementation
}


/////////////////////////////////////
Hashtable Example
import java.util.Hashtable;
import java.util.Iterator;
 
public class HashtableExample 
{
    public static void main(String[] args) 
    {
        //1. Create Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
         
        //2. Add mappings to hashtable 
        hashtable.put(1,  "A");
        hashtable.put(2,  "B" );
        hashtable.put(3,  "C");
         
        System.out.println(hashtable);
         
        //3. Get a mapping by key
        String value = hashtable.get(1);        //A
        System.out.println(value);
         
        //4. Remove a mapping
        hashtable.remove(3);            //3 is deleted
         
        //5. Iterate over mappings
        Iterator<Integer> itr = hashtable.keySet().iterator();
         
        while(itr.hasNext()) 
        {
            Integer key = itr.next();
            String mappedValue = hashtable.get(key);
             
            System.out.println("Key: " + key + ", Value: " + mappedValue);
        }
    }
}
///////////////////////////////////////////////////
///////LINKED HASH MAP/////////////////////////////
///////////////////////////////////////////////////
///////////////////////////////////////////////////
///////////////////////////////////////////////////

LinkedHashMap<Integer, String> pairs = new LinkedHashMap<>();
         
pairs.put(1,  "A");
pairs.put(2,  "B");
pairs.put(3,  "C");
pairs.put(4,  "D");
 
pairs.forEach((key, value) -> {
    System.out.println("Key:"+ key + ", Value:" + value);
});


/////////////////////////////
//3rd parameter set access order
LinkedHashMap<Integer, String> pairs = new LinkedHashMap<>(2, .75f, true);
 
pairs.put(1,  "A");
pairs.put(2,  "B");
pairs.put(3,  "C");
pairs.put(4,  "D");
 
//Access 3rd pair
pairs.get(3);
 
//Access 1st pair
pairs.getOrDefault(2, "oops");
 
pairs.forEach((key, value) -> {
    System.out.println("Key:"+ key + ", Value:" + value);
});  
///////////////////////
LinkedHashMap examples
import java.util.Iterator;
import java.util.LinkedHashMap;
 
public class LinkedHashMapExample 
{
    public static void main(String[] args) 
    {
        //3rd parameter set access order
        LinkedHashMap<Integer, String> pairs = new LinkedHashMap<>();
         
        pairs.put(1,  "A");
        pairs.put(2,  "B");
        pairs.put(3,  "C");
         
        String value = pairs.get(3);    //get method
         
        System.out.println(value);
         
        value = pairs.getOrDefault(5, "oops");  //getOrDefault method
         
        System.out.println(value);
         
        //Iteration example
        Iterator<Integer> iterator =  pairs.keySet().iterator();
         
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + pairs.get(key));
        }
         
        //Remove example
        pairs.remove(3);
        System.out.println(pairs);
         
        System.out.println(pairs.containsKey(1));    //containsKey method   
         
        System.out.println(pairs.containsValue("B"));    //containsValue method   
    }
}

///////////////////////

Map<Integer, Integer> numbers = Collections.synchronizedMap(new LinkedHashMap<>());
 
Map<Integer, Integer> numbers = Collections.synchronizedMap(new HashMap<>());

///////////////////////

🎴🎴🎴🎴🎴🎴TreeMap               🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴HashSet               🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴LinkedHashSet         🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴TreeSet               🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Comparable            🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Comparator            🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Iterator              🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴ListIterator          🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Spliterator           🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴PriorityQueue         🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴PriorityBlockingQueue 🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴ArrayBlockingQueue    🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴LinkedTransferQueue   🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴CopyOnWriteArrayList  🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴CopyOnWriteArraySet   🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Collection Sorting    🎴🎴🎴🎴🎴🎴
🎴🎴🎴🎴🎴🎴Interview Questions   🎴🎴🎴🎴🎴🎴