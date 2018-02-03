package package1;

public class Child extends Parent{
	
	
		public String test="Hello I am a Test from Child class";
		
		
		public static void main(String[] args){
			Parent p=new Child();
			//p.test1();
		}
		
		public void test1(){
			System.out.println("Child Method test 1");
		}
		public void test2(){
			super.test2();
		}
	

}