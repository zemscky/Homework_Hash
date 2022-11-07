package pasport;

import product.RecipeAlreadyExistsException;

import java.util.HashSet;
import java.util.Set;

public class PassportList {

    private final Set<Passport> passports = new HashSet<>();

    public void addOrUpdatePassport(Passport passport) throws PassportAlreadyExistsException {
        if (this.passports.contains(passport)) {
            throw new PassportAlreadyExistsException("Паспорт с такими данными уже есть");
        } else {
            this.passports.add(passport);
        }
    }

    public Passport findByNumber(int number) {
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }
}
