package Supermercado;

public class AreaMemoria extends Thread{
	// Constantes da classe
	private static final int QTD_CAIXAS = 5;
	
	// Propriedades da classe
	private static Fila[] caixa = new Fila[QTD_CAIXAS];
	
	// Método construtor da classe
	public AreaMemoria() {
		for(int i = 0; i < caixa.length; i++) {
			caixa[i] = new Fila();
		}
	}
	// Métodos da classe
	public static int getQtdCaixas() {
		return caixa.length;
	}
	
	public static Fila getCaixa(int indice) {
		return caixa[indice];
	}
}
