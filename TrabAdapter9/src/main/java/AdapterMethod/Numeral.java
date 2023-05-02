package AdapterMethod;

public class Numeral {

    ISistema sistema;
   SistemaAdapter conversao;

    public Numeral() {
        sistema = new SistemaNormal();
        conversao = new SistemaAdapter(sistema);
    }

    public void setSistema(String decimal) {
        sistema.setSistema(decimal);
       conversao.salvarSistema();
    }

    public String getSistema() {
        return conversao.recuperarSistema();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public String getRomano() {
        return conversao.getRomano();
    }

}