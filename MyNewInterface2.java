package rnd.collections;

public interface MyNewInterface2 {
	default void methodOne() {
		System.out.println("Default::Method::Interface::2");
	}
	
	public static void methodThree() {
		System.out.println("Static::Method::Interface::2");
	}
	default void methodFive() {
		
	}
}
