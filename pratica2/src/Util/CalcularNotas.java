package Util;

public class CalcularNotas {
	public static final double P_AV1 = 0.25;
	public static final double P_AV2 = 0.35;
	public static final double P_AV3 = 0.40;
	public static final double MEDIA = 7.0;
	
	public static void Calcular_AV3(double n1, double n2) {
		double N3 = (MEDIA -( n1 * P_AV1 + n2 * P_AV2 )) / P_AV3;
		System.out.println("voce precisa tirar: " + N3);
	}
}
