package aparelho;

import aparelho.aparelhotelefonico.Telefone;
import aparelho.aparelhotelefonico.TelefoneAbst;
import aparelho.aparelhotelefonico.TelefoneIntfc;
import aparelho.reprodutormusical.ReproducaoIntfc;
import aparelho.reprodutormusical.ReprodutorMusical;

public class AparelhoMultiuso implements ReproducaoIntfc, TelefoneIntfc {


  @Override
  public void tocar() {
    System.out.println("Ouvindo a música.");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a música.");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }
}
