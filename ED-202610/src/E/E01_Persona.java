package E;

public class E01_Persona {
        String nombre;
        double capital;

    public E01_Persona(double capital, String nombre) {
        this.capital = capital;
        this.nombre = nombre;
    }

    public E01_Persona() {
    }

    public double getCapital() {
        return capital;
    }

    public String getNombre() {
        return nombre;
    }
    public void setCapital(double capital) {
        this.capital = capital;
    }
}

