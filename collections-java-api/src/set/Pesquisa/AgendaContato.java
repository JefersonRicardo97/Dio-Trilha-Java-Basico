package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public  void adicionarCOntato(String nome , int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().endsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarContatoPorNome(String nome, int novonumero){
        Contato contatoAtualizado =null;
         for (Contato c : contatoSet){
             if (c.getNome().equalsIgnoreCase(nome)){
                 c.setNumero(novonumero);
                 contatoAtualizado = c ;
                 break;

             }

         }
         return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarCOntato("Camila",123456);
        agendaContato.adicionarCOntato("Camila",0);
        agendaContato.adicionarCOntato("Camila Calvacante",11111111);
        agendaContato.adicionarCOntato("Camila DIO",123456);

        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Camila"));
        System.out.println(agendaContato.atualizarContatoPorNome("Camila DIO", 1194226140));
        agendaContato.exibirContato();


    }
}
