package model;

public class Decorate implements Bakery {

	@Override
	public void produce() {
		System.out.print(" And Decorated.");
		
	}

}
