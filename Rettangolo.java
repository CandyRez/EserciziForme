public class Rettangolo {

    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5,15);

        System.out.println(r);
    }
    int lato1;
    int lato2;

    public Rettangolo(int lato1,int lato2) {
        this.lato1 = lato1;
        this.lato2 = lato2;
    }

    public int area() {
        return lato1*lato2;
    }

    public int perimetro() {
        return lato1*2 + lato2 *2;
    }

    @Override
    public String toString() {
        return "Rettangolo di lati" + lato1 + " e " + lato2;
    }

}
