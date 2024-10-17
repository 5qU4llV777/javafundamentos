package programaçãoOrientadaAObjetos.escola.gettersetter;

public class Escola {

    public static void main(String[] args) {

        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");





        /*Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 8;

        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");


*/
    }

}
