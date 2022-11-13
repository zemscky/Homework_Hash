package autoracing.mechanic;

import autoracing.driver.Driver;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MechanicList {
    private final Set<Mechanic> mechanics = new HashSet<>();

    public void addMechanic(Mechanic mechanic){
        if (mechanic == null){
            return;
        }
        if(this.mechanics.contains(mechanic)) {
            throw new IllegalArgumentException();
        }else {
            this.mechanics.add(mechanic);
        }
    }

    public void removeMechanic(String name) {
        Iterator<Mechanic> mechanicIterator = this.mechanics.iterator();
        while (mechanicIterator.hasNext()){
            if (mechanicIterator.next().getFullName().equals(name)) {
                mechanicIterator.remove();
                break;
            }
        }
    }

    public Mechanic findByName(String name, String company) {
        for (Mechanic mechanic : mechanics) {
            if (mechanic.getFullName() == name && mechanic.getCompany() == company) {
                return mechanic;
            }
        }
        return null;
    }
}
