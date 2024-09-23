public class Triangle implements Cloneable {
    public int base, height;
    public String color;

    public Triangle() {}

    public Triangle(Triangle source) {
        if (source != null) {
            this.base = source.base;
            this.height = source.height;
            this.color = source.color;
        }
    }

    @Override
    public Triangle clone() {
        try {
            return (Triangle) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Triangle(this);
        }
    }
}