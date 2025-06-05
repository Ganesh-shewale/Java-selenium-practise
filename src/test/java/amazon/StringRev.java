package amazon;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ganesh";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
