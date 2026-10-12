public class Main {
    public static void main(String[] args) {

        Figura circulo = new Circulo("Círculo", 5.0);
        Figura rectangulo = new Rectangulo("Rectángulo", 4.0, 6.0);
        Figura triangulo = new Triangulo("Triángulo", 3.0, 5.0);

        Figura[] figuras = { circulo, rectangulo, triangulo };

        System.out.println("=== CÁLCULO DE ÁREAS DE FIGURAS GEOMÉTRICAS ===");

        for (Figura f : figuras) {
            f.mostrarInformacion();

            System.out.println("Área calculada: " + f.calcularArea());
            System.out.println("----------------------------------------");
        }
    }
}