package pooInterface;

public class Computador {
	
	String psu,mobo,cpu,gpu,cooler,fan,armaz,ram,gabin;
	
	public String getPsu() {
		return psu;
	}
	public void setPsu(String psu) {
		this.psu=psu;
	}
	
	public String getMobo() {
		return mobo;
	}
	public void setMobo(String mobo) {
		this.mobo=mobo;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu=cpu;
	}
	
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu=gpu;
	}
	
	public String getCooler() {
		return cooler;
	}
	public void setCooler(String cooler) {
		this.cooler=cooler;
	}
	
	public String getFan() {
		return fan;
	}
	public void setFan(String fan) {
		this.fan=fan;
	}
	
	public String getArmaz() {
		return armaz;
	}
	public void setArmaz(String armaz) {
		this.armaz=armaz;
	}
	
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram=ram;
	}
	
	public String getGabin() {
		return gabin;
	}
	public void setGabin(String gabin) {
		this.gabin=gabin;
	}
	
	public String getOn() {
		return "Ligando";
	}
	public String getOff() {
		return "Desligando";
	}
	public String getRes() {
		return "Reiniciando";
	}
	public String getSear() {
		return "Navegando";
	}
	public String getProgram() {
		return "Programando";
	}

}
