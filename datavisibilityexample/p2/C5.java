package p2;

import p1.C1;

public class C5 {
	
	public static void main(String[] args) {
		C1 o = new C1();
		
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
