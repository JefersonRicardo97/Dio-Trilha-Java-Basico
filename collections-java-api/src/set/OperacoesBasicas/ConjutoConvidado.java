package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjutoConvidado {
    private Set<Convidado> convidadoset;

    public ConjutoConvidado() {
        this.convidadoset = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoset.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
         Convidado convidadoParaRemover = null;
         for (Convidado c : convidadoset){
             if (c.getCodigoConvite() ==codigoConvite){
                 convidadoParaRemover= c;
                 break;
             }
             else if (c.getCodigoConvite() != codigoConvite){
                 System.out.println("Não existe convidado com esse convite :"+ convidadoParaRemover);
             }
         }
         convidadoset.remove(convidadoParaRemover);
    }
    public int contarConvidados (){
        return  convidadoset.size();

    }
    public  void exibirConvidados(){
        System.out.println(convidadoset);
    }

    public static void main(String[] args) {
        ConjutoConvidado conjuntoConvidado = new ConjutoConvidado();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+" Convidado(s) dentro do set de Convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2",1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3",1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4",1236);

        System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+" Convidado(s) dentro do set de Convidados");

        conjuntoConvidado.exibirConvidados();
        conjuntoConvidado.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Existem "+ conjuntoConvidado.contarConvidados()+" Convidado(s) dentro do set de Convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
