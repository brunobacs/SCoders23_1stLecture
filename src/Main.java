public class Main {
    public static void main(String[] args) {


        // static acesso atraves da classe e nao do objeto

        double raio = 10;
        // coloquei final = a partir do momento que declarei, nao muda mais
        final double pi = 3.141592653;
        double area = pi*raio*raio;
        System.out.println(area);
    }
}