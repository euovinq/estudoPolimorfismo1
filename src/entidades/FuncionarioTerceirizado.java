package entidades;

public class FuncionarioTerceirizado extends Funcionario {
	
	Double custosAdicionais;
	
	
	@Override
	public Double pagamento() {
		
		
		return super.pagamento() + custosAdicionais * 1.1;
		
	}
	
	public FuncionarioTerceirizado() {
		
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double custosAdicionais) {
		
		super(nome,horas,valorPorHora);
		this.custosAdicionais = custosAdicionais;
		
	}
	

}
