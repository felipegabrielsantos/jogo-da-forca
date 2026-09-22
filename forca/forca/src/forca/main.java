package forca;
import javax.swing.JOptionPane;
public class main {
	public static void main(String args []) {
		int caracteres = Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de caracteres:"));
		int n = 0, acertos = 0, erros = 0;
		int acertouEssaRodada = 0;
		String forca = "";
		String palavra[] = new String[caracteres];
		String mostrar[] = new String[caracteres];
		int PalavraInt[] = new int[caracteres];
		int jaChutada[] = new int[27];

		for (int i = 1; i <= caracteres; i++) {
			palavra[i-1] = JOptionPane.showInputDialog("insira a letra da posição " + i);
			switch (palavra[i-1]) {
			case "a": n = 1; break;
			case "b": n = 2; break;
			case "c": n = 3; break;
			case "d": n = 4; break;
			case "e": n = 5; break;
			case "f": n = 6; break;
			case "g": n = 7; break;
			case "h": n = 8; break;
			case "i": n = 9; break;
			case "j": n = 10; break;
			case "k": n = 11; break;
			case "l": n = 12; break;
			case "m": n = 13; break;
			case "n": n = 14; break;
			case "o": n = 15; break;
			case "p": n = 16; break;
			case "q": n = 17; break;
			case "r": n = 18; break;
			case "s": n = 19; break;
			case "t": n = 20; break;
			case "u": n = 21; break;
			case "v": n = 22; break;
			case "w": n = 23; break;
			case "x": n = 24; break;
			case "y": n = 25; break;
			case "z": n = 26; break;
			}
			PalavraInt[i-1] = n;
			mostrar[i-1] = "_";
		}

		

		while (acertos != caracteres && erros < 7) {

			String mostrarAtual = "";
			for (int i = 0; i < caracteres; i++) {
				mostrarAtual = mostrarAtual + mostrar[i] + " ";
			}

			String entrada = JOptionPane.showInputDialog(forca + "\n" + mostrarAtual + "\nErros: " + erros + "\nChute uma letra:");

			switch (entrada) {
			case "a": n = 1; break;
			case "b": n = 2; break;
			case "c": n = 3; break;
			case "d": n = 4; break;
			case "e": n = 5; break;
			case "f": n = 6; break;
			case "g": n = 7; break;
			case "h": n = 8; break;
			case "i": n = 9; break;
			case "j": n = 10; break;
			case "k": n = 11; break;
			case "l": n = 12; break;
			case "m": n = 13; break;
			case "n": n = 14; break;
			case "o": n = 15; break;
			case "p": n = 16; break;
			case "q": n = 17; break;
			case "r": n = 18; break;
			case "s": n = 19; break;
			case "t": n = 20; break;
			case "u": n = 21; break;
			case "v": n = 22; break;
			case "w": n = 23; break;
			case "x": n = 24; break;
			case "y": n = 25; break;
			case "z": n = 26; break;
			}

			if (jaChutada[n] == 1) {
				JOptionPane.showMessageDialog(null, "Você já chutou essa letra!");
			} else {
				jaChutada[n] = 1;

				acertouEssaRodada = 0;
				for (int i = 0; i < caracteres; i++) {
					if (PalavraInt[i] == n) {
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
