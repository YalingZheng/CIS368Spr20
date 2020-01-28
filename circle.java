


public class circle {
	private double radius;
	protected String color;
	protected String fillcolor;
	
	// define a constructor
	circle(){
		//this.radius = 1;
		this(1, "red", "white");
	}
	
	circle(int radius, String color, String fillcolor){
		this.radius = radius;
		this.color = color;
		this.fillcolor = fillcolor;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	
	
}


