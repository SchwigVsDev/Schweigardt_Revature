package schweigardt_demo01;

public class DemoOne {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.print("Hello, Meatbags!\n----------------\n");
		int[] arr = { 1, 2, 3 };
		A a = new A(1, arr);
		A b = a.shallowClone();
		A c = a;
		A d = a.deepClone();
		
		d.getArr()[1] = 5;

		System.out.println("a: " + a);
		System.out.println("\nb: " + b);
		System.out.println("\nc: " + c);
		System.out.println("\nd: " + d);
		

		System.out.print("\nShallow Clone | a == b?: ");
		if (a == b) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		
		System.out.print("\nCreating 2nd Reference | a == c?: ");
		if (a == c) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
		
		System.out.print("\nDeep Clone | a == d?: ");
		if (a == d) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}

}
