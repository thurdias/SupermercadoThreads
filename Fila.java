package Supermercado;

public class Fila {
	// Propriedades da classe
	private No cabeca = null;
	
	// Métodos da classe
	public void entrar(int numero) {
		if(cabeca == null) {
			cabeca = new No(numero,null);
		} else {
			No novoNo = new No(numero,null);
			novoNo.setProximo(cabeca);
			cabeca = novoNo;
		}
	}
	
	public void atender() {
		if (cabeca != null) {
			No ponteiro = cabeca;
			if(ponteiro.getProximo() == null) {
				cabeca = null;
			} else {
				while(ponteiro.getProximo().getProximo() != null) {
					ponteiro = ponteiro.getProximo();
				}
				ponteiro.setProximo(null);
			}
		}
	}
	
	public int contar() {
		int retorno = 0;
		No ponteiro = cabeca;
		while(ponteiro != null) {
			retorno++;
			ponteiro = ponteiro.getProximo();
		}
		return retorno;
	}

}
