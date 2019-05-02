package by.javatr.entity;
import java.util.Objects;
import java.util.Optional;

public class AirCompany {
    private static Integer ID;
    private Optional<String> country;

    public AirCompany() {
        this.country = Optional.ofNullable("NO_SET");
    }

    public AirCompany(String producingCountry) {
        setProducingCountry(producingCountry);
    }

    public void setProducingCountry(String producingCountry) {
        this.country = Optional.ofNullable(producingCountry);
        if (!this.country.isPresent())
            System.out.println("Warning: not a valid value (null)!" +
                    "Producing country parameter must be filled!");
    }

    public static Integer getID() {
        return ID;
    }

    public Optional<String> getProducingCountry() {
        return country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj) return false;
        AirCompany airCompany = (AirCompany)obj;
        if (getClass()!= obj.getClass()) return false;
        return Objects.equals(getProducingCountry(), airCompany.getProducingCountry());
    }

    @Override
    public int hashCode() {
        return (int) (Objects.hash(getProducingCountry()));
    }

    @Override
    public String toString() {
        return "AirCompany{" +
                "producingCountry=" + country +
                '}';
    }
}

