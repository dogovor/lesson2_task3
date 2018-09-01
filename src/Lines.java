import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> linesList = new ArrayList<>();

    public void addLine(Line s) {
        linesList.add(s);
    }

    public double sumAllLines() {
        double sum = 0;
        for (Line i : linesList) {
            sum = sum + i.getLength();
        }
        return sum;
    }

    public Line longLine() {
        Line longer = linesList.get(0);
        for (Line i : linesList) {
            if (i.getLength() > longer.getLength())
                longer = i;
        }
        return longer;
    }
}
