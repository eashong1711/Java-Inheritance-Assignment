
    public class Rectangle {
             int length;
             int breadth;
      
             Rectangle(int x, int y) {
       length = x;
       breadth = y;
       }
             
    void area(){
    	System.out.println("Area = "+ (length*breadth)+"sq units");
       }
        void perimeter() {
    	System.out.println("Perimeter = "+ ((length + breadth + length+ breadth)+"units"));
      }
    }
    
    class Square extends Rectangle{
           int l;
    	public Square(int l) {
    		super(l,l);
    	}
    	public static void main(String[] args) {
    		Rectangle z =new Rectangle(3,4);
    		z.area();
    		z.perimeter();
    		
    		
    		Square s = new Square(6);
    		s.area();
    		s.perimeter();
    		
    		
    	}
    }
    
             
