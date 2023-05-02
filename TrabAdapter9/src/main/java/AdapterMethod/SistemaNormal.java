package AdapterMethod;

public class SistemaNormal implements ISistema {

    private float decimal;

    @Override
    public float getSistema() {
        return this.decimal;
    }

    @Override
    public void setSistema(float decimal) {
        this.decimal = decimal;
    }
}