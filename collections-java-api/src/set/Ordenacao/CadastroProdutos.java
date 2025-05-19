package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProdutos(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProdutos(3L,"Produto 5",15d,5);
        cadastroProdutos.adicionarProdutos(2L,"Produto 6",20d,10);
        cadastroProdutos.adicionarProdutos(1L,"Produto 3",10d,2);
        cadastroProdutos.adicionarProdutos(9L,"Produto 9",9d,2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());

    }

     }

