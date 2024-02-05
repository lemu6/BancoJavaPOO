package lemuelCavalcante.estoque;

public class MainEstoque {

	public static void main(String [] args) {
		Estoque estoque = new Estoque();

		Fornecedor f1 = new Fornecedor(1212, "Carvalho");

		Produto p1 = new Produto(1, "omo", 5, 2, f1);
		Produto p2 = new Produto(2, "Nescau", 3, 5, f1);

		estoque.incluir(p1);
		estoque.incluir(p2);
		estoque.comprar(1, 2, 3.0);
		estoque.comprar(2, 2, 2.0);
		estoque.estoqueAbaixoDoMinimo();
		p2.venda(1);
		p1.compra(2, 4);
		p1.venda(1);
		p1.setEstMinimo(20);
		//p1.Fornecedor(1);
		System.out.println(f1.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
