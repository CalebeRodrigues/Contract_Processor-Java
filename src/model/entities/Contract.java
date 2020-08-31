package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Double contractValue;
	private int numberInstallment;
	
	private List<Installment> installment = new ArrayList<>();

	public Contract(Integer number, Double contractValue, int numberInstallment, Installment installment) {
		this.number = number;
		this.contractValue = contractValue;
		this.installment.add(installment);
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

	public List<Installment> getInstallment() {
		return installment;
	}

	public void addInstallment(Installment installment) {
		this.installment.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		this.installment.remove(installment);
	}

	@Override
	public String toString() {
		
		StringBuilder report = null;
		
		for (Installment x : installment) {
			report.append(x.toString());
		}
		
		return report.toString();
	}
}
