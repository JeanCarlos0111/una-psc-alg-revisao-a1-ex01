import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cartaoVacina, sintomasRecentes, contatoSintomaticos, viagemExterior;
        int idade;
        boolean respostaValida;
        int porcentagemRisco = 0;
        
        System.out.println("**** CHECKUP INFLUENZA****\n");
        
        System.out.print("Informe o seu nome: ");
        nome = sc.nextLine();
        
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); 
        
        do {
            System.out.print("Seu cartão de vacina está em dia? (SIM / NAO) ");
            cartaoVacina = sc.nextLine().toUpperCase();
            respostaValida = cartaoVacina.equals("SIM") || cartaoVacina.equals("NAO");
            if (!respostaValida) {
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
            }
        } while (!respostaValida);

        
        do {
            System.out.print("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe) (SIM / NAO) ");
            sintomasRecentes = sc.nextLine().toUpperCase();
            respostaValida = sintomasRecentes.equals("SIM") || sintomasRecentes.equals("NAO");
            if (!respostaValida) {
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
                contador++;
            } else if (sintomasRecentes.equals("SIM")) {
                porcentagemRisco += 30;
            }
        } while (!respostaValida);

        do {
            System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM / NAO) ");
            contatoSintomaticos = sc.nextLine().toUpperCase();
            respostaValida = contatoSintomaticos.equals("SIM") || contatoSintomaticos.equals("NAO");
            if (!respostaValida) {
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
            } else if (contatoSintomaticos.equals("SIM")) {
                porcentagemRisco += 30;
            }
        } while (!respostaValida);
        
        do {
            System.out.print("Está retornando de viagem realizada no exterior? (SIM / NAO) ");
            viagemExterior = sc.nextLine().toUpperCase();
            respostaValida = viagemExterior.equals("SIM") || viagemExterior.equals("NAO");
            if (!respostaValida) {
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
            } else if (viagemExterior.equals("SIM")) {
                porcentagemRisco += 30;
                System.out.println("Você ficará sob observação por 05 dias.");
            }
        } while (!respostaValida);
        
        if (cartaoVacina.equals("NAO")) {
            porcentagemRisco += 10;
        }
        
        System.out.println("\n**** RESULTADO DO CHECKUP INFLUENZA ****\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão de vacina em dia? " + cartaoVacina);
        System.out.println("Teve sintomas recentemente? " + sintomasRecentes);
        System.out.println("Teve contato com pessoas infectadas? " + contatoSintomaticos);
        System.out.println("Retornando de viagem realizada no exterior? " + viagemExterior);

        System.out.println("\nProbabilidade dessa pessoa estar infectada: " + porcentagemRisco + "%");

        if (porcentagemRisco <= 30) {
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        } else if (porcentagemRisco <= 60) {
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
        } else if (porcentagemRisco >= 90) {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
        }
        
        sc.close();
    }
}
