package obiektowe.zadania.zadanie_5;


import obiektowe.zadania.zadanie_1.Point2D;

public class Line {

    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Line(float x_1, float y_1, float x_2, float y_2){
        this.start = new Point2D(x_1,y_1);
        this.end = new Point2D(x_2,y_2);
    }

    public float length(){
        return (float) Math.sqrt((Math.pow(end.getX()-start.getX(),2)) + (Math.pow(end.getY()- start.getY(),2)));
    }

    public float[] middlePoint(){
        return new float[]{(start.getX()+end.getX())/2,(start.getY()+end.getY())/2};
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
}
