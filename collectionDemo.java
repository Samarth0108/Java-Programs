// Collection Interface
// add()size()remove()getIndex() //not in collection
// Collection<integer>c=new ArrayList<Integer>();generic collection

import java.util.*;

class collectionDemo {
    public static void main(String args[])
	{
		Collection c = new ArrayList();
		c.add("A");
		c.add(23);
		c.add(true);
		c.add('c');
		c.add(4.5);
		c.add(2.3f);
		System.out.println("gGiven Collection: "+c);
		Iterator i = c.iterator();
            // Iterator is an inbuilt interface
            // iterator(): returns an iterator object (is an inbuilt method)
        while(i.hasNext()) // hasNext(): returns true if there is a next element
        {
        	System.out.println(i.next()); // next(): returns the next element
        }
    }
}