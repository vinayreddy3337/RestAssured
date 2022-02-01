import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>a =new ArrayList<Integer>();
		a.add(4);
		a.add(3);
		a.add(3);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(5);
		a.add(7);
		Collections.sort(a);
		System.out.println(a);
	}

}
