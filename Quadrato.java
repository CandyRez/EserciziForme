public class Quadrato {
    public static void main(String[] args) {
        Quadrato q = new Quadrato(10);

        System.out.println(q);
    }
    int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }
    public int area() {
        return lato*lato;
    }

    public int perimetro() {
        return lato*4;
    }

    @Override
    public String toString() {
        return "Quadrato di lato" + lato;
    }

}