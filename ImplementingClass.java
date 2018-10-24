package rnd.collections;

public class ImplementingClass implements MyNewInterface,MyNewInterface2 {

	@Override
	public void methodTwo() {
		// Here I am the implemented method
		System.out.println("implemented Mehod");
		MyNewInterface.super.methodOne();
	}

	@Override
	public void methodOne() {
		System.out.println("default method impl");
	}

	/*
	 * when a class is implementing more than one interface at a time
	 * and all the interfaces have default methods with same name then
	 * that time the implementing class need to override the default method
	 * or we can also call the that interface specific method from the overridden method
	 */

	
	
	
}
