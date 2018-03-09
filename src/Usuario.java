
public class Usuario {
	private String nome;
	private String sobrenome;
	private int CPF;
	private String dataNascimento;
	private String email;
	private String sexo;
	
	public Usuario(String nome, String sobrenome, int CPF, String dataNascimento, String email, String sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int CPF) {
		this.CPF = CPF;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
