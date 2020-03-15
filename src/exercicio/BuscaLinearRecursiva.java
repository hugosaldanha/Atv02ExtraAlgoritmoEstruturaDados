package exercicio;

import javax.swing.JOptionPane;

public class BuscaLinearRecursiva {
	public static void main(String[] args) {
		int iVetor[] = new int[] { 5, 3, 2, 4, 6 };
		int iIndice, iK;

		iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca:"));

		iIndice = busca(iVetor, 0, iK);

		String sTitle = "Busca Linear Recursiva - Sa�da";
		String sIO = "O n�mero " + iK;

		if (iIndice < iVetor.length)
			sIO += " esta localizado no indice " + iIndice + " do vetor.";
		else
			sIO += " n�o esta localizado no vetor.";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);

	}

	private static int busca(int iV[], int iI, int iK) {
		if ((iI < iV.length) && (iK != iV[iI]))
			return busca(iV, iI + 1, iK);
		return iI;

	}
}
