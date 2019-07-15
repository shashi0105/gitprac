package Basic_Test_I;

public class child extends parent  {
	public void m3() {
		System.out.println("method m3");
	    super.m2();
	    super.m1();
		}
		public static void main(String[] args) {
		//parent p = new parent();
		//p.m1();
		child c = new child();
		c.m3();
		}
}
