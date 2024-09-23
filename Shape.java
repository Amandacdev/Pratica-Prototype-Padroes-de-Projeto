public abstract class Shape {
    protected int x, y;
    protected String color;

    public Shape() {}

    public Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    public abstract Shape clone();
}
