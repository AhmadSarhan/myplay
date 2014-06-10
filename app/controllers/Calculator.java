package controllers;


public class Calculator {

	
	private  double x1;
	private  double x2;
	private  double x;
	
	 public  String get_x1()
	  {
		  return String.valueOf(x1);
	  }
	 public  String get_x()
	  {
		  return String.valueOf(x);
	  }
	  
	  public  String get_x2()
	  {
		  return String.valueOf(x2);
	  }  

	public  void  calculate(Application.Equation eq) {

		  double delta;
		  delta = Math.pow(eq.b, 2) - (4 * eq.a * eq.c);
		 x=eq.b;
		 if(delta==0){
				x1=(2*eq.b)/eq.a;
				x2=-(2*eq.b)/eq.a;	
			  }
		 if (delta>0){
			 x1 =  (-(eq.b) + Math.sqrt(delta)) / 2*eq.a ;
			 x2 = (-(eq.b) - Math.sqrt(delta)) / 2*eq.a;
			  }
	  }
	  
	 
}
