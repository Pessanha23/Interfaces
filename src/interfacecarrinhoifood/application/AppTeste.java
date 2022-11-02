package interfacecarrinhoifood.application;

import interfacecarrinhoifood.service.UberMotorista;
import interfacecarrinhoifood.service.UberPassageiro;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppTeste {

    @Test
    public void teste_1(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        UberMotorista uberMotorista = new UberMotorista(true,1000.0);
        UberPassageiro uberPassageiro = new UberPassageiro(LocalDateTime.parse("25/06/2018 10:30",fmt),LocalDateTime.parse("25/06/2018 10:35",fmt),1000.0);

        double resultado = uberPassageiro.taxa();
        double expectativa = 500.0;

        Assert.assertEquals(expectativa,resultado,0);

    }
    @Test
    public void teste_2(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        UberMotorista uberMotorista = new UberMotorista(true,1000.0);


        double resultado = uberMotorista.taxa();
        double expectativa = 500.0;

        Assert.assertEquals(expectativa,resultado,0);

    }

    @Test
    public void teste_3(){
        UberMotorista uberMotorista = new UberMotorista(true,50.0);
        uberMotorista.taxa();

    }

    @Test
    public void teste_4(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        UberPassageiro uberPassageiro = new UberPassageiro(LocalDateTime.parse("25/06/2018 10:30",fmt),100.0);

        uberPassageiro.setFinish(LocalDateTime.parse("25/06/2018 10:35",fmt));
        uberPassageiro.taxa();




    }
}
