public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w,double h) {
        this.width=w;
        this.height=h;
    }

    public double area() {
        return width*height;
    }

    /**
     * Scales the width and height of the rectangle by {@code factor}
     * @param factor > 0
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    public boolean isLargerThan(Rectangle other) {
        return area() > other.area();
    }
}
