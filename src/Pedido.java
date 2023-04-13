import java.util.ArrayList;

public class Pedido {
    private String dataDeCriacao;
    private String status;
    private ArrayList<Produto> itens = new ArrayList<Produto>();

    public Pedido(String dataDeCriacao, String status) {
        this.dataDeCriacao = dataDeCriacao;
        this.status = status;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItens(Produto produto) {
        itens.add(produto);
    }

    public Produto removeItens(Produto produto) {
        if (itens.remove(produto)) {
            return produto;
        } else {
            return null;
        }
    }

    public double calculaValorTotal() {
        double valorTotal = 0;
        for (Produto produto : itens) {
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
}
