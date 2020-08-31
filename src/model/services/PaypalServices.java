package model.services;

public class PaypalServices implements PaymentFees {

	@Override
	public Double getJuros() {
		return 0.01;
	}

	@Override
	public Double getTax() {
		return 0.02;
	}
	
}
