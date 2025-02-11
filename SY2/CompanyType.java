package SY2;

public enum CompanyType {
    COOPERATIVE("Cooperative"),
    COMMERCIAL("Commercial");

    private final String value;

    CompanyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}