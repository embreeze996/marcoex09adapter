package AdapterMethod;

public class SistemaAdapter extends SistemaRomano {

    private ISistema sistemaNormal;

    public SistemaAdapter(ISistema sistemaNormal) {
        this.sistemaNormal = sistemaNormal;
    }

    public String recuperarSistema() {
        if (this.getRomano() = "V")
            sistemaNormal.setSistema(5.0f);
        else
        if (this.getRomano() >= "X")
            sistemaNormal.setSistema(10.0f);
        else
        if (this.getRomano() >= "XX")
            sistemaNormal.setSistema(20.0f);
        return sistemaNormal.getSistema();
    }

    public void salvarSistema() {
        if (sistemaNormal.getSistema().equals(5.0f))
            this.setRomano("V");
        else
        if (sistemaNormal.getSistema().equals(10.0f))
            this.setRomano("X");
        else
        if (sistemaNormal.getSistema().equals(20.0f))
            this.setRomano("XX");

    }
}