package Ex4;

import java.time.LocalDate;
import java.util.Arrays;
import java.time.LocalDate;

public class PlannerInterface {

    int i = 0;
    static Reuniao[] reuniao;


    public static void main(String[] args) {
        PlannerInterface planner = new PlannerInterface();

        Sala s1 = new Sala("Sala 1",20);

        LocalDate[] feriasF1 = new LocalDate[]{
                LocalDate.of(2023, 10, 20),  // 2023-10-20
                LocalDate.of(2023, 10, 21)   // Another date
        };

        Funcionario f1 = new Funcionario("Ricardo","44375",feriasF1);

        LocalDate ld1 = LocalDate.of(2023, 10, 26);
        LocalDate ld2 = LocalDate.of(2023, 10, 22);
        LocalDate ld3 = LocalDate.of(2023, 10, 30);

        planner.agendarReuniao(ld1,s1,"reuniao 1");
        planner.agendarReuniao(ld2,s1,"reuniao 2");

        planner.marcarFerias(f1,ld3);

        planner.verificarSala(s1,ld2);

        planner.verificarFuncionario(f1,ld2);

        planner.imprimirSala(s1);

        planner.imprimirFuncionario(f1);

    }



    public void agendarReuniao(LocalDate date,Sala sala,String tema){
        i++;
        reuniao[i] = new Reuniao(date,sala,tema);

    }

    public void marcarFerias(Funcionario funcionario, LocalDate date){
        funcionario.marcarFerias(date);
    }

    public boolean verificarSala(Sala sala, LocalDate date){
        for (int i = 0; i< reuniao.length;i++){
            if (reuniao[i].getSala()==sala && reuniao[i].getData()==date){
                return true;
            }
        }
        return false;
    }

    public boolean verificarFuncionario(Funcionario funcionario, LocalDate dateToCheck) {
        LocalDate[] ferias = funcionario.getFerias();

        for (LocalDate feriasDate : ferias) {
            if (feriasDate.equals(dateToCheck)) {
                return true;
            }
        }

        return false;
    }

    public void imprimirSala(Sala sala){
        for(int i = 0; i<reuniao.length;i++){
            if(reuniao[i].getSala()==sala){
                System.out.println("\nDate: "+reuniao[i].getData()+" | Theme: "+reuniao[i].getTema());
            }
        }
    }

    public void imprimirFuncionario(Funcionario funcionario){
            System.out.println("\nNome: "+funcionario.getNome()+"\nFerias: "+ Arrays.toString(funcionario.getFerias()));
    }
}
