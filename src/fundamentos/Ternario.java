package fundamentos;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 4.8;
		
		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recupera��o";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && nota >= 7;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s ", resultado);
		
	}

}
