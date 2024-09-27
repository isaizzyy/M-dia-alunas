public class Principal {
    public static void main(String[] args) {
        Aluna aluna1 = new Aluna("Isabelle", 7.5, 8.0, 9.2);
        Aluna aluna2 = new Aluna("Mariana", 6.8, 7.3, 8.5);

        System.out.println("Aluna 1:");
        System.out.println("Nome: " + aluna1.getNome());
        System.out.println("Nota 1: " + aluna1.getNota1());
        System.out.println("Nota 2: " + aluna1.getNota2());
        System.out.println("Nota 3: " + aluna1.getNota3());
        System.out.println("Média: " + aluna1.calcularMedia());
        System.out.println();

        System.out.println("Aluna 2:");
        System.out.println("Nome: " + aluna2.getNome());
        System.out.println("Nota 1: " + aluna2.getNota1());
        System.out.println("Nota 2: " + aluna2.getNota2());
        System.out.println("Nota 3: " + aluna2.getNota3());
        System.out.println("Média: " + aluna2.calcularMedia());
    }
}
