package providers;

public abstract class RegisteredProvider implements Provider {
    private final String regNumber;

    public RegisteredProvider(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return "RegisteredProvider{" +
                "regNumber='" + regNumber + '\'' +
                '}';
    }
}
