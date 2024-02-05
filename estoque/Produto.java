package lemuelCavalcante.estoque;

public class Produto {

	private int codigo;
	private String descricao;
	private double PrecoDeCompra;
	private double PrecoDeVenda;
	private double lucro;
	private int quantidade;
	private int EstMinimo;
	private Fornecedor forn;

	public Produto(int cod, String desc, double lucro, int Min, Fornecedor forn) {
		this.codigo = cod;
		this.descricao = desc;
		this.lucro = lucro;
		EstMinimo = Min;
		setForn(forn);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoDeCompra() {
		return PrecoDeCompra;
	}

	public void setPrecoDeCompra(double precoDeCompra) {
		PrecoDeCompra = precoDeCompra;
	}

	public double getPrecoDeVenda() {
		return PrecoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		PrecoDeVenda = precoDeVenda;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstMinimo() {
		return EstMinimo;
	}

	public void setEstMinimo(int estMinimo) {
		EstMinimo = estMinimo;
	}

	public Fornecedor getForn() {
		return forn;
	}

	public void setForn(Fornecedor forn) {
		this.forn = forn;
	}

	public void compra(int quant, double val) {
		if(quant >= 0 || val > 0) {
			this.quantidade += quant;
			setPrecoDeCompra(((quantidade - quant) * getPrecoDeCompra() + quant * val)/quantidade);
			setPrecoDeVenda(this.PrecoDeCompra * (1 + this.lucro));
		}else {
			System.out.println("Impossivel comprar!");
		}

	}

	public double venda(int quant) {
		if(quant <= this.getQuantidade()) {
			double valor = quant * getPrecoDeVenda();
			setQuantidade(getQuantidade() - quant);
			return valor;
		}else {
			return -1;
		}

	}

/*
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", PrecoDeCompra=" + PrecoDeCompra
				+ ", PrecoDeVenda=" + PrecoDeVenda + ", lucro=" + lucro + ", quantidade=" + quantidade + ", EstMinimo="
				+ EstMinimo + ", forn=" + forn + "]";
	}
	*/

	

}

