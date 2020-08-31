package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date initialDate;
	private Double amount;
	private int plots;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Installment(Date initialDate, Double amount, int plots) {
		this.initialDate = initialDate;
		this.amount = amount;
		this.plots = plots;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double calcInstallment(int month) {
		return amount + ((amount + (amount * 0.1) * month) * 0.2);
	}


	@Override
	public String toString() {
		StringBuilder resul = null;
		Date newDate = initialDate;
		
		for(int i = 1; i <= plots ;i++) {
			newDate.setMonth(initialDate.getMonth() + i); 
			resul.append(sdf.format(newDate) + " - " + calcInstallment(i) + "\n");
		}
		
		return resul.toString();
	}
}
