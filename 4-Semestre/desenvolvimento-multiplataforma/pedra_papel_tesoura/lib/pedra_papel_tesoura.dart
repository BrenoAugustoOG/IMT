import 'dart:io';
import 'dart:math';

// 0 - pedra | 1 - papel | 2 - tesoura | 3 - sair
enum OPCAO { pedra, papel, tesoura, sair }

void exibe(String texto) {
  print(texto);
}

int pegaOpcaoUsuario() {
  return int.parse(stdin.readLineSync()!);
}

bool opcaoEhValida(int opcao) {
  return opcao >= 1 && opcao <= 4;
}

OPCAO mapeiaOpcao(int opcao) {
  return OPCAO.values[opcao - 1];
}

String decideResultado(OPCAO opcaoUsuario, OPCAO opcaoComputador) {
  if (opcaoUsuario == opcaoComputador) {
    return "Empate!";
  }
  if (opcaoUsuario == OPCAO.papel && opcaoComputador == OPCAO.pedra ||
      opcaoUsuario == OPCAO.tesoura && opcaoComputador == OPCAO.papel ||
      opcaoUsuario == OPCAO.pedra && opcaoComputador == OPCAO.tesoura) {
    return "Você venceu!";
  }
  return "Você perdeu, o computador venceu!";
}

void jogo() {
  int opUsuario;
  do {
    //exibir o menu
    //capturar a opção do usuário
    do {
      exibe('1-Pedra\n2-Papel\n3-Tesoura\n4-Sair');
      opUsuario = pegaOpcaoUsuario();
    } while (!opcaoEhValida(opUsuario));
    //se o usuário digitar 4, sair do jogo
    // se não digitar 4, sortear a escolha do computador
    if (opUsuario != 4) {
      int opComputador = Random().nextInt(3) + 1;
      // mapear as opções do usuario e do computador
      OPCAO opcaoUsuario = mapeiaOpcao(opUsuario);
      OPCAO opcaoComputador = mapeiaOpcao(opComputador);
      // exibir as opções de cada um
      exibe(
        'Você escolheu (${opcaoUsuario.name}) vs Computador escolheu (${opcaoComputador.name})',
      );
      // decidir quem venceu, ou se houve empate
      String vencedor = decideResultado(opcaoUsuario, opcaoComputador);
      // exibir o resultado
      exibe(vencedor);
      exibe('***********************************');
      sleep(Duration(seconds: 3));
    }
  } while (opUsuario != 4);
  exibe('Obrigado por jogar!');
}
