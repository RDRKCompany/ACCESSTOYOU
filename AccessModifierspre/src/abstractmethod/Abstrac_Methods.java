package abstractmethod;

import accessmodifierstest1.ClassA;

//changed  in eclipse  // after chaging of the code from github
public  abstract  class Abstrac_Methods {		//abstract class
	
	 abstract  void m1();						//abstract method
	
	 abstract int sumoftwo(int a, int b);		
	 
	void m2(){									//concreate method
		
		System.out.println("concreate method");
	}
}
class Ass extends  Abstrac_Methods {	
	
	void m1(){
		
		System.out.println("iam abstract method");
		}
	int sumoftwo(int a, int b){
		
		int sum=(a+b);
		return sum;
		
	}
	
	
}
 

	
	




