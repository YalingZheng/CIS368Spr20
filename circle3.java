import java.awt.Color;

public class circle3 {
	private double radius;
	protected Color color;
	protected Color fillcolor;
	
	// define a constructor
	circle3(){
		//this.radius = 1;
		this(1);
	}
	
	circle3(int radius){
		this.radius = radius;
		this.color = new Color(0);
		this.fillcolor = new Color(1);
	}

	public double getRadius() {
		return radius;
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color curcolor) {
		this.color = curcolor;
	}

	public Color getFillcolor() {
		return fillcolor;
	}

	
	
}


