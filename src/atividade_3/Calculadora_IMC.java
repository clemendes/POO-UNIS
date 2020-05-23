package atividade_3;

import javax.swing.JOptionPane;

/**
 * 
 * @author Cleverson Mendes Faria
 *
 */

/*  QUADRO DE REFERENCIA - RESULTADOS IMC
-----------------------------------------------
[   Resultado  ] 	    [    Situação   ]	
-----------------------------------------------			
 Abaixo de 17			Muito abaixo do peso
 Entre 17 e 18,49		Abaixo do peso
 Entre 18,50 e 24,99		Peso normal
 Entre 25 e 29,99		Acima do peso
 Entre 30 e 34,99		Obesidade I
 Entre 35 e 39,99		Obesidade II (severa)
 Acima de 40			Obesidade III (mórbida) 
 ---------------------------------------------- */

public class Calculadora_IMC {
	
	// METODO MAIN()
	public static void main(String[] args) {
		
		double peso = 0, altura = 0;
		
		try {
			// LEITURA DO PESO
			String entrada1 = JOptionPane.showInputDialog("Informe o seu Peso em (Kg): \nExemplo: 74.50 (utilize ponto)");
			if (entrada1 != null)
				peso = Double.parseDouble(entrada1);
				// LEITURA DA ALTURA
				String entrada2 = JOptionPane.showInputDialog("Informe a sua altura em (cm): \nExemplo: 175");
				if (entrada2 != null)
					altura = Double.parseDouble(entrada2);
					// CHAMA O MÉTODO P/ CALCULAR O IMC
					calcula_imc(peso, altura/100);
		// Erro
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro no programa! \nErro: " + e, "Erro", 0);
		}
	}
	
	// METODO CALCULA_IMC()
	public static void calcula_imc(double peso, double altura) {
		double imc = peso / (altura * altura);
		// CHAMADA EXTERNA
		processa_mensagem(imc);
	}

	// METODO PROCESSA_MENSAGEM()
	public static void processa_mensagem(double valor) {
		
		double imc = valor;
		
		if (imc < 17.00)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Muito abaixo do peso!", "Resultado", 1);
		else if (imc >= 17.00 && imc <= 18.49)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Abaixo do peso!", "Resultado", 1);
		else if (imc >= 18.50 && imc <= 24.99)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Peso normal!", "Resultado", 1);
		else if (imc >= 25.00 && imc <= 29.99)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Acima do peso!", "Resultado", 1);
		else if (imc >= 30.00 && imc <= 34.99)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Obesidade I!", "Resultado", 1);
		else if (imc >= 35.00 && imc <= 39.99)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Obesidade II (severa)!", "Resultado", 1);
		else if (imc >= 40.00)
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"
					+ "\nSituação: Obesidade III (mórbida)!", "Resultado", 1);
		else
			JOptionPane.showMessageDialog(null, "Valores informados inválidos!", "Erro", 0);
	}

}
