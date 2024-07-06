public class Filme {
  String nome;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double somaDasAvaliacoes;
  int totalDeAvalicacoes;
  int duracaoEmMinutos;
  
  void exibeFichaTecnica() {
    System.out.println("");
    System.out.println("Nome: " + nome);
    System.out.println("Ano de lancamento: " + anoDeLancamento);
  }

  void avalia(double nota){
    somaDasAvaliacoes += nota;
    totalDeAvalicacoes++;
  }
}