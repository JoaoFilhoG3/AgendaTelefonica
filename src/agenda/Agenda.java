package agenda;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Agenda {

    List<Pessoa> contatos = new ArrayList<>();

    void addPessoa(String nome, int anoNascimento, String telefone, String email) {
        Pessoa p = new Pessoa();

        p.nome = nome;
        p.anoNascimento = anoNascimento;
        p.telefone = telefone;
        p.email = email;

        contatos.add(p);
    }

    void removePessoa(String nome) {
        contatos.remove(buscaPessoa(nome));
    }

    int buscaPessoa(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            Pessoa pAux = contatos.get(i);
            if (nome.equalsIgnoreCase(pAux.nome)) {
                return i;
            }
        }
        return -1;
    }

    void imprimeAgenda() {
        for (int i = 0; i < contatos.size(); i++) {
            Pessoa pAux = contatos.get(i);
            JOptionPane.showMessageDialog(null, ""
                    + "---CONTATO N° " + (i + 1) + "---\n" + pAux.mostrarStatus());
            pAux.mostrarStatus();
        }
    }

    void imprimePessoa(String nome) {
        Pessoa pAux = contatos.get(buscaPessoa(nome));

        JOptionPane.showMessageDialog(null, pAux.mostrarStatus());

    }
}
