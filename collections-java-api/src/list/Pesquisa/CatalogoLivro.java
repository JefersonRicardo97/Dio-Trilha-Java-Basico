package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    // atributo
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo , String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
     List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for ( Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }

     }
        return livroPorAutor;
    }
        public List<Livro> pesquisarLivroPorIntervaloAno ( int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l :livroList ){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livroPorIntervaloAno.add(l);

                }
            }
        }

        return livroPorIntervaloAno;
        }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
     }
    public static void main(String[]args){
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro1","Autor 1",2020);
        catalogoLivro.adicionarLivro("Livro1","Autor 2",2021);
        catalogoLivro.adicionarLivro("Livro2","Autor 2",2022);
        catalogoLivro.adicionarLivro("Livro3","Autor 3",2023);
        catalogoLivro.adicionarLivro("Livro4","Autor 4",1994);


      //  System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
       // System.out.println(catalogoLivro.pesquisarLivroPorIntervaloAno(2020,2022));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro1"));
    }
}

