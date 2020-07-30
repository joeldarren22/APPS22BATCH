package assignment;

public class Calculation extends AreaCal<Float> {

	@Override
	void square(Float length) {
		
		System.out.println("Area="+(length*length)+"m*m");
		
	}

	@Override
	void circle(Float radious) {
		System.out.println("Area="+(3.14f*(radious*radious))+"m*m");
		
		
	}

	@Override
	void triangle(Float base, Float height) {
		
		System.out.println("Area="+((base*height)/2.00f)+"m*m");
		
	}



	
}
