public class Line {
    private Point start;
    private Point finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", finish=" + finish +
                '}';
    }

    public Point getStart() {
        return start;
    }

    public Point getFinish() {
        return finish;
    }


    public double getLength() {
        double a = (finish.getX() - start.getX()) * (finish.getX() - start.getX());
        double b = (finish.getY() - start.getY()) * (finish.getY() - start.getY());
        double d = Math.sqrt(a + b);
        return d;
    }
}
