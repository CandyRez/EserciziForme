public class Triangolo {
    public static void main(String[] args) {
        Triangolo t = new Triangolo(4);

        System.out.println(t);
    }

    int lato3;

    public Triangolo(int lato3){
        this.lato3 = lato3;
    }

    public int area(){
        return lato3*lato3;
    }

    public int perimetro(){
        return lato3*3;
    }

    @Override
    public String toString(){
        return "Triangolo di lato: " + lato3;
    }
}