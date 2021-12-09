public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Ricardo Altmann");
		paulo.setCpf("874.999.222.-33");
		paulo.setProfissao("programador");

		Conta contaDoPaulo = new Conta(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paloma Altmann");
		paulo.setCpf("874.469.562.-33");
		paulo.setProfissao("Coordenadora");

		Conta contaDoPaulo = new Conta(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(paulo);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}