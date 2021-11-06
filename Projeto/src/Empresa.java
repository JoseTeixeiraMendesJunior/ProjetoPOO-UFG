import java.util.ArrayList;
import java.io.*;

public class Empresa {
	String nome;
	String ramo;
	String CNPJ;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	Empresa (String nome, String ramo, String CNPJ) {
		this.nome = nome;
		this.ramo = ramo;
		this.CNPJ = CNPJ;
	}
	//retorna o faturamento
	public double getFaturamento() {
		double faturamento = 0;
		for(int i = 0; i < this.produtos.size(); i++) {
			faturamento += (produtos.get(i).getHistorico() * produtos.get(i).getValor());
		}
		return faturamento;
	}
	
	//mostrar o lucro da empresa
	public double getLucro() {
		double custo = 0;
		double faturamento = 0;
		
		for(int i = 0; i < this.produtos.size(); i++) {
			custo += (produtos.get(i).getHistorico() * produtos.get(i).getCusto());
			faturamento += (produtos.get(i).getHistorico() * produtos.get(i).getValor());
		}
		
		return (faturamento - custo);
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
	public boolean demiteFunc(int cod) {
		for(int i = 0; i < this.funcionarios.size(); i++) {
			if(funcionarios.get(i).codigo == cod) {
				funcionarios.remove(i);
				return true;
			}
		}
		return false;
	}
	
	//retorna lista de produtos em estoque
	protected ArrayList<Produto> retornaEmEstoque() {
		
		ArrayList<Produto> estoque = new ArrayList<Produto>();
		
		for(int i = 0; i < this.produtos.size(); i++) {
			if(produtos.get(i).getEstoque() > 0) {
				estoque.add(produtos.get(i));
			}
		}
		
		return estoque;
	}
	
	//gera um arquivo com todos os clientes da empresa;
	public boolean listaCliente() throws IOException{
		try {
			
			File arquivoClientes = new File("Clientes.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoClientes, true));
			
			for(int i = 0; i < this.clientes.size(); i++) {
				Cliente temp = clientes.get(i);
				
				writer.write("nome: "+temp.nome+", codigo: "+temp.codCliente+", email: "+temp.email+", telefone: "+temp.telefone+", quantidade de compras: "+temp.getCompras()+", valor gasto: "+temp.getValorGasto()+System.lineSeparator());
			}
			
			writer.close();
			
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	//gera um arquivo com todos os funcionarios da empresa;
		public boolean listaFuncionario() throws IOException{
			try {
				
				File arquivoFuncionarios = new File("Funcionarios.txt");
				BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoFuncionarios, true));
				
				for(int i = 0; i < this.funcionarios.size(); i++) {
					Funcionario temp = funcionarios.get(i);
					
					writer.write("nome: "+temp.nome+", codigo: "+temp.codigo+", cargo: "+temp.cargo+", departamento: "+temp.departamento+", email: "+temp.email+", telefone: "+temp.telefone+", salario: "+temp.getSalario()+System.lineSeparator());
				}
				
				writer.close();
				
				return true;
			}catch(Exception e) {
				return false;
			}
			
		}
		
	//leitura de arquivo
	public boolean leitura(String name) throws IOException {
		
		InputStream is = new FileInputStream(name);
		return true;
		
	}
}
