
public class TestStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder mystrbuilder = new StringBuilder();
		mystrbuilder.append("This is awesome").append("Great job")
					.delete(0,3).setCharAt(0, 'Z');
		String thefinalstr = mystrbuilder.toString();		
		System.out.println("the string is " + thefinalstr);

		
		
	}

}
