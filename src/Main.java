public class Main {
    public static void main(String[] args) {

        FilaPedidos fila = new FilaPedidos();
        PilhaPedidos pilha = new PilhaPedidos();

        fila.adicionar(new Pedido(1, "Café Expresso"));
        fila.adicionar(new Pedido(2, "Misto"));
        fila.adicionar(new Pedido(3, "Pão de queijo"));
        fila.adicionar(new Pedido(4, "café"));

        System.out.println("== Pedidos pendentes iniciais ==");
        fila.pedidospendentes();

        Pedido atendido = fila.removerpedido();
        System.out.println("\nPedido atendido: " + atendido);

        Pedido cancelado1 = fila.removerpedido();
        pilha.adicionarcan(cancelado1);
        System.out.println("\nPedido cancelado: " + cancelado1);

        Pedido cancelado2 = fila.removerpedido();
        pilha.adicionarcan(cancelado2);
        System.out.println("Pedido cancelado: " + cancelado2);

        Pedido restaurado = pilha.removerpedidocan();
        if (restaurado != null) {
            fila.adicionar(restaurado);
            System.out.println("\nPedido restaurado: " + restaurado);
        }

        System.out.println("\n== Pedidos pendentes finais ==");
        fila.pedidospendentes();

        System.out.println("\n== Pedidos cancelados finais ==");
        pilha.impPedidoCancelado();
    }
}
