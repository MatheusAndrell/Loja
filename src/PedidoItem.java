public class PedidoItem {
    private int quantidade;
    private double subtotal;

    public PedidoItem(int quantidade, double subtotal) {
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
