import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificacaoSaldoAspect {

    // Define o ponto de corte para interceptar o método sacar em qualquer classe que herde de Conta
    @Pointcut("execution(void Conta.sacar(double)) && args(valor) && target(conta)")
    public void saque(Conta conta, double valor) {}

    // Aconselha o método antes de qualquer saque
    @Before("saque(conta, valor)")
    public void verificarSaldo(Conta conta, double valor) {
        // Verifica o saldo antes de permitir o saque
        if (!conta.verificarSaldo(valor)) {
            System.err.println("Erro: Saldo insuficiente na conta " + conta.getClass().getSimpleName() + 
                               " para o valor solicitado de " + valor);
        }
    }
}

