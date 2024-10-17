package programaçãoOrientadaAObjetos.enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de janeiro"),
    PIAUI ("PI", "Piaui"),
    MARANHAO ("MA", "Maranhão"),
    MATOGROSSO_SUL("MS", "Mato grosso do sul");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
