package programaçãoOrientadaAObjetos.construtores;

public class SistemaCadastro {

    public static void main(String[] args) {


        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("1234", "Marcos");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome cpf do marcos ?

        //imprimindo o marcos sem o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }

}