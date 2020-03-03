package agenda;

import javax.swing.JOptionPane;

public class Pessoa {

    String nome;
    int anoNascimento;
    String telefone;
    String email;

    public String mostrarStatus() {
        return "Nome: " + nome
                + "\nAno de Nascimento: " + anoNascimento
                
                + "\nIdade: " + calculaIdade()
                + "\nTelefone: " + telefone
                + "\nEmail: " + email;
    }

    public String calculaIdade() {
        int idade = 2020 - anoNascimento;
        return String.valueOf(idade);
    }
}
