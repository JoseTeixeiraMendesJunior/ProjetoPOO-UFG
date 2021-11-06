import java.util.ArrayList;
import java.io.*;

public class Empresa {
	String nome;
	String ramo;
	String CNPJ;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	double custo;
	double faturamento;
	
	Empresa (String nome, String ramo, String CNPJ) {
		this.nome = nome;
		this.ramo = ramo;
		this.CNPJ = CNPJ;
	}
	
	//mostrar o lucro da loja
	public double getLucro() {
		this.custo = 0;
		this.faturamento = 0;
		
		for(int i = 0; i < this.produtos.size(); i++) {
			this.custo += (produtos.get(i).getHistorico() * produtos.get(i).getCusto());
			this.faturamento += (produtos.get(i).getHistorico() * produtos.get(i).getValor());
		}
		
		return (this.faturamento - this.custo);
	}
	
	// função que retorna a folha salarial
	public double folhasalarial() {
		double temp = 0.0;
		
		for(int i = 0; i < this.funcionarios.size(); i++) {
			temp += this.funcionarios.get(i).salario;
		}
		
		return temp;
	}
	
	//funcao que tirar o comparitvo de vendas por produto
	public int[] comparativo () {
		int[] temp = new int[this.produtos.size()];
		
		return temp;
	}
	

	//func demite funcionario
	
	//leitura de arquivo
	public boolean leitura(String name) throws IOException {
		
		InputStream is = new FileInputStream(name);
		return true;
		
	}
}
