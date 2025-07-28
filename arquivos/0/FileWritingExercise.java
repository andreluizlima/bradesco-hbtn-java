import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


    // implemente o codigo aqui
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Solicita o conteúdo a ser escrito no arquivo
            System.out.print("Digite o conteúdo a ser escrito no arquivo('sair' para finalizar): ");
            String fileContent = scanner.nextLine();

            while (!fileContent.equalsIgnoreCase("sair")) {
                bufferedWriter.write(fileContent + '\n');
                System.out.print("Digite o conteúdo a ser escrito no arquivo('sair' para finalizar): ");
                fileContent = scanner.nextLine();
            }

            bufferedWriter.close();

            System.out.println("Arquivo criado com sucesso: " + fileName);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
