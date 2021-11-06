
public class Funcionario extends Pessoa{
	int codigo;
	String cargo;
	String departamento;
	protected double salario;
	
	Funcionario(String name, String sx, String fone, String mail, int cod, String crg, String dept, double sal) {
		super(name, sx, fone, mail);
		this.codigo = cod;
		this.cargo = crg;
		this.departamento = dept;
		this.salario = sal;
	}
	
	public String getSalario() {
		return Double.toString(this.salario);
	}
}
