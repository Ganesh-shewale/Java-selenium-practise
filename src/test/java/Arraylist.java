import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Character> a=new ArrayList<>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		
		for(Character ch:a)
		{
			System.out.println(ch);
			ArrayList<Character> list=new ArrayList<>(Arrays.asList('a','e','i','u'));
			System.out.println(list);
		}
	}

}
