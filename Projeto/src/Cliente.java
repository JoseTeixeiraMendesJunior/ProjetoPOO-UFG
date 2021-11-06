
public class Cliente extends Pessoa {
	
	String codCliente;
	protected int compras;
	protected double valorgasto;
	
	Cliente(String name, String sx, String fone, String mail, String cod) {
		super(name, sx, fone, mail);
		this.codCliente = cod;
		this.compras = 0;
		this.valorgasto = 0.0;
		// TODO Auto-generated constructor stub
	}
	
	public void addCompra(int quantidade, double valor) {
		this.compras += quantidade;
		this.valorgasto += valor;
	}
	
	public String getCompras(){
		return Integer.toString(this.compras);
	}
	
	public String getValorGasto() {
		return Double.toString(this.valorgasto);
	}
	
}