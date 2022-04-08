package structuralPractice;

abstract class Component{
	abstract void makeHouse();
}

class ConcreteComponent extends Component{
	void makeHouse() {
		System.out.println("Original House is complete. It is closed for modification.");
	}
}

abstract class AbstractDecorator extends Component{
	private Component component;
	
	void setTheComponent(Component component) {
		this.component=component;
	}
	
	void makeHouse() {
		component.makeHouse();
//		System.out.println("Original House is complete. It is closed for modification.");
	}
}

class FloorDecorator extends AbstractDecorator{
	void makeHouse() {
		System.out.println("Using the Floor decorator now.");
		super.makeHouse();
	}
	void addFloor() {
		System.out.println("***Floor decorator is in action***");
		System.out.println("I am making additional floor on top of it.");
	}
}

class PaintDecorator extends AbstractDecorator{
	void makeHouse() {
		System.out.println("Using the Paint decorator now.");
		super.makeHouse();
	}
	void paintTheHouse() {
		System.out.println("***Paint decorator is in action***");
		System.out.println("I am making additional paint on top of it.");
	}
}

public class DecoratorPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Decorator Pattern demo***");
		ConcreteComponent concreteComponent=new ConcreteComponent();
		concreteComponent.makeHouse();
		
		System.out.println("_____________________");
		
//	    FloorDecorator floorDecorator=new FloorDecorator();
////		floorDecorator.setTheComponent(floorDecorator);
//		floorDecorator.makeHouse();
//		floorDecorator.addFloor();
		
		System.out.println("_____________________");
		
		PaintDecorator paintDecorator=new PaintDecorator();
		paintDecorator.setTheComponent(concreteComponent);
		paintDecorator.makeHouse();
		paintDecorator.paintTheHouse();
	}

}
