package autoracing.sponsor;

import java.util.HashSet;
import java.util.Set;

public class SponsorsList {
    private final Set<Sponsor> sponsors = new HashSet<>();

    public void add(Sponsor sponsor) {
        this.sponsors.add(sponsor);
    }

    public Sponsor findByName(String name) {
        for (Sponsor sponsor : sponsors) {
            if (sponsor.getName() == name) {
                return sponsor;
            }
        }
        return null;
    }
}
