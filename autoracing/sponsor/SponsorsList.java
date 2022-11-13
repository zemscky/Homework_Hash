package autoracing.sponsor;

import autoracing.mechanic.Mechanic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SponsorsList {
    private final Set<Sponsor> sponsors = new HashSet<>();

    public void addSponsor(Sponsor sponsor){
        if (sponsor == null){
            return;
        }
        if(this.sponsors.contains(sponsor)) {
            throw new IllegalArgumentException();
        }else {
            this.sponsors.add(sponsor);
        }
    }

    public void removeSponsor(String name) {
        Iterator<Sponsor> sponsorIterator = this.sponsors.iterator();
        while (sponsorIterator.hasNext()){
            if (sponsorIterator.next().getName().equals(name)) {
                sponsorIterator.remove();
                break;
            }
        }
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
