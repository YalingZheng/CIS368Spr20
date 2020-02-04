package p2;

import p1.C1;

public class C4 extends C1{
	// can it access C1's x (public)?
	// C1 is in package p1
	public void method1 () {
		C4 o = new C4();
		o.y = 20;
		o.z = 100; // z is a data member without modifier
	}
	
	public static void main(String[] args) {
		C1 o = new C4();
		
		// can it access o.x (public)?
		o.x = 10;
		// can it access o.y (protected)?
		o.y = 20;
		// can it access o.z (no modifier)?
		o.z = 100;
		// can it access o.u (private)?
		o.u = 300;
		// can it invoke C1's method pubmethod?
		o.pubmethod();
		
		// can it invoke C1's method m (protected)?
		o.m();
	}

}
