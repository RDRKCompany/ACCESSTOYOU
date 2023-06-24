package accessmodifierstest1;

public class ClassA {

	public static void main(String[] args) 

	{
		console.log("dvkjvnk");
		defaultmethod();
		privatemethod();
		protectedmethod();
		publicmethod();
		
		
		System.out.println(dvar);
		System.out.println(privar);
		System.out.println(provar);
		System.out.println(pubvar);
		
	}

	public  ClassA(){
		
		System.out.println("hello world");
		System.out.println(privar);
	
	}
	
	public  ClassA(int a, int b){
		
	System.out.println("hfhhf");
	 int sum =(a+b);
	
	privar = "qedge.com";
		
	} 
	static int dvar =123;
	
	private static String privar = "qedge";
	
	protected static int provar = 1234;
	
	public static String pubvar = "qedge.com";
	
	
	

	 static void defaultmethod(){
		System.out.println("default method");
	}
	 
	 
	private final static  void privatemethod(){
		
		
		System.out.println("private method");
		
	}

	
	protected final static  void protectedmethod(){
		System.out.println("protected method");
	}
	
	
	public static  void publicmethod(){
		System.out.println("public method");
	}
	
	void m2(){
		
	System.out.println(privar);
		
	}
	
}
