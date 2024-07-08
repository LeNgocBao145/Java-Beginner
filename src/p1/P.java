package p1;

public class P {

	// - public : công khai hoàn toàn (100%)
	public int a;

	// - (default): là public đối với class trong cùng package. là private khi khác
	// package
	int b; // (default)

	// - protected: được sử dụng với lớp cha/con (tính chất kế thừa : sẽ đề cập sau)
	protected int c;

	// - private: chỉ được sử dụng trong nội bộ class
	private int d;

//	Mức độ che dấu tăng dần theo mũi tên:
//	public -> protected -> {default} -> private
}
