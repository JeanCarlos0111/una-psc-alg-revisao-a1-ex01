import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cartaoVacina, sintomasRecentes, contatoSintomaticos, viagemExterior;
        int idade;
        int contador = 0;
        int porcentagemRisco = 0;
        
        System.out.println("**** CHECKUP INFLUENZA****\n");
        
        System.out.print("Informe o seu nome: ");
        nome = sc.nextLine();
        
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); 
        
            System.out.print("Seu cartão de vacina está em dia? (SIM / NAO) ");
            cartaoVacina = sc.nextLine().toUpperCase();
            while (!(cartaoVacina.equals("SIM")) && !(cartaoVacina.equals("NAO"))){
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
                cartaoVacina = sc.nextLine().toUpperCase();
                contador++;
                if (contador >= 3){
                    System.out.println("Não foi possível realizar o diagnostico.\nGentileza procurar ajuda médica caso apareça algum sintoma.\n");
                    System.exit(0);
                }
            }
            if(cartaoVacina.equals("NAO")){
                porcentagemRisco += 10;
            }
            System.out.println(porcentagemRisco);
            contador = 0;
            System.out.print("Teve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe) (SIM / NAO) ");
            sintomasRecentes = sc.nextLine().toUpperCase();
            while (!(sintomasRecentes.equals("SIM")) && !(sintomasRecentes.equals("NAO"))){
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
                sintomasRecentes = sc.nextLine().toUpperCase();
                contador++;
                if (contador >= 3){
                    System.out.println("Não foi possível realizar o diagnostico.\nGentileza procurar ajuda médica caso apareça algum sintoma.\n");
                    System.exit(0);
                }
            }
            if(sintomasRecentes.equals("SIM")) {
                porcentagemRisco += 30;
            }
            System.out.println(porcentagemRisco);
            contador = 0;
            System.out.print("Teve contato com pessoas com sintomas gripais nos últimos dias? (SIM / NAO) ");
            contatoSintomaticos = sc.nextLine().toUpperCase();
            while (!(contatoSintomaticos.equals("SIM")) && !(contatoSintomaticos.equals("NAO"))){
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
                contatoSintomaticos = sc.nextLine().toUpperCase();
                contador++;
                if (contador >= 3){
                    System.out.println("Não foi possível realizar o diagnostico.\nGentileza procurar ajuda médica caso apareça algum sintoma.\n");
                    System.exit(0);
                }
            }
            if (contatoSintomaticos.equals("SIM")){
                porcentagemRisco += 30;
            }
            System.out.println(porcentagemRisco);    
            contador = 0;
            System.out.print("Está retornando de viagem realizada no exterior? (SIM / NAO) ");
            viagemExterior = sc.nextLine().toUpperCase();
            while (!(viagemExterior.equals("SIM")) && !(viagemExterior.equals("NAO"))){
                System.out.println("Resposta inválida. Por favor, insira SIM ou NAO.");
                viagemExterior = sc.nextLine().toUpperCase();
                contador++;
                if (contador >= 3){
                    System.out.println("Não foi possível realizar o diagnostico.\nGentileza procurar ajuda médica caso apareça algum sintoma.\n");
                    System.exit(0);
                }
            }
            if(viagemExterior.equals("SIM")){
                porcentagemRisco += 30;
            }
            System.out.println(porcentagemRisco);
        System.out.println("\n**** RESULTADO DO CHECKUP INFLUENZA ****\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cartão de vacina em dia? " + cartaoVacina);
        System.out.println("Teve sintomas recentemente? " + sintomasRecentes);
        System.out.println("Teve contato com pessoas infectadas? " + contatoSintomaticos);
        System.out.println("Retornando de viagem realizada no exterior? " + viagemExterior);

        System.out.println("\nA probabilidade de você estar infectado(a) é: " + porcentagemRisco + "%");

        if (porcentagemRisco <= 30) {
            System.out.println("Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
        } else if (porcentagemRisco <= 60) {
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 2 dias para ser acompanhado.");
        } else if (porcentagemRisco >= 60){
            System.out.println("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 2 dias para ser acompanhado.");
        }else if (porcentagemRisco >= 90) {
            System.out.println("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
        }
        
        sc.close();
    }
}
