package cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(1);
		l1.add(4);
		l1.add(10);
		l1.add(3);
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}



		

	}

}
