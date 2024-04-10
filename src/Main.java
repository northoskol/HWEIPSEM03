import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные (Фамилия Имя Отчество Дата рождения Номер телефона Пол):");
        String input = scanner.nextLine();

        String[] inputData = input.split(" ");
        if (inputData.length != 6) {
            System.out.println("Ошибка: введено неверное количество данных.");
            return;
        }

        try {
            String lastName = inputData[0];
            String firstName = inputData[1];
            String middleName = inputData[2];
            String birthDate = inputData[3];
            long phoneNumber = Long.parseLong(inputData[4]);
            char gender = inputData[5].charAt(0);

            PersonData personData = new PersonData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
            writeToTxtFile(personData);
            System.out.println("Данные успешно записаны в файл.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат номера телефона.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Неверный формат данных.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл:");
            e.printStackTrace();
        }
    }

    public static void writeToTxtFile(PersonData personData) throws IOException {
        String fileName = personData.lastName + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(personData.lastName + " " + personData.firstName + " " + personData.middleName + " " +
                personData.birthDate + " " + personData.phoneNumber + " " + personData.gender + "\n");
        writer.close();
    }
}