
public class Rectangle {
	 int length;
     int breadth;

     Rectangle(int x, int y){
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
	 Square[] x = new Square[10];
	 int q = 3;
	 for(int j = 0;j<=9; j++) {
		 x[j] = new Square(q);
		 q++;
	 }
	 
	 for(int j = 0; j<=9;j++) {
		 x[j].area();
		 x[j].perimeter();
	 }

}
}
