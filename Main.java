public class Main {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.nome = "Kung fu panda 4";
    meuFilme.anoDeLancamento = 2024;
    meuFilme.duracaoEmMinutos = 94;

    meuFilme.exibeFichaTecnica();

    meuFilme.avalia(7);
    meuFilme.avalia(6.7);
    meuFilme.avalia(5.8);
    System.out.println(meuFilme.somaDasAvaliacoes);
    System.out.println(meuFilme.totalDeAvalicacoes);
  }
}