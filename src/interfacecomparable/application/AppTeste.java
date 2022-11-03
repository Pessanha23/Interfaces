package interfacecomparable.application;

import interfacecomparable.entities.Employee;
import interfacecomparable.entities.EmployeeSalary;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppTeste {

    @Test
    public void teste_1() throws IOException {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\int.txt";

        String resultado = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while(employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0],Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                resultado += emp.getName() + ", " + emp.getSalary() + '\n';
            }
        } catch (IOException e) {
            resultado = "Error:" + e.getMessage();
        }

        String expectativa = """
               Alex Black, 2450.0
               Alex Brown, 5000.0
               Alex Green, 3100.0
               Anna White, 3500.0
               Bob Grey, 3100.0
               Diega Vega, 7000.0
               Eduardo Rose, 4390.0
               João Ricardo, 50.0
               Maria Brown, 4300.0
               Marta Blue, 6100.0
               Matheus Messora, 8000.0
               Willian Red, 2900.0
                """;

        Assert.assertEquals(expectativa,resultado);
    }

    @Test
    public void teste_2() throws IOException {
        List<EmployeeSalary> list = new ArrayList<>();
        String path = "C:\\temp\\int.txt";
        String resultado = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
            while(employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new EmployeeSalary(fields[0],Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (EmployeeSalary employeeSalary : list) {
                resultado += employeeSalary.getName() + ", " + employeeSalary.getSalary() + '\n';
            }
        } catch (IOException e) {
            resultado = "Error:" + e.getMessage();
        }

        String expectativa = """
                Matheus Messora, 8000.0
                Diega Vega, 7000.0
                Marta Blue, 6100.0
                Alex Brown, 5000.0
                Eduardo Rose, 4390.0
                Maria Brown, 4300.0
                Anna White, 3500.0
                Alex Green, 3100.0
                Bob Grey, 3100.0
                Willian Red, 2900.0
                Alex Black, 2450.0
                João Ricardo, 50.0
                """;

        Assert.assertEquals(expectativa,resultado);
    }
    @Test
    public void teste_3(){
        /*
        - Nesse caso, aprendemos como inserir uma mensagem no bloco de texto, no caso adicionamos;
          a mensagem abaixo, e o programa criou um bloco de texto para isso;
        - Prestar atenção como criar;
        - Ps: pouco utilizavel esse metódo, pois ele é substituido por frameworks;
         */

        String[] lines = new String[] {"Diega Vega" ,"Joao Pe de Feijao", "Steff Histerica", "Pardal dos pardais"};

        String path = "C:\\temp\\out.txt";


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
