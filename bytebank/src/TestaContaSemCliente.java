public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaCarla = new Conta(6646,969060);
		System.out.println(contaDaCarla.getSaldo());

		contaDaCarla.setTitular(new Cliente());
		System.out.println(contaDaMarcela.getTitular());

		contaDaCarla.getTitular().setNome("Carla");
		System.out.println(contaDaCarla.getTitular().getNome());

	}
}