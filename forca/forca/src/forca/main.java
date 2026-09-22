package forca;
import javax.swing.JOptionPane;
public class main {
	public static void main(String args []) {
		int caracteres = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de caracteres:"));
		int NumeroDaLetra = 0, acertos = 0, erros = 0;
		int acertouEssaRodada = 0;
		int PalavraInt[] = new int[caracteres];
		int jaChutada[] = new int[27];
		String forca = "";
		String palavra[] = new String[caracteres];
		String mostrar[] = new String[caracteres];

		for (int i = 1; i <= caracteres; i++) {
			palavra[i-1] = JOptionPane.showInputDialog("insira a letra da posição " + i);
			switch (palavra[i-1]) {
			case "a": NumeroDaLetra = 1; break;
			case "b": NumeroDaLetra = 2; break;
			case "c": NumeroDaLetra = 3; break;
			case "d": NumeroDaLetra = 4; break;
			case "e": NumeroDaLetra = 5; break;
			case "f": NumeroDaLetra = 6; break;
			case "g": NumeroDaLetra = 7; break;
			case "h": NumeroDaLetra = 8; break;
			case "i": NumeroDaLetra = 9; break;
			case "j": NumeroDaLetra = 10; break;
			case "k": NumeroDaLetra = 11; break;
			case "l": NumeroDaLetra = 12; break;
			case "m": NumeroDaLetra = 13; break;
			case "n": NumeroDaLetra = 14; break;
			case "o": NumeroDaLetra = 15; break;
			case "p": NumeroDaLetra = 16; break;
			case "q": NumeroDaLetra = 17; break;
			case "r": NumeroDaLetra = 18; break;
			case "s": NumeroDaLetra = 19; break;
			case "t": NumeroDaLetra = 20; break;
			case "u": NumeroDaLetra = 21; break;
			case "v": NumeroDaLetra = 22; break;
			case "w": NumeroDaLetra = 23; break;
			case "x": NumeroDaLetra = 24; break;
			case "y": NumeroDaLetra = 25; break;
			case "z": NumeroDaLetra = 26; break;
			}
			PalavraInt[i-1] = NumeroDaLetra;
			mostrar[i-1] = "_";
		}

		

		while (acertos != caracteres && erros < 7) {

			String mostrarAtual = "";
			for (int i = 0; i < caracteres; i++) {
				mostrarAtual = mostrarAtual + mostrar[i] + " ";
			}

			String entrada = JOptionPane.showInputDialog(forca + "\n" + mostrarAtual + "\nErros: " + erros + "\nChute uma letra:");

			switch (entrada) {
			case "a": NumeroDaLetra = 1; break;
			case "b": NumeroDaLetra = 2; break;
			case "c": NumeroDaLetra = 3; break;
			case "d": NumeroDaLetra = 4; break;
			case "e": NumeroDaLetra = 5; break;
			case "f": NumeroDaLetra = 6; break;
			case "g": NumeroDaLetra = 7; break;
			case "h": NumeroDaLetra = 8; break;
			case "i": NumeroDaLetra = 9; break;
			case "j": NumeroDaLetra = 10; break;
			case "k": NumeroDaLetra = 11; break;
			case "l": NumeroDaLetra = 12; break;
			case "m": NumeroDaLetra = 13; break;
			case "n": NumeroDaLetra = 14; break;
			case "o": NumeroDaLetra = 15; break;
			case "p": NumeroDaLetra = 16; break;
			case "q": NumeroDaLetra = 17; break;
			case "r": NumeroDaLetra = 18; break;
			case "s": NumeroDaLetra = 19; break;
			case "t": NumeroDaLetra = 20; break;
			case "u": NumeroDaLetra = 21; break;
			case "v": NumeroDaLetra = 22; break;
			case "w": NumeroDaLetra = 23; break;
			case "x": NumeroDaLetra = 24; break;
			case "y": NumeroDaLetra = 25; break;
			case "z": NumeroDaLetra = 26; break;
			}

			if (jaChutada[NumeroDaLetra] == 1) {
				JOptionPane.showMessageDialog(null, "Você já chutou essa letra!");
			} else {
				jaChutada[NumeroDaLetra] = 1;

				acertouEssaRodada = 0;
				for (int i = 0; i < caracteres; i++) {
					if (PalavraInt[i] == NumeroDaLetra) {
						mostrar[i] = palavra[i];
						acertos++;
						acertouEssaRodada = 1;
					}
				}

				if (acertouEssaRodada == 0) {
					erros++;

					switch (erros) {
						case 1:
						forca = "~";
						break;
						case 2:
						forca = "Õ";
						break;
						case 3:
						forca =  "Õ \n  |";
						break;
						case 4:
						forca = "Õ \n-|";
						break;
						case 5:
						forca = "Õ \n-|-";
						break;
						case 6:
						forca = "Õ \n-|- \n |";
						break;
						case 7:
						forca = "Õ \n-|- \n ||";
						break;
					}
				}
			}
		}

		String mostrarFinal = "";
		for (int i = 0; i < caracteres; i++) {
			mostrarFinal = mostrarFinal + mostrar[i] + "";
		}

		if (acertos == caracteres) {
			JOptionPane.showMessageDialog(null, "Parabéns, você venceu!\n" + mostrarFinal);
		} else {
			String palavraCompleta = "";
			for (int i = 0; i < caracteres; i++) {
				palavraCompleta = palavraCompleta + palavra[i];
			}
			JOptionPane.showMessageDialog(null, "Você perdeu!\nA palavra era: " + palavraCompleta);
		}
	}
}
