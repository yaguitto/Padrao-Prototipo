public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("Iago","121068999-13","18/05/1995");
        System.out.println(pessoaFisica);

        Prototipo copia = pessoaFisica.clonar();
        System.out.println(copia);
    }
}