package lemuelCavalcante.estoque;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	public void incluir(Produto p) {
		produtos.add(p);
	}
	public void comprar(int cod, int quant, double preco) {
		Produto produto = pesquisar(cod);
		produto.compra(quant, preco);
	}
	public double vender(int cod, int quant) {
		for(int i=0; i<produtos.size(); i++) {
			if(cod == produtos.get(i).getCodigo()) {
				produtos.get(i);
				pesquisar(cod).compra(quant, quant);
				return pesquisar(cod).venda(quant);
			}
	}
		return -1;
}
	public Fornecedor fornecedor(int cod) {
		Fornecedor forn = null;
		for(int i=0; i<produtos.size(); i++) {
			if(cod == produtos.get(i).getCodigo()){
				produtos.get(i);
				return forn;
				} 
		}
		return null;
	}

	private Produto pesquisar(int cod) {
		for(int i=0; i<produtos.size(); i++) {
			if(cod == produtos.get(i).getCodigo()){
				return produtos.get(i);
			}
		}
		return null;
	}
	
	public int quantidade(int cod){
		for(int i=0; i<produtos.size(); i++) {
			if(cod == produtos.get(i).getCodigo()){
				produtos.get(i);
				return quantidade(i);
			}
		}
		return -1;

	}

	public ArrayList<Produto> estoqueAbaixoDoMinimo(){
		ArrayList<Produto> produtosAbaixoDoMinimo = new ArrayList<Produto>();
		int i;
		for (i=0; i<produtos.size(); i++) {
			if(produtos.get(i).getQuantidade() < produtos.get(i).getEstMinimo()) {
				produtosAbaixoDoMinimo.add(produtos.get(i));

			}
		}
		return produtosAbaixoDoMinimo;
	}

}
