/**
 * Clase Cono
 */
public class Cono {

    private Circulo base;
    private float altura;
    private String color;

    /**
     * Constructor de cono
     * @param cX
     * @param cY
     * @param r
     * @param h
     * @param color
     */
    public Cono(float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }


    /**
     * Getters y Setters
     * @return
     */
    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo de impresion
     */
    public void imprimir() {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}