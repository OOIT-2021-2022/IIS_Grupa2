package geometry;

public class TestKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();
		
		//System.out.println(p.x);
		//System.out.println(p.y);
		//System.out.println(p.selected);
		
		int i=0;
		System.out.println(i);
		
		//p.x=10;
		//System.out.println(p.x);
		System.out.println(p.getX());
		p.setX(20);
		System.out.println(p.getX());
		
		//udaljenost
		p.setY(10);
		System.out.println(p.distance(15,25));
		
	}

}
