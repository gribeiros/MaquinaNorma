package entities;

public class Registrador {
	private String nome;
	private Integer sinal;
	private Integer numero;

	public Registrador(String nome, Integer sinal, Integer numero) {
		this.nome = nome;
		this.sinal = sinal;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSinal() {
		return sinal;
	}

	public void setSinal(Integer sinal) {
		this.sinal = sinal;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean eZero2(int a) {

		if (a == 0) {
			return false;
		} else {
			return true;
		}

	}

	public Boolean eZero(Registrador a) {

		if (a.getNumero() == 0) {
			return false;
		} else {
			return true;
		}

	}

	public Registrador increment(Registrador a, Registrador b) {
		int n1, n2;
		n1 = a.getNumero();
		n2 = b.getNumero();
		while (eZero(b)) {
			n1++;
			n2--;
			a.setNumero(n1);
			b.setNumero(n2);
			System.out.printf(
					"\n%s [sinal =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [sinal =" + " %d" + ", numero ="
							+ " %d" + "]",
					a.getNome(), a.getSinal(), a.getNumero(), b.getNome(), b.getSinal(), b.getNumero());
		}

		return a;
	}

	public Registrador decrement(Registrador a, Registrador b) {
		int n1, n2;
		n1 = a.getNumero();
		n2 = b.getNumero();
		while (eZero(b)) {
			n1--;
			n2--;
			if (n1 >= 0) {
				a.setNumero(n1);
			} else if (n1 < 0) {
				a.setNumero(n1);
				a.setSinal(1);
			}
			b.setNumero(n2);

			System.out.printf(
					"\n%s [sinal =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [sinal =" + " %d" + ", numero ="
							+ " %d" + "]",
					a.getNome(), a.getSinal(), a.getNumero(), b.getNome(), b.getSinal(), b.getNumero());
		}

		return a;
	}

	public Registrador multi(Registrador a, Registrador b) {
		int n1, n2, aux, aux2, i = 1, j = 0;
		n1 = a.getNumero();
		n2 = b.getNumero();
		aux = n1;
		aux2 = n2;

		while (i < n2) {
			while (j < n1) {
				aux++;
				aux2--;
				j++;
				a.setNumero(aux);
				b.setNumero(aux2);
				System.out.printf(
						"\n%s [sinal =" + " %d" + ", numero =" + " %d" + "]" + "  " + "%s [sinal =" + " %d"
								+ ", numero =" + " %d" + "]",
						a.getNome(), a.getSinal(), a.getNumero(), b.getNome(), b.getSinal(), b.getNumero());
			}
			aux2 = n2;
			j = 0;
			i++;
		}
		return a;
	}

	@Override
	public String toString() {
		return String.format("%s [sinal =" + " %d" + ", numero =" + " %d" + "]", nome, sinal, numero);
	}

}
