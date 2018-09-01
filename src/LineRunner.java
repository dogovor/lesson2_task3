public class LineRunner {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(2.0, 1.0);
        Point p4 = new Point(0, 7.0);
        Point p5 = new Point(4.0, 4.0);
        Point p6 = new Point(1.0 , 4.0);

        Line n1 = new Line(p1 , p2);
        Line n2 = new Line(p3, p4);
        Line n3 = new Line(p5, p6);

        Lines lines = new Lines();

        lines.addLine(n1);
        lines.addLine(n2);
        lines.addLine(n3);

        System.out.println(lines.longLine().toString());
        System.out.println(lines.sumAllLines());
    }
}
