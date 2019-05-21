package za.ac.cput.Domain.Driver;

import java.util.Objects;

public class DriverDetails extends DriverContact {
    String name,surname,idNo;

    public DriverDetails() {}

    public DriverDetails(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.idNo = builder.idNo;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public static class Builder
    {
        String name,surname,idNo;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }
        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }
        public Builder idNo(String idNo)
        {
            this.idNo = idNo;
            return this;
        }

        public DriverDetails build(){return new DriverDetails(this);}
    }

    @Override
    public String toString() {
        return "DriverDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNo='" + idNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverDetails that = (DriverDetails) o;
        return idNo.equals(that.idNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNo);
    }
}
