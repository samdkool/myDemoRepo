package rnd.collections;

public class DemoCollections implements MyNewInterface {
	public static void main(String[] args) {
		System.out.println("main method");
		MyNewInterface.methodThree();
		DemoCollections d = new DemoCollections();
		d.methodOne();
		d.methodTwo();
	}
	
	@Override
	public void methodTwo() {
		System.out.println("Hi i am implemented method");

	}
}
