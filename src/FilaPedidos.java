public class FilaPedidos {
    private No inicio;
    private No fim;

    public FilaPedidos() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(Pedido pedido) {
        No novo = new No(pedido);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public Pedido removerpedido() {
        if (inicio == null) {
            System.out.println("A fila está vazia!");
            return null;
        }
        Pedido removido = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null)
            fim = null;
        return removido;
    }

    public void pedidospendentes() {
        if (inicio == null) {
            System.out.println("Nenhum pedido pendente.");
            return;
        }
        No atual = inicio;
        System.out.println("Pedidos Pendentes:");
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    public boolean estavazio() {
        return inicio == null;
    }
}
