package one;

public class Shape{
		   static double side;
           double  length;
           double  breath;
           public Shape(double side) {
        	   this.side =side;
           }
           public Shape(double length, double breath) {
        	   if((length>0.0&&length<20.0)&&(breath>0.0&&breath<20.0)) {
        		   this.length=length;
        	       this.breath=breath;
        		   }  
        	   else {
        		   System.out.println("you entered a invalid length or breath value");
        	   }
           }
           
           
           public double FindArea(){
        	    double val;
				return val =2*(length*breath);
           }
           public double find() {
        	   
        	   return length*breath;
           }


           
	public static void main(String[] args) {
		
		Shape obj= new Shape(5,1);
		//Shape ob= new Shape(4,13);
		obj.FindArea();
		obj.find();
		System.out.println("perimeter  - :"+obj.FindArea());
		System.out.println("Area - :"+obj.find());
	
	}

}