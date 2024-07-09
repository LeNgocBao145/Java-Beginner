package Lab07;

public class SinhvienIT extends Sinhvien {
	// private String programLanguage;
	private double scoreJava;
	private double scoreHTML;

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (scoreJava * 2 + scoreHTML) / 3;
	}

	public SinhvienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

}
