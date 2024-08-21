package pooInterface;

public class Usuario {
	
	int id,password;
	String nome,permission,tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password=password;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission=permission;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public String getLoggar() {
		return "Loggando";
	}
	
	public String getLogout() {
		return "logout";
	}
	
	public String getConfi() {
		return "Configurar";
	}
	
	public String getManage() {
		return "Gerenciar";
	}

}
