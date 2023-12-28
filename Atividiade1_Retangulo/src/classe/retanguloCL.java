package classe;



public class retanguloCL {
	
	public double largura ;
	public double altura ;
	public double base;
	
	
	public double Area() {
		double area;
		area = base * altura;
		return area;
		
	}
	public double Perimetro() {
	double perimetro;
	perimetro = 2*(base + altura);
	return perimetro;
	
	}
	
	public double Diametro() {
		double diametro;
		diametro = Math.sqrt((Math.pow(base,2)) + (Math.pow(altura,2)));
		return diametro;
	}
		
}

