public class Main {
    public static void main(String[] args) {
        Quadrato q = new Quadrato(10);
        Rettangolo r = new Rettangolo(5,15);
        Triangolo t = new Triangolo(4);
        Cerchio c = new Cerchio(5,10);

        System.out.println(q);
        System.out.println("Area: " + q.area());
        System.out.println("Perimetro: " + q.perimetro());

        System.out.println(r);
        System.out.println("Area: " + r.area());
        System.out.println("Perimetro: " + r.perimetro());

        System.out.println(t);
        System.out.println("Area: " + t.area());
        System.out.println("Perimetro: "+ t.perimetro());

        System.out.println(c);
        System.out.println("Area: " + c.area());
        System.out.println("Perimetro: " + c.perimetro());
    }
}
