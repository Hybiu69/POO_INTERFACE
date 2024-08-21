package pooInterface;

public class ObjetoUsuario {

	public static void main(String[] args) {
		
	Usuario user1=new Usuario();
	
	user1.setId(1);
	user1.setNome("Augusto");
	user1.setPassword(987456);
	user1.setPermission("Ler-Gravar");
	user1.setTipo("Comum");
	

	System.out.println("Características do usuário");
	System.out.println("");
	System.out.println(user1.getId());
	System.out.println(user1.getNome());
	System.out.println(user1.getPassword());
	System.out.println(user1.getPermission());
	System.out.println(user1.getTipo());
	
	System.out.println("");
	System.out.println("Ações e eventos do usuário");
	System.out.println("");
	
	System.out.println(user1.getLoggar());
	System.out.println(user1.getLogout());
	System.out.println(user1.getManage());
	System.out.println(user1.getConfi());
		

	}

}
