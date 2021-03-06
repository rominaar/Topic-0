
public class TestMyComplex {
	public static void main(String[] args) {
		MyComplex c1 = new MyComplex(3, 0);
		MyComplex c2 = new MyComplex(5, 0);
		MyComplex c3 = new MyComplex(3, 6);
		
		System.out.println(c1.toString());   // explicit call MyPoint
	   
		System.out.println(c1.isReal());
		System.out.println(c2.isImaginary());
		System.out.println(c3.equals(2, 1));
		System.out.println(c3.equals(c1));
		System.out.println(c1.magnitude());
		System.out.println(c2.argumentInRadians());
		System.out.println(c1.conjugate());
		System.out.println(c1.add(c2));
		System.out.println(c1.multiplyWith(c3));
	  }
}
