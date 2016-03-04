class Shape {
 private String name;
 Shape(String aname) {name=aname;}
 public String getName() {return name;}
 public float calculateArea(){return 0.0f;}

 public static void main(String argv[]){
	 Circle c = new Circle(" Circle C");
	 Triangle t = new Triangle(" Triangle T");
	 Square s = new Square(" Square S");
	Shape shapeArray[]={c, t, s};
	for(int i=0; i<shapeArray.length; i++){
		System.out.println("The area of"+ shapeArray[i].getName()+" is "+shapeArray[i].calculateArea()+" cm^2.\n");
  }
 }
}

class Circle extends Shape {
	private int radius;
	Circle(String aName){
		super(aName);
		radius = 2;
   	}
	public float calculateArea() {
		float area;
		area = (float) (3.14 * radius * radius);
		return area;
	}
}

class Square extends Shape {
	private int size;
	Square(String aName){
		super(aName);
		size = 2;
   	}
	public float calculateArea() {
		float area;
		area = size* size;
		return area;
	}
}

class Triangle extends Shape {
	private int base, altura;
	Triangle(String aName){
		super(aName);
		base = 3;
		altura = 4;
   	}
	public float calculateArea(){
		float area;
		area = base * altura/2;
		return area;
	}
}


