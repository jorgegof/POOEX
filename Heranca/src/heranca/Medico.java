package heranca;

public class Medico extends Funcionario {
	
	private int crm;

	public Medico(String cPF, String nome, String endereco, int crm) {
		super(cPF, nome, endereco);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String toString() {
		return super.toString() + "Medico [crm=" + crm + "]" ;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (crm != other.crm)
			return false;
		return true;
	}

}
