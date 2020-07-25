import java.util.ArrayList;
import java.util.Vector;

public class ListDemo 
{

	public static void main(String[] args) 
	{
// We wnat to create an ArrayList

		ArrayList al=new ArrayList();
		// How to add Objects to Collection
		al.add("Java"); // they are objects  // all.add(new String("Java"));
		al.add(new Float(1.8));
		al.add(1995);
		al.add("JSP");

		al.add("Java"); // they are objects  // all.add(new String("Java"));
		al.add(new Float(1.8));
		al.add(1995);
		al.add("JSP");

		al.add(1995);
		al.add("JSP");
		al.add("Springs");
		
		System.out.println(al);
		System.out.println(al.size());
		// Applying Generics to Make the ArrayList accept only String values
		
		ArrayList <String>al1=new ArrayList();
		// How to add Objects to Collection
		al1.add("Java"); // they are objects  // all.add(new String("Java"));
		al1.add("JSP");
		System.out.println(al1);
		
			
		Vector v=new Vector();
		System.out.println("Capcity:"+v.capacity());
		v.add("java");
		v.add("java");
		v.add("java");
		
		v.add("java");
		v.add("java");
		v.add("java");
		
		v.add("java");
		v.add("java");
		v.add("java");
		v.add("java");
		
		v.add("java");// 11th elemnts
		
		System.out.println("Capcity:"+v.capacity());

		

	}

}
