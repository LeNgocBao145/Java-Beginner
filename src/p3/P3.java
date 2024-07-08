package p3;

import p1.P;

public class P3 extends p1.P {
	private void test() {
		P firstOb = new P();
		firstOb.a = 10;
		firstOb.b = 10;
		super.c = 10; // protected
		firstOb.d = 10;
	}

	public static void main(String[] args) {

	}
}
