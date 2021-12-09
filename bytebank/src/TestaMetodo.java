public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoRicardo = new Conta(6646,969060);
		contaDoRicardo.deposita(100);
		contaDoRicardo.deposita(50);
		System.out.println(contaDoRicardo.getSaldo());

		boolean conseguiuRetirar = contaDoRicardo.saca(20);
		System.out.println(contaDoRicardo.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaCarla = new Conta(6644,969063);
		contaDaCarla.deposita(1000);

		boolean sucessoTransferencia = contaDaCarla.transfere(300, contaDoRicardo);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaCarla.getSaldo());
		System.out.println(contaDoRicardo.getSaldo());
	}

}