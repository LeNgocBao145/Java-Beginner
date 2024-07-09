package Lab07;

public class lab7 {
	public static void main(String[] args) {
		Sinhvien it1 = new SinhvienIT(10, 9);
		System.out.println("Score of IT " + it1.getDiem());
		Sinhvien cokhi1 = new SinhvienCoKhi(7, 4);
		System.out.println("Score of Engineer " + cokhi1.getDiem());
	}
}
