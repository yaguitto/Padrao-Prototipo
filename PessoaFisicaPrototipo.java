public abstract class PessoaFisicaPrototipo implements Prototipo {

    private String nome;
    private String cpf;
    private String dataNasc;

    public PessoaFisicaPrototipo(String nome, String cpf, String dataNasc){
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public PessoaFisicaPrototipo(PessoaFisicaPrototipo clone) {
        this.nome = clone.nome;
        this.cpf = clone.cpf;
        this.dataNasc = clone.dataNasc;
    }

    @Override
    public String toString() {
        return "CirculoPrototConcre{" +
                "x=" + nome +
                ", y=" + cpf +
                ", raio=" + dataNasc +
                '}';
    }
}