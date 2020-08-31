package model.entities;

public class Contract {
	
	private Integer number;
	private Double contractValue;
	private int numberInstallment;
	
	private Installment installment;

	public Contract(Integer number, Double contractValue, int numberInstallment, Installment installment) {
		this.number = number;
		this.contractValue = contractValue;
		this.installment = installment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getContractValue() {
		return contractValue;
	}

	public void setContractValue(Double contractValue) {
		this.contractValue = contractValue;
	}

	public int getNumberInstallment() {
		return numberInstallment;
	}

	public void setNumberInstallment(int numberInstallment) {
		this.numberInstallment = numberInstallment;
	}

	public Installment getInstallment() {
		return installment;
	}

	@Override
	public String toString() {
		return installment.toString();
	}
}
