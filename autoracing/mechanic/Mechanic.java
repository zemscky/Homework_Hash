package autoracing.mechanic;


import autoracing.transport.Transport;

import java.util.Objects;

public class Mechanic  {
    private final String fullName;
    private final String company;


    public Mechanic(String fullName,
                    String company
    ) {
        if (fullName == null || fullName.isBlank()
                || company == null || company.isBlank()
        ) {
            throw new IllegalArgumentException("Заполните данные полностью");
        }
        this.fullName = fullName;
        this.company = company;
    }

    public void service (Transport transport) {

    }
    public void fixTransport (Transport transport) {

    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }



    @Override
    public String toString() {
        return "Механик: " +
                " Ф.И.О: " + fullName +
                ", компания: " + company ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }
}
