package herancamultipla.application;

import herancamultipla.entities.ComboDevice;
import herancamultipla.entities.Printer;
import herancamultipla.entities.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class AppTeste {

    @Test
    public void teste_1(){
        Scanner scanner = new Scanner("2003");
        Printer printer = new Printer("1080");
        ComboDevice comboDevice = new ComboDevice("2081");

        scanner.processDoc("Teste01");
        String resultado = scanner.scan();

        printer.processDoc("Teste02");
        printer.print("My Letter");

        comboDevice.processDoc("My dissertattion");
        comboDevice.print("My dissertation");
        String resultado2 = comboDevice.scan();

        String expectativa = """
                """;

        Assert.assertEquals(expectativa,resultado);
    }
}
