import java.util.Collection;
import java.util.*;

public class SimpleCollection {
//Chapter3 OPP - 3.11 : Lab 3.11 SimpleCollection
	public static void main(String[] args) {
		Collection c;
		c = new ArrayList();
		System.out.println(c.getClass().getName());
		for (int i = 1; i <= 10; i++) {
			c.add(i + "*" + i + "=" + i * i);
		}
		Iterator iter = c.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
