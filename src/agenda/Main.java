package agenda;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addPessoa("João", 1997, "(88)98888-8888", "joao.joao@joao.com");
        agenda.addPessoa("Maria", 2000, "(88)97777-8888", "maria.maria@éumdom.umacertamagia");
        agenda.addPessoa("Chico Cunha", 2010, "(85)95555-3333", "chico@cunha.dengue");

        agenda.imprimeAgenda();

        agenda.removePessoa("maria");

        agenda.imprimeAgenda();

        agenda.imprimePessoa("Chico Cunha");
    }

}
