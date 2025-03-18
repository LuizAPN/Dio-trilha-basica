
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Olá, seja bem vindo ao banco Java!");
        System.out.println("Para iniciarmos seu atendimento");
        System.out.println("Digite seu Nome");
        String nome = scanner.next();
        System.out.println("Digite sua Conta de banco: ");
        int conta = scanner.nextInt();
        System.out.println("Agora, sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Por fim, digite o saldo Diponível: ");
        double saldo = scanner.nextDouble();
        System.err.println("Compilando");
        System.err.println(".");
        System.err.println("..");
        System.err.println("...");
        System.err.println("....");
        System.err.println(".....");
        System.err.println("Conta criada com Sucesso!");
        System.out.println("Bem vindo ao Banco java, " + nome + " !");
        System.out.println("Sua conta é : " + conta + " e sua agência é : " + agencia);
        System.out.println("Seu saldo em conta é de R$" + saldo + " e está disponivel para saque.");
        
    }

}
