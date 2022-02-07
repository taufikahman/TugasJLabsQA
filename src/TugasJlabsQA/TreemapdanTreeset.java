package TugasJlabsQA;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.HashSet;

public class TreemapdanTreeset {
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(1007);
		number.add(1006);
		number.add(1001);
		number.add(1010);
		number.add(1008);
		number.add(1004);
		
		number.add(1,1003);
		number.add(2,1009);
		number.remove(0);

		for (Integer item : number) {
			System.out.println(item);
		}
		
	/*Java TreeMap provides an efficient means of storing key-value pairs in sorted order.
		The important points about Java TreeMap class are:
		Java TreeMap contains values based on the key. 
		It implements the NavigableMap interface and extends AbstractMap class.
		- Java TreeMap contains only unique elements.
		- Java TreeMap cannot have a null key but can have multiple null values.
		- Java TreeMap is non synchronized.
		- Java TreeMap maintains ascending order.
	 * 
	 */
		TreeMap<Integer, String> Employee = new TreeMap<>();
		
		Employee.put(109, "Zacky");
		Employee.put(102, "Mark");
		Employee.put(103, "Zuckenberg");
		Employee.put(104, "Steve");
		Employee.put(105, "Billgates");
		Employee.put(105, "Ramli");
		Employee.put(106, "Ramzi");
		
		for (Integer key : Employee.keySet()) {
		System.out.println("Employee ID for " + Employee.get(key) + " is " + key);
		}
		//System.out.println(Employee);
			
		//Employee.forEach((k,v) -> System.out.println("ID Number = " + k +" "+ "is for =" + v));
		
		//System.out.println(Employee.lastKey());
		//System.out.println(Employee.firstKey());
		
		//New TreeMap Example
		{
		TreeMap<String, Integer> UserMap = new TreeMap<>();
		UserMap.put("Albert", 100);
		UserMap.put("Clayy", 200);
		UserMap.put("Xinn", 400);
		UserMap.put("Monaru", 50);
		UserMap.put("Jeje", 120);
		UserMap.put("Juju", 300);
		
		UserMap.forEach((k,v) ->System.out.println("Salary for = " + k + " " + "is = " + v));
		
		HashSet<Integer> mySet = new HashSet<Integer>();
		mySet.add(88);
		mySet.add(99);
		mySet.add(66);
		mySet.add(77);
		mySet.add(55);
		mySet.add(44);
		System.out.println(mySet);
		
		}
		 
		{
/*Java TreeSet implements the Set interface that uses a tree for storage. 
 * It inherits AbstractSet class and implements the NavigableSet interface. 
 * The objects of the TreeSet class are stored in ascending order.
	The important points about Java TreeSet are:
	- Java TreeSet contains unique elements only like HashSet.
	- Java TreeSet access and retrieval times are quiet fast.
	- Java TreeSet doesn't allow null element.
	- Java TreeSet is non synchronized.
	- Java TreeSet maintains ascending order.
 * 
 */
			TreeSet<Integer> set=new TreeSet<Integer>();  
	         set.add(24);  
	         set.add(66);  
	         set.add(12);  
	         set.add(15);  
	         System.out.println("Highest Value: "+set.pollFirst());  
	         System.out.println("Lowest Value: "+set.pollLast());  
		  }
		TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);  
          
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet("C", true));  
         
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+set.tailSet("C", false));  
	}
	

}
