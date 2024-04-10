public class VETOR {

    public static void main(String[] args) {
        double[] notas = { 7.6, 8.4, 8.6, 7.9 };

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":" + notas[i]);

        }

        System.out.println("Media dos alunos:" + media);
    }
}