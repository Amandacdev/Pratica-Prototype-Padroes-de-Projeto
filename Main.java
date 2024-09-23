public class Main {
    public static void main(String[] args) {
        Triangle originalTriangle = new Triangle();
        originalTriangle.base = 10;
        originalTriangle.height = 20;
        originalTriangle.color = "purple";

        Triangle clonedTriangle = originalTriangle.clone();

        System.out.println("\nTriângulo Original:");
        System.out.println("Base: " + originalTriangle.base + ", Altura: " + originalTriangle.height + ", Cor: " + originalTriangle.color);

        System.out.println("\nTriângulo Clonado:");
        System.out.println("Base: " + clonedTriangle.base + ", Altura: " + clonedTriangle.height + ", Cor: " + clonedTriangle.color);

        clonedTriangle.base = 30;
        clonedTriangle.height = 40;
        clonedTriangle.color = "orange";

        System.out.println("\nTriângulo Clonado Modificado:");
        System.out.println("Base: " + clonedTriangle.base + ", Altura: " + clonedTriangle.height + ", Cor: " + clonedTriangle.color);

        System.out.println("\nTriângulo Original (após modificação no clone):");
        System.out.println("Base: " + originalTriangle.base + ", Altura: " + originalTriangle.height + ", Cor: " + originalTriangle.color);
    }
}
