package ch06.ex04.case04;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablet tablet1 = new Tablet();
		Tablet tablet2 = new Tablet();
		System.out.println(tablet1.equals(tablet2));
		
		Phone phone1 = new Phone("iPhone8");
		Phone phone2 = new Phone("iPhone8");
		System.out.println(phone1.equals(phone2));
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));
	}
}