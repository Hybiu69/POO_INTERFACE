package pooInterface;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		
		Fornecedor for1=new Fornecedor ();
		
		for1.setId(1);
		for1.setRazSoc("Empresa Mais que Legal");
		for1.setNomFant("Mais Legal");
		for1.setCnpj("741852/4225");
		for1.setEnde("Rua Felicidade Estado Esperança");
		for1.setTel("7785429");
		for1.setEmail("empresa_mais_q_legal@gmail.com");
		for1.setInscEst("022684126");
		
		System.out.println("Características do fornecedor");
		System.out.println("");
		
		System.out.println(for1.getId());
		System.out.println(for1.getRazSoc());
		System.out.println(for1.getNomFant());
		System.out.println(for1.getCnpj());
		System.out.println(for1.getEnde());
		System.out.println(for1.getTel());
		System.out.println(for1.getEmail());
		System.out.println(for1.getInscEst());
		
		System.out.println("");
		System.out.println("As ações e eventos");
		System.out.println("");
		
		System.out.println(for1.getSell());
		System.out.println(for1.getBuy());
		System.out.println(for1.getManage());
		System.out.println(for1.getContact());
		

	}

}
