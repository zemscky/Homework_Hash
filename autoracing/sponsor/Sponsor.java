package autoracing.sponsor;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private final float sponsorshipSum;

    public Sponsor(String name,
                   float sponsorshipSum) {
        if (sponsorshipSum < 0 || name == null || name.isBlank()
        ) {
            throw new IllegalArgumentException("Заполните данные полностью");
        }
        this.name = name;
        this.sponsorshipSum = sponsorshipSum;
    }

    public String getName() {
        return name;
    }

    public float getSponsorshipSum() {
        return sponsorshipSum;
    }


    @Override
    public String toString() {
        return "Спонсор: " +
                " наименование: " + name +
                ", сумма: " + sponsorshipSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Float.compare(sponsor.sponsorshipSum, sponsorshipSum) == 0 && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sponsorshipSum);
    }
}