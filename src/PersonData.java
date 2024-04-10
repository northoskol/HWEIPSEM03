import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class PersonData {
    String lastName;
    String firstName;
    String middleName;
    String birthDate;
    long phoneNumber;
    char gender;

    public PersonData(String lastName, String firstName, String middleName, String birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
}