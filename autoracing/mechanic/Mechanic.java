package autoracing.mechanic;


import autoracing.transport.Transport;

public class Mechanic  {
    private final String fullName;
    private final String company;
    private final boolean fixesBusses;
    private final boolean fixesTrucks;
    private final boolean fixesCars;

    public Mechanic(String fullName,
                    String company,
                    boolean fixesBusses,
                    boolean fixesTrucks,
                    boolean fixesCars) {
        if (fullName == null || fullName.isBlank()
                || company == null || company.isBlank()
        ) {
            throw new IllegalArgumentException("Заполните данные полностью");
        }
        this.fullName = fullName;
        this.company = company;
        this.fixesBusses = fixesBusses;
        this.fixesTrucks = fixesTrucks;
        this.fixesCars = fixesCars;
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

    public boolean isFixesBusses() {
        return fixesBusses;
    }

    public boolean isFixesTrucks() {
        return fixesTrucks;
    }

    public boolean isFixesCars() {
        return fixesCars;
    }

    @Override
    public String toString() {
        return "Механик: " +
                " Ф.И.О: " + fullName +
                ", компания: " + company +
                ", работает с: " + fixesBusses +
                ", работает с: " + fixesTrucks +
                ", работает с: " + fixesCars;
    }
}
