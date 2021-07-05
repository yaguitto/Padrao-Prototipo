public class PessoaFisica extends PessoaFisicaPrototipo {

    public PessoaFisica(String nome, String cpf, String dataNasc){
        super(nome,cpf,dataNasc);
    }

    public PessoaFisica(PessoaFisica clone){
        super(clone);
    }

    @Override
    public Prototipo clonar() {
        return new PessoaFisica(this);
    }

    @Override
    public String toString() {
        return "PessoaFisica{ " + super.toString() + " }";
    }
}