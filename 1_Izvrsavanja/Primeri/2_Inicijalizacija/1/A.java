class A{
	static String a;
	static {
		a = "A";
		System.out.println("A");
	}
	public String toString(){
		return a;
	}
}

class B extends SuperKlasa{
	static{
		System.out.println("B");
	}
}