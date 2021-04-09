public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);

        Circle circle = new Circle("yellow",true,3.0);
        System.out.println(circle);

    }
}
