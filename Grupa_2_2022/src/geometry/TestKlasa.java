package geometry;

import java.util.Arrays;

public class TestKlasa {

	public static void main(String[] args) {
		// Vezbe 2

		Point p = new Point();

		// System.out.println(p.x);
		// System.out.println(p.y);
		// System.out.println(p.selected);

		int i = 0;
		System.out.println(i);

		// p.x=10;
		// System.out.println(p.x);
		System.out.println(p.getX());
		p.setX(20);
		System.out.println(p.getX());

		// udaljenost
		p.setY(10);
		System.out.println(p.distance(15, 25));

		// Vezbe 3
		// Point p -> x=20, y=10
		Point p1 = new Point();
		p1.setX(15);
		p1.setY(23);

		Line l1 = new Line();
		// System.out.println(l1.getStartPoint().getX());
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getStartPoint().getX());
		System.out.println(l1.length());

		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();

		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1
		p.setX(p1.getY());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		// l1.setStartPoint(p);
		// l1.setEndPoint(p1);

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23
		l1.getEndPoint().setY(23);

		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		l1.getEndPoint().setX((int) (l1.length() - l1.getStartPoint().getX() - l1.getStartPoint().getY()));

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
		r1.setUpperLeftPoint(p);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);

		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1
		c1.setCenter(r1.getUpperLeftPoint());

		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());

		// Vezbe 4
		/*
		 * 1.Postaviti koordinatu x centra ranije kreiranog kruga k na vrednost zbira
		 * vrednosti poluprecnika kruga k i vrednosti koja predstavlja udaljenost
		 * pocetne i krajnje tacke prethodno kreirane linije lin (NE duzine). Sve
		 * objekte kreirati samostalno.
		 */
		Circle c2 = new Circle();
		c2.setRadius(5);
		Line lin = new Line();
		Point t1 = new Point();
		Point t2 = new Point();
		t1.setX(3);
		t1.setY(4);
		t2.setX(5);
		t2.setY(6);
		lin.setStartPoint(t1);
		lin.setEndPoint(t2);

		c2.setCenter(t1);

		c2.getCenter().setX(c2.getRadius()
				+ (int) lin.getStartPoint().distance(lin.getEndPoint().getX(), lin.getEndPoint().getY()));

		// inicijalno postavljene vrednosti
		Point p4 = new Point(10, 15, true);
		// samo kad zelimo promenu
		p4.setX(20);

		// pre redefinisanja metode u Line, a posle redefinisanja u Point
		System.out.println(p4.toString());
		System.out.println(p4);
		System.out.println(lin);

		System.out.println(t1.equals(t2));

		// ZADATAK - testirati konstruktore, toString() i equals(...) metode

		// vezbe 5

		Point clickPoint = new Point(20, 15);
		System.out.println(p4.contains(clickPoint));
		System.out.println(p4.contains(clickPoint.getX(), clickPoint.getY()));
		
		Donut donut = new Donut(clickPoint, 10, 5, true);
		System.out.println(donut.toString());
		System.out.println(donut.area());
		System.out.println(donut instanceof Circle);
		System.out.println(donut instanceof Donut);
		System.out.println(c2 instanceof Donut);
		
		
		System.out.println("Vezbe 7");
		Point movedPoint = new Point (10,15);
		System.out.println(movedPoint);
		movedPoint.moveBy(5, 10);
		System.out.println(movedPoint);
		movedPoint.moveTo(5, 10);
		System.out.println(movedPoint);
		
		//Comparable
		movedPoint.compareTo(clickPoint);
		
		Line line1 = new Line(new Point(10,15),new Point(20,25));
		Line line2 = new Line(new Point(15,20),new Point(25,25));
		Line line3 = new Line(new Point(10,25),new Point(30,40));
		Line[] lines = {line1, line2, line3};	

		System.out.println("Niz linija pre sortiranja");
		for (int j = 0; j < lines.length; j++) {
			System.out.println(lines[j]);
		}

		Arrays.sort(lines);

		System.out.println("Niz linija posle sortiranja");
		for (int j = 0; j < lines.length; j++) {
			System.out.println(lines[i]);
		}


		Rectangle rectangle1 = new Rectangle(new Point(10,15), 10,15);
		Rectangle rectangle2 = new Rectangle(new Point(10,15), 30,40);
		Rectangle rectangle3 = new Rectangle(new Point(10,15), 10,10);
		Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};

		System.out.println("Niz pravougaonika pre sortiranja");
		for (int j = 0; j < rectangles.length; j++) {
			System.out.println(rectangles[j]);
		}

		Arrays.sort(rectangles);

		System.out.println("Niz pravougaonika posle sortiranja");
		for (int j = 0; j < rectangles.length; j++) {
			System.out.println(rectangles[j]);
		}
		
		//Svi oblici u jednoj listi
		Shape[] shapes = {rectangle1, rectangle2, line2, line3};
		for (int j = 0; j < shapes.length; j++) {
			shapes[i].moveBy(10, 15);
		}

	}

}
