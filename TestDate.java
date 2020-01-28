import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date mydate = new Date();
		// what does this do?
		System.out.println(mydate.getTime());
		// what does this do?
		System.out.println(mydate.toString());	
		// How do you use SimpleDateFormat to display a date format you want?
		// check http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		System.out.println();
		
	}
}
