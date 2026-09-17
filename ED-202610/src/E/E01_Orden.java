package E;

public class E01_Orden {
    int codigo;
    double valorOferta;
    E01_Persona persona;

    public E01_Orden(double valorOferta, E01_Persona persona, int codigo) {
        this.valorOferta = valorOferta;
        this.persona = persona;
        this.codigo = codigo;
    }

    public E01_Orden() {
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorOferta() {
        return valorOferta;
    }

    public E01_Persona getPersona() {
        return persona;
    }
}
