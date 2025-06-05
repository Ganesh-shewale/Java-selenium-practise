import java.util.ArrayList;
import java.util.Iterator;
public class FruitIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("pineapple");
		fruits.add("watermelon");
		
		Iterator<String> it=fruits.iterator();
		while(it.hasNext()) {
			if(it.equals("banana")){
				it.remove();
			}
			String fruit=it.next();
		
			
		}
		System.out.println(it);
		

	}

}
