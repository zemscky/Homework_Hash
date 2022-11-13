package autoracing;

public enum CapacityType {
    ESPECIALLY_SMALL (1,10),
    SMALL (10,25),
    AVERAGE (40,50),
    BIG (60,80),
    ESPECIALLY_BIG (100,120);

    private final int capacityFrom;
    private final int capacityTo;

    CapacityType(int from, int to) {
        this.capacityFrom = from;
        this.capacityTo = to;
    }

    public int getCapacityFrom() {
        return capacityFrom;
    }

    public int getCapacityTo() {
        return capacityTo;
    }

}
