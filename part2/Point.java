public class Point{

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); }
    public double getAngle() { if (x < 0){
        return (Math.PI + Math.atan(y/x));
    } 
    return Math.atan(y/x); }
    public Point rotate90(){
        Point new_point = new Point(-this.y, this.x);
        return new_point;
    }
    
}

