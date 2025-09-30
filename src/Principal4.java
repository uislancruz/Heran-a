import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal4 {
    public static void main(String[] args) {
        Titular titular = new Titular("Joao maria", "12345678910");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234, 999999);

        System.out.println("Sua conta: "+conta1);
    }
}
