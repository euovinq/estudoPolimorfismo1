package entidades;

public class FuncionarioTerceirizado extends Funcionario {
	
	Double custosAdicionais;
	
	
	@Override
	public Double pagamento() {
		
		Double bonus = custosAdicionais * 1.1;	
		return horas * valorPorHora + bonus;
		
	}
	
	public FuncionarioTerceirizado() {
		
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double custosAdicionais) {
		
		super(nome,horas,valorPorHora);
		this.custosAdicionais = custosAdicionais;
		
	}
	

}
