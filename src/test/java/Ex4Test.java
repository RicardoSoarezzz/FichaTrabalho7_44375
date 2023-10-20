import Ex4.Funcionario;
import Ex4.PlannerInterface;
import Ex4.Reuniao;
import Ex4.Sala;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;


public class Ex4Test {

    static PlannerInterface ex4;

    static Sala s1,s2;

    static Funcionario f1,f2;

    static Reuniao r1,r2;
    @BeforeAll
    public static void startUp(){
        ex4 = new PlannerInterface();

        s1 = new Sala("Sala 1",10);
        s2 = new Sala("Sala 2",20);


        LocalDate[] feriasF1 = new LocalDate[]{
                LocalDate.of(2023, 10, 20),  // 2023-10-20
                LocalDate.of(2023, 10, 21)   // Another date
        };

        f1 = new Funcionario("Ricardo","44375",feriasF1);

        LocalDate[] feriasF2 = new LocalDate[]{
                LocalDate.of(2023, 10, 23),  // 2023-10-20
                LocalDate.of(2023, 10, 25)   // Another date
        };

        f1 = new Funcionario("teste","2121",feriasF2);



    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 23, 311, 487, 653, 947})
    void isPrimeTest(int number){

    }

}
