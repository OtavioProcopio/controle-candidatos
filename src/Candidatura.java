
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"OTAVIO", "NAUHANNY", "TAIS", "CLAUDIO",  "SIMONE", "lUCAS", "JOAO", "MARIA", "TOIM", "BANANA"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"OTAVIO", "NAUHANNY", "TAIS", "CLAUDIO",  "SIMONE", "lUCAS", "JOAO", "MARIA", "TOIM", "BANANA"};
        int candidatosSelecionados = 0 ;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido =  valorPretendido();
            
            System.out.println("O candidato"+ candidato + " solicitou esse valor de salario"+ salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato "+ candidato +" foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"OTAVIO", "NAUHANNY", "TAIS", "CLAUDIO",  "SIMONE", "lUCAS", "JOAO", "MARIA", "TOIM", "BANANA"};
        System.out.println("Imprimindo lista de candidatos informando o indice.");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de numero"+(i+1)+" é "+candidatos[i]);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1 ;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com Sucesso"); 
            }
        } while (continuarTentando && tentativasRealizadas < 3);
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void analisarCandidato(Double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }    
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
