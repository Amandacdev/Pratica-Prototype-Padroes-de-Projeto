public class Application {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.x = 10;
        circle1.y = 20;
        circle1.color = "red";
        circle1.radius = 15;

        Circle circle2 = (Circle) circle1.clone();

        Rectangle rect1 = new Rectangle();
        rect1.x = 5;
        rect1.y = 10;
        rect1.color = "blue";
        rect1.width = 20;
        rect1.height = 30;

        Rectangle rect2 = (Rectangle) rect1.clone();
    }
}