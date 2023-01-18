package classpackage;

// class for final key

public class AreaOfTheCircle {
	float radius;
	 final float pi = 22/7f;
	float area;
	
	public AreaOfTheCircle(float r) {
		radius = r;
	}
	public void Area() {
		area=pi *radius*radius;
		System.out.println("Area Of The Cicle is : "+area);
			}
	public static void main(String[] args) {
		AreaOfTheCircle circle = new AreaOfTheCircle(7f);
		circle.Area();
	}

}
