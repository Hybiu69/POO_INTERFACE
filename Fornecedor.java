package pooInterface;

public class Fornecedor {
	
	int id;
	String razSoc,nomFant,cnpj,ende,tel,email,inscEst;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getRazSoc(){
		return razSoc;
	}
	public void setRazSoc(String razSoc) {
		this.razSoc=razSoc;
	}
	
	public String getNomFant() {
		return nomFant;
	}
	public void setNomFant(String nomFant) {
		this.nomFant=nomFant;
	}
	
	public String getCnpj () {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	
	public String getEnde () {
		return ende;
	}
	public void setEnde(String ende) {
		this.ende=ende;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getInscEst() {
		return inscEst;
	}
	public void setInscEst(String inscEst) {
		this.inscEst=inscEst;
	}
	
	public String getSell() {
		return "Vender";
	}
	
	public String getManage() {
		return "Gerenciar";
	}
	public String getBuy() {
		return "Comprar";
	}
	public String getContact() {
		return "Contatar";
	}
}
