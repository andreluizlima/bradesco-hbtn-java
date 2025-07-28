import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFileReader {

    public static void main(String[] args) {
        String arquivo = "funcionarios.csv";
        List<Funcionario> data = lerCsv(arquivo);
        for (Funcionario funcionario : data) {
            System.out.printf("Funcionário: %s\nIdade: %s\nDepartamento: %s\nSalarial: %s\n------------------------\n", funcionario.getNome(), funcionario.getIdade(), funcionario.getDepartamento(), funcionario.getSalarial());
        }
        System.out.println("Leitura do arquivo concluída.");
    }

    private static List<Funcionario> lerCsv(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            List<Funcionario> dados = new ArrayList<>();
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                if (valores.length == 4) {
                    Funcionario funcionario = new Funcionario(valores[0], valores[1], valores[2], valores[3]);
                    dados.add(funcionario);
                }
            }
            return dados;
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
