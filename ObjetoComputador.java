package pooInterface;

public class ObjetoComputador {

	public static void main(String[] args) {

		Computador comp1=new Computador ();

		comp1.setPsu("Fonte");
		comp1.setMobo("Placa-Mãe");
		comp1.setCpu("Processador");
		comp1.setRam("Memória RAM");
		comp1.setArmaz("SSD NVME");
		comp1.setGpu("Placa de Vídeo");
		comp1.setCooler("Water-Cooler");
		comp1.setFan("Ventoinhas");
		comp1.setGabin("Gabinete");
		
		System.out.println("As características do computador");
		System.out.println("");
		
		System.out.println(comp1.getPsu());
		System.out.println(comp1.getMobo());
		System.out.println(comp1.getCpu());
		System.out.println(comp1.getRam());
		System.out.println(comp1.getArmaz());
		System.out.println(comp1.getGpu());
		System.out.println(comp1.getCooler());
		System.out.println(comp1.getGabin());
		System.out.println(comp1.getFan());
		
		System.out.println("");
		System.out.println("As ações e eventos do computador");
		System.out.println("");
		
		System.out.println(comp1.getOn());
		System.out.println(comp1.getOff());
		System.out.println(comp1.getRes());
		System.out.println(comp1.getSear());
		
		
	}

}
