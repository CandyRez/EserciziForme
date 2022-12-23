public class Cerchio {
    public static void main(String[] args) {
        Cerchio c = new Cerchio(5,10);

        System.out.println(c);
    }
    int raggio;
    int diametro;

    public Cerchio(int raggio,int diametro) {
        this.raggio = raggio;
        this.diametro = diametro;
    }

    public int area() {
        return raggio*raggio;
    }

    public int perimetro() {
        return raggio + diametro ;
    }

    @Override
    public String toString() {
        return "Cerchio di raggio" + raggio + " e  diametro: " + diametro;
    }
}
