import java.awt.Color;
import java.util.Date;

public class TestCircle {

	public static void main(String[] args) {
		circle mycircle = new circle(100, "red", "black");
		
		String circlecolor = mycircle.getColor();
		
		circlecolor = "blue";
		
		System.out.println(mycircle.getColor());
		
		
		// is circle2 mutable?
		
		circle2 mycircle2 = new circle2(3);
		
		Color circle2color = mycircle2.getColor();
		
		System.out.println(mycircle2.getColor());
		
		
		
		// is circle3 mutable?
		
		circle3 mycircle3 = new circle3(1907);
	
		mycircle3.setColor(new Color(126));
		
		System.out.println(mycircle3.getColor());
		
		
		// is circle4 mutable (circle4 has a private Date data member)
		circle4 mycircle4 = new circle4(4);
		Date theCreDate = mycircle4.getCreDate();
		System.out.println(theCreDate);
		// now. change the Cre Date
		theCreDate.setTime(200000);				
		System.out.println(mycircle4.getCreDate());
	}

}
