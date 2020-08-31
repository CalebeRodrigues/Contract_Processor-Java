package model.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.services.PaymentFees;

public class Installment {

	private Date initialDate;
	private Double amount;
	private int plots;
	private PaymentFees paymentFees;	
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Installment(Date initialDate, Double amount, int plots, PaymentFees paymentFees) {
		this.initialDate = initialDate;
		this.amount = amount;
		this.plots = plots;
		this.paymentFees = paymentFees;
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
		double aux;
		aux = amount + ((amount * paymentFees.getJuros()) * month);
		return aux + (aux * paymentFees.getTax());
	}

	public String returnInstallments() {
		String total = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(initialDate);
		
		for(int i = 1; i <= plots; i++) {

			cal.add(cal.MONTH, 1);
			total += sdf.format(cal.getTime()) + " - " + calcInstallment(i) + "\n";
		}
		
		return total;
	}

	@Override
	public String toString() {
		return returnInstallments();
	}
}
