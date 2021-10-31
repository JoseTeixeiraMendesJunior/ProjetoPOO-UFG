import java.util.ArrayList;

public class Empresa {
	String nome;
	String ramo;
	String CNPJ;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	double despesas;
	double faturamento;
	
	Empresa (String nome, String ramo, String CNPJ) {
		this.nome = nome;
		this.ramo = ramo;
		this.CNPJ = CNPJ;
	}
	
	//criar função que calcula o lucro;
	//criar função para calcular a folha salarial
	// criar funcao que tirar o comparitvo de vendas por produto

}
