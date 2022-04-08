package structuralPractice;

class Triangle{
	double base;
	double height;

	public Triangle(int base, int height){
		this.base=base;
		this.height=height;
	}
}

class Rectangle{
	double length=20.0;
	double width=10.0;
}

class Calculator{
	double getArea(Rectangle rectangle) {
		return  rectangle.length*rectangle.width;
	}
}

class CalculatorAdapter{
	double getArea(Triangle triangle) {
		return triangle.base*triangle.height*0.5;
	}
}

public class AdpaterPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle=new Triangle(20,10);
		CalculatorAdapter calculatorAdapter=new CalculatorAdapter();
		double area=calculatorAdapter.getArea(triangle);
		System.out.println("Area of triangle is : "+area+" Sq. Unit.");
	}

}
