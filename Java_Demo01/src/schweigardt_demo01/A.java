package schweigardt_demo01;

final class A implements Cloneable {
	private int x;
	private int[] arr;

	public A() {
	}

	public A(int x, int[] arr) {
		this.x = x;
		this.arr = arr;
	}

//	public void setX(int x) {
//		this.x = x;
//	}

	public int getX() {
		return this.x;
	}

//	public void setArr(int[] arr) {
//		this.arr = arr;
//	}

	public int[] getArr() {
//		int[] temp = new int[this.arr.length];
//		for (int i = 0; i < this.arr.length; i++) {
//			temp[i] = arr[i];
//		}
//		return temp;
		return this.arr;
	}

	public String toString() {
		String str = super.toString() + ", int x: " + this.x + ", int[] arr: ";
		for (int i = 0; i < this.arr.length; i++) {
			str += arr[i] + " ";
		}
		return str;
	}

	public A shallowClone() throws CloneNotSupportedException {
		return (A) super.clone();
	}

	public A deepClone() throws CloneNotSupportedException {
		return new A(this.x, this.arr.clone());
	}
}
