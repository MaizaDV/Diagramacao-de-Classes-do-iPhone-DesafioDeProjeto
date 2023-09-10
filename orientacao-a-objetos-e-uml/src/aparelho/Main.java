package aparelho;

import aparelho.reprodutormusical.ReprodutorMusical;

public class Main {

  public static void main(String[] args) {
    ReprodutorMusical aparelho = new ReprodutorMusical("Los Hermanos.");
    aparelho.selecionarMusica();
    aparelho.tocar();
    aparelho.pausar();
  }

}