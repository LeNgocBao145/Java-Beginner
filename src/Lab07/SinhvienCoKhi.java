package Lab07;

public class SinhvienCoKhi extends Sinhvien {
	// private String skill;
	private double scoreCNC;
	private double scorePLC;

	@Override
	double getDiem() {
		// TODO Auto-generated method stub
		return (scoreCNC + scorePLC) / 2;
	}

	public SinhvienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

}
