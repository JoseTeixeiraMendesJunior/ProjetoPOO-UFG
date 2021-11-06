
public class Produto {
	String nome;
	String categoria;
	protected double custo;
	protected double valor;
	protected int estoque;
	protected int historico; // tentar adiconar a mesma logica do contador.
	
	
	Produto (String nome, String categoria) {
		this.nome = nome;
		this.categoria = categoria;
		this.estoque = 0;
	}
	
	public void setValor (double val) {
		this.valor = val;
	}
	
	public void setEstoque (int estoq) {
		this.estoque = estoq;
	}
	
	public void setCusto (double custo) {
		this.custo = custo;
	}
	
	public double getCusto () {
		return this.custo;
	}
	
	public double getValor () {
		return this.valor;
	}
	
	public int getEstoque () {
		return this.estoque;
	}
	
	public int getHistorico() {
		return this.historico;
	}
	
	public boolean Venda (int quantidade) {
		if(this.estoque >= quantidade) {
			this.estoque -= quantidade;
			this.historico += quantidade;
			return true;
		}
		return false;
	}
}
