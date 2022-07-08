package classes_atributos_membros_staticos_pg_10;

import java.util.Scanner;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public double precoTotal() {
        return preco * quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + ", preco: " + String.format("%.2f", preco) + "," + "Quantidade de produtos: " + quantidade
                + ", Preco total: " + String.format("%.2f", precoTotal());

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Cadastro de produto:\n");
        System.out.println("Nome do produto: ");
        product.nome = sc.nextLine();
        System.out.println("Informe o preco do produto: ");
        product.preco = sc.nextDouble();
        System.out.println("Informe a quantidade de produtos no estoque: ");
        product.quantidade = sc.nextInt();

        System.out.println("Quantidade de produtos: " + product.quantidade);
        System.out.println("Preco total: R$" + product.precoTotal());
        product.adicionarProdutos(10);

        System.out.println("Quantidade de produtos: " + product.quantidade);
        System.out.println("Preco total: R$" + product.precoTotal() );
    }


}
