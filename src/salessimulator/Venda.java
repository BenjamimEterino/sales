package salessimulator;

/**
 *
 * @author benjamim
 */
public class Venda {

    private String produto;
    private String cliente;
    private int quantidade;
    
    public Venda() {};
    
    public Venda(String produto, String cliente, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString() {
        return "Produto: "+produto+"\nCliente: "+cliente+"\nQuantidade: "+quantidade+"\n";
    }

}
