package za.ac.cput.Domain.Driver;

public class DriverContact
{
    String phone,email,address;

    public DriverContact() {
    }

    public DriverContact(Builder builder) {
        this.phone = builder.phone;
        this.email = builder.email;
        this.address = builder.address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        String phone, email, address;

        public Builder phone(String phone)
        {
            this.phone = phone;
            return this;
        }
        public Builder email(String email)
        {
            this.email = email;
            return this;
        }
        public Builder address(String address)
        {
            this.address = address;
            return this;
        }

        public DriverContact builder(){return new DriverContact(this);}
    }

    @Override
    public String toString() {
        return "DriverContact{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
