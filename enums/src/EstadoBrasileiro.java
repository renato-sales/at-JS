public enum EstadoBrasileiro{
    SAO_PAULO("sp", "São Paulo"),
    PERNAMBUCO("pe", "Pernambuco");

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    private String sigla;
    private String nome;

    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
}