package classe;

import Icalculadora.Calculadora;

public class CalculadoraImpl implements Calculadora {

	public double var1;
	public double var2;
	public double varT;

	@Override
	public double soma() {
		return varT = var1 + var2;
	}

	@Override
	public double subtrai() {
		return varT = var1 - var2;
	}

	@Override
	public double multiplica() {
		return varT = var1 * var2;
	}

	@Override
	public double divide() {
		return varT = var1 / var2;
	}

	@Override
	public double resto() {
		return varT = var1 % var2;

	}

}
