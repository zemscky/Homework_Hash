package autoracing.sponsor;

public class Sponsor {

    private final String name;
    private final float sponsorshipSum;
    private final boolean physical;

    public Sponsor(String name,
                   float sponsorshipSum,
                   boolean physical) {
        if (sponsorshipSum < 0 || name == null || name.isBlank()
        ) {
            throw new IllegalArgumentException("Заполните данные полностью");
        }
        this.name = name;
        this.sponsorshipSum = sponsorshipSum;
        this.physical = physical;
    }

    public String getName() {
        return name;
    }

    public float getSponsorshipSum() {
        return sponsorshipSum;
    }

    public boolean isPhysical() {
        return physical;
    }

    @Override
    public String toString() {
        return "Спонсор: " +
                " наименование: " + name +
                ", сумма: " + sponsorshipSum +
                ", тип" + physical;
    }
}