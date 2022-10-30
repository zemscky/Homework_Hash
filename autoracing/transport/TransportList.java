package autoracing.transport;

import java.util.HashSet;
import java.util.Set;

public class TransportList {

    private final Set<Transport> transports = new HashSet<>();

    public void add(Transport transport) {
        this.transports.add(transport);
    }

    public Transport findByTransport(String brand, String model) {
        for (Transport transport : transports) {
            if (transport.getBrand() == brand && transport.getModel() == model) {
                return transport;
            }
        }
        return null;
    }
}
