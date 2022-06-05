
package salessimulator;

/**
 *
 * @author benjamim
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int stock;
    
    public Produto(){};
    
    public Produto(int id,String nome,double preco,int stock) {
        this.id = id;
        this.nome =  nome;
        this.preco = preco;
        this.stock = stock;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String toString () {
        return "Id: "+id+" Nome: "+nome+" Preco: "+preco+" Stock: "+stock+"\n";
    }
    
}
