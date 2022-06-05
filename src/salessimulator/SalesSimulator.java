
package salessimulator;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SalesSimulator {
    static ArrayList<Produto> lista = new ArrayList();
    static ArrayList<Venda> listaVenda = new ArrayList();
        
    static void menu () {
       int opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Produto\n2. Listar Produtos\n3. Vender Produtos\n4. Listar Vendas\n0. Sair"));
       
       switch(opcao) {
           case 1: {
               adicionarProdutos();
               menu();
               break;
           }
           case 2: {
               listarProdutos();
               menu();
               break;
           }
           case 3: {
               venderProdutos();
               menu();
               break;
           }
           case 4: {
               listarVendas();
               menu();
               break;
           }
           case 0: {
               System.exit(1);
           }
           default : {
                   JOptionPane.showMessageDialog(null, "Entrada Invalida");
                   menu();
            }
       }
    }
    
    static void adicionarProdutos() {
        String nome = JOptionPane.showInputDialog("Nome do produto");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        
        Produto novoProduto = new Produto(lista.size()+1, nome, preco, stock);
        lista.add(novoProduto);
    }
    
    static void listarProdutos() {
        JOptionPane.showMessageDialog(null, lista);
    }
    
    static void venderProdutos() {
        String cliente = JOptionPane.showInputDialog("Nome do cliente");
        String produto = JOptionPane.showInputDialog("Selecione o produto\n"+lista);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
        
        Venda v = new Venda(cliente, produto, quantidade);
        listaVenda.add(v);
        
        JOptionPane.showMessageDialog(null, v);        
    }
    
    static void listarVendas() {
        JOptionPane.showMessageDialog(null, listaVenda);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();    
        
    }
    
}
