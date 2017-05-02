public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        //PUT YOUR CODE HERE
         double a = 0;//3.0;
	double b = 2.5;
	double c = -0.5;
    double d = b*b - 4*a*c;
    double D = Math.sqrt(d);
    double A = 2*a;
    double x1 = (-b + D)/A;
    double x2 = (-b - D)/A;
     if(d<0) {
    	System.out.println("x1=");
        System.out.println("x2=");
    	}
      if(a==0) {
      if (b==10){
    	 x1=0.0;
    	 x1=x2;
         System.out.println("x1=" + 0.0);
        System.out.println("x2=" + 0.0);
        }
        else{
    	System.out.println("x1=");
        System.out.println("x2=");
        }
    	}
        
        
        else {
    	System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    	}
        //PUT YOUR CODE HERE
    }
}
