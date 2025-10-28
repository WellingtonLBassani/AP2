public class PilhaPedidos {
    private No topo;

    public PilhaPedidos() {
        this.topo = null;
    }

    public void adicionarcan(Pedido pedido) {
        No novo = new No(pedido);
        novo.proximo = topo;
        topo = novo;
    }

    public Pedido removerpedidocan() {
        if (topo == null) {
            System.out.println("Nenhum pedido cancelado para restaurar.");
            return null;
        }
        Pedido removido = topo.dado;
        topo = topo.proximo;
        return removido;
    }

    public void impPedidoCancelado() {
        if (topo == null) {
            System.out.println("Nenhum pedido cancelado.");
            return;
        }
        No atual = topo;
        System.out.println("Pedidos Cancelados:");
        while (atual != null) {
            System.out.println(atual.dado);
            atual = atual.proximo;
        }
    }

    public boolean estavazio() {
        return topo == null;
    }
}
