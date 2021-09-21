import java.util.Scanner;

public class Conta {

Scanner leia = new Scanner(System.in);
private double saldo;

public Main() {
    saldo = 0;
  }

  public static void main(String[] args) {
    Main myObj = new Main();
}

public double sacar() {
	double valor;
	System.out.println("Valor do saque: ");
	valor = leia.nextDouble();
	System.out.println("Realizando Saque... " + valor);
	return saldo = saldo - valor;
}

public void mostrarSaldo() {
	System.out.println("Saldo: " + getSaldo());
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
} 