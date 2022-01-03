package entities;

public class IMC {
	
	//IMC = Peso � (Altura � Altura)
	
	public double altura;
	public double peso;
	
	public void imc() {
		double imc = peso / (altura * altura);
		
		if (imc >= 18.5 && imc <= 24.9) {
			
			System.out.println("Voc� est� no seu peso adequado.");
			System.out.printf("O seu IMC atual �:" + "%.2f " + imc);
						
		}
		
		else if (imc < 18.5) {
			System.out.printf("Voc� est� abaixo do seu peso adequado.");
			System.out.printf("Seu IMC � de %.2f" + imc + ", o normal est� entre 18.5 e 24.9.");
		}
		
		else {
			System.out.printf("Voc� est� com mais peso do que o adequado.");
			System.out.printf("Seu IMC � de %.2f " + imc + ", o normal est� entre 18.5 e 24.9.");
			
		}
	}
	

}
