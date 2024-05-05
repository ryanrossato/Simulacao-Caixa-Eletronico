import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        float saldo = 0;
        float retirada = 0;

        while(continuar){

        System.out.println("Escolha a operação desejada");
        System.out.println("1-Adicionar Saldo/2-Retirar Valor/3-Verificar Saldo Disponível/4-Sair");
        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Quanto deseja adicionar?");
                saldo += entrada.nextFloat();
                break;
            case 2:
            if(saldo < 1){
                System.out.println("Você não tem dinheiro para retirada");  
                System.out.println("");
            }else{
                System.out.println("Quanto deseja retirar?");
                retirada = entrada.nextFloat();
            }if(retirada > saldo){
                System.out.println("Este valor é maior que seu saldo, que é: R$ "+saldo);
                System.out.println("");
            }else{
                System.out.println("Quanto deseja retirar?");
                saldo -= entrada.nextFloat();
            }                
                break;
            case 3:
                System.out.println("Este é seu saldo: R$ "+saldo);
                System.out.println("");
                break;
            case 4:
                System.exit(0);
            break;
            default:
            System.out.println("Essa opção não existe, tente outra");
                break;
        }
    }
   entrada.close();
    }
}
