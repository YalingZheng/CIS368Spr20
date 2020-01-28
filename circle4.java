import java.awt.Color;
import java.util.Date;

public class circle4 {
	private double radius;
	private Date CreDate;
	protected Color color;
	protected Color fillcolor;
	
	// define a constructor
	circle4(){
		//this.radius = 1;
		this(1);
	}
	
	circle4(int radius){
		this.radius = radius;
		this.color = new Color(0);
		this.fillcolor = new Color(1);
		this.CreDate = new Date();
	}

	public double getRadius() {
		return radius;
	}

	public Color getColor() {
		return color;
	}

	public Color getFillcolor() {
		return fillcolor;
	}

	public Date getCreDate() {
		return CreDate;
	}

	
	
}


