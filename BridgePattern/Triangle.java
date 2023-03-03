package BridgePattern;

public class Triangle  extends Shape{

	public Triangle(Color c) {
		super(c);
		
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle in color");
		color.applyColor();
		
	}

}
