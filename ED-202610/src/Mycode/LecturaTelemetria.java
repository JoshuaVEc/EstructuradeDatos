package Mycode;

public class LecturaTelemetria {
    String codigo_censor;
    double temperatura_motor;
    boolean esCritico;

    public LecturaTelemetria() {
    }

    public boolean isEsCritico() {
        return esCritico;
    }

    public void setEsCritico(boolean esCritico) {
        this.esCritico = esCritico;
    }

    public double getTemperatura_motor() {
        return temperatura_motor;
    }

    public void setTemperatura_motor(double temperatura_motor) {
        this.temperatura_motor = temperatura_motor;
    }

    public String getCodigo_censor() {
        return codigo_censor;
    }

    public void setCodigo_censor(String codigo_censor) {
        this.codigo_censor = codigo_censor;
    }
}
