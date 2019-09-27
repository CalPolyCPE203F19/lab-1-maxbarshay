public class Point{

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2)); }
    public double getAngle() { return Math.atan(y/x); }
    public Point rotate90(Point my_point){
        double orig_angle = my_point.getAngle();
        double dist_origin = my_point.getRadius();
        double new_angle = orig_angle + (Math.PI / 2);
        double new_x = dist_origin * Math.cos(new_angle);
        double new_y = dist_origin * Math.sin(new_angle);
        Point new_point = new Point(new_x, new_y);
        return new_point;
    }
    
}

