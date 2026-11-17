public class MainFormaGeometrica {
     public static void main(String[] args) {

        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(10, 5);
        formas[2] = new Triangulo(8, 4);

        for (int i = 0; i < formas.length; i++) {

            System.out.printf("Área da forma %d: %.2f%n",
                i + 1, formas[i].calcularArea());
        }
    }
}
