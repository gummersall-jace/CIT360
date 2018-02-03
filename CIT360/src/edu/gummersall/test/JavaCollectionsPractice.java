package edu.gummersall.test;

import java.util.*;


public class JavaCollectionsPractice {
	public static void main(String[] args) {
		//LIST INTERFACE
		List<String> a1 = new ArrayList<String>();
		a1.add("Craig");
		a1.add("Carl");
		a1.add("Charly");      
		System.out.println("ArrayList Elements");
		System.out.print("\t" + a1);
		
		List<String> l1 = new LinkedList<String>();
		l1.add("Charlie");
		l1.add("Craig");
		l1.add("Carl");
		System.out.println();
		System.out.println("\nLinkedList Elements");
		System.out.print("\t" + l1);
		
		//SET INTERFACE
	    int count[] = {340, 242, 110, 670, 930, 232};
	    Set<Integer> set = new HashSet<Integer>();
	    	try {
	    		for(int i = 0; i < 6; i++) {
	            set.add(count[i]);
	         }
	    		System.out.println();
	    		System.out.println("\nSet Interface:");
	        System.out.println("\t" + set);
	
	        TreeSet sortedSet = new TreeSet<Integer>(set);
	        System.out.println("\nTree Set:");
	        System.out.println("\tThe sorted list is:");
	        System.out.println("\t" + sortedSet);
	        System.out.println("\tThe First element of the set is: "+ (Integer)sortedSet.first());
	        System.out.println("\tThe last element of the set is: "+ (Integer)sortedSet.last());
	      }
	      catch(Exception e) {}
	    	  
	      //MAP INTERFACE
	      Map<String, Integer> m1 = new HashMap<String, Integer>(); 
	      m1.put("Jim", 65000);
	      m1.put("John", 85000);
	      m1.put("Jesse", 70000);
	      m1.put("James", 62000);
	
	      System.out.println("\nMap Elements");
	      System.out.print("\t" + m1);
	      
	      System.out.println("\n\tIterate over Map:");
	      for(Map.Entry<String, Integer> entry : m1.entrySet()) {
	    	  	System.out.println("\t\tName: " + entry.getKey() + "\tSalary: $" + entry.getValue());
	      }
	      
	      //QUEUE INTERFACE
	      Queue<String> queueA = new LinkedList<String>();
	
	      queueA.add("taco");
	      queueA.add("burrito");
	      queueA.add("enchilada");
	      
	      System.out.println("\n\nQueue Interface:");
	      System.out.println("\t" + queueA);
	     
	      //access via Iterator
	      Iterator<String> iterator = queueA.iterator();
	      System.out.println("\n\tIterator with while loop:");
	      while(iterator.hasNext()){
	        String element = (String) iterator.next();
	        System.out.println("\t\t" + element);
	      }
	      
	      //access via new for-loop
	      System.out.println("\n\tIterator with for loop:");
	      for(Object object : queueA) {
	          String element = (String) object;
	          System.out.println("\t\t" + element);
	      }
	      
	      // TREE INTERFACE
	      TreeSet<String> ts = new TreeSet<String>();
	     
	      ts.add("Cow");
	      ts.add("Ant");
	      ts.add("Bear");
	      ts.add("Eagle");
	      ts.add("Fox");
	      ts.add("Dog");
	      System.out.println("\nTree Interface (Again):");
	      System.out.println("\t" + ts);
	      
	      System.out.println("\tIterate over Animals in Alaphbetical Order:");
	      for(String animals : ts) {
	      System.out.println("\t\t"+ animals);
	      }
	      
  }
}

