package entites;

import javax.swing.*;
import java.util.Calendar;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    public boolean retorno;
    public boolean valModelo;
    public boolean valMarca;


    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnoFabricacao(anoFabricacao);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.valMarca = marca.matches("[a-zA-Z]+");
        if (valMarca == false) {
            JOptionPane.showMessageDialog(null,
                    "Digite um modelo sem CARCTERES ESPECIAIS!!",
                    "ERRO!!",
                    JOptionPane.ERROR_MESSAGE);
            retorno = false;
        } else {
            this.marca = marca;
            retorno = true;
        }
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.valModelo = modelo.matches("[a-zA-Z]+");
        if (valModelo == false) {
            JOptionPane.showMessageDialog(null,
                    "Digite um modelo sem CARCTERES ESPECIAIS!!",
                    "ERRO!!",
                    JOptionPane.ERROR_MESSAGE);
            retorno = false;
        } else {
            this.modelo = modelo;
            retorno = true;
        }
    }

    Calendar ano = Calendar.getInstance();

    public int getAnoFabricacao() {
        int anoAtual = ano.get(Calendar.YEAR);
        int id = anoAtual - this.anoFabricacao;
        this.anoFabricacao = id;
        return id;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao < 0000) {
                JOptionPane.showMessageDialog(null,
                        "Digite uma idade válida",
                        "IDADE INVáLIDA",
                        JOptionPane.ERROR_MESSAGE);
                retorno = false;
        } else{
            this.anoFabricacao = anoFabricacao;
            retorno = true;
        }
    }

    public boolean isValidarModelo() {
        return this.valModelo;
    }

    public boolean isValidadrMarca() {
        return this.valMarca;
    }

    public String mostrarDados() {
        return "Marca: "+marca+
                "\nModelo: "+modelo+
                "\nAno de Fabricação: "+getAnoFabricacao();
    }
}
