package rnd.collections;

public interface MyNewInterface {
	
	default void methodOne() {
		System.out.println("Default::Method::Interface::1");
	}
	
	public void methodTwo();
	public static void methodThree() {
		System.out.println("Static::method::interface::1");
	}
}
