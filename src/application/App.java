package application;

import entites.Carro;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int respostaUsuario;

        do {
            Carro carro = new Carro();
            do {
                String marca = JOptionPane.showInputDialog(null,
                        "Digite o nome da marca do Veiculo: ",
                        "MARCA",
                        JOptionPane.PLAIN_MESSAGE);
                carro.setMarca(marca);
            } while (carro.valMarca == false);

            do {
                String modelo = JOptionPane.showInputDialog(null,
                        "Digite o modelo do Carro: ",
                        "MODELO",
                        JOptionPane.PLAIN_MESSAGE);
                carro.setModelo(modelo);
            } while (carro.valModelo == false);

            do {
                String ano = JOptionPane.showInputDialog(null,
                        "Digite o ano de Fabricação: ",
                        "FABRICAÇÃO",
                        JOptionPane.PLAIN_MESSAGE);
                Integer anoFabricao = Integer.parseInt(ano);
                carro.setAnoFabricacao(anoFabricao);
            } while (carro.valAno == false);

            JOptionPane.showMessageDialog(null,
                    "Dados do Veiculo: \n" + carro.mostrarDados(),
                    "DADOS?",
                    JOptionPane.PLAIN_MESSAGE);

            respostaUsuario = JOptionPane.showConfirmDialog(null,
                    "Deseja Repetir?",
                    "REPETIR?",
                    JOptionPane.YES_NO_OPTION);
        } while (respostaUsuario == JOptionPane.YES_OPTION);
    }
}