package hm_3_Passport;

import java.util.Objects;

public class Passport {
    private final int number;
    private String lastName;
    private String firstName;
    private String patronymic;
    private final int birthDate;

    public Passport(int number, String lastName, String firstName, String patronymic, int birthDate) {
        this.number = number;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null || !lastName.isEmpty() || !lastName.isBlank()) {
            this.lastName = lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null || !firstName.isEmpty() || !firstName.isBlank()) {
            this.firstName = firstName;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
