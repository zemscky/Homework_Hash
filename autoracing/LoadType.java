package autoracing;

public enum LoadType {
    N1 (0D,3.5),
    N2 (3.5,12D),
    N3 (12D, Double.MAX_VALUE);

    private final Double loadFrom;
    private final Double loadTo;

    LoadType(Double from, Double to) {
        this.loadFrom = from;
        this.loadTo = to;
    }

    public Double getLoadFrom() {
        return loadFrom;
    }

    public Double getLoadTo() {
        return loadTo;
    }
}
