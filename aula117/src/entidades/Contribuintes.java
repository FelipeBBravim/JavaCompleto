package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelContribuinte;

public class Contribuintes {

	private String nome;
	private NivelContribuinte level;
	private Double salarioBase;

	private Departamento departamento;
	private List<HorasDeContrato> contratos = new ArrayList<>();

	public Contribuintes() {
	}

	public Contribuintes(String nome, NivelContribuinte level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelContribuinte getLevel() {
		return level;
	}

	public void setLevel(NivelContribuinte level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HorasDeContrato> getContrato() {
		return contratos;
	}
	
	public void addContrato(HorasDeContrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(HorasDeContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double income(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HorasDeContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
