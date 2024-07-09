package chapter06;

public class SinhVien {
	protected String name;
	protected long id;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return price * tax;
	}
}
