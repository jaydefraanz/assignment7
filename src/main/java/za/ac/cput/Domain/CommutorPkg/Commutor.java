package za.ac.cput.Domain.CommutorPkg;

import java.util.Objects;

public class Commutor {
    String name, surname, cardNo;
    int credit;

    public Commutor(){}

    public Commutor(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.cardNo = builder.cardNo;
        this.credit = builder.credit;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCardNo()
    {
        return cardNo;
    }

    public int getCredit()
    {
        return credit;
    }

    public static class Builder
    {
        String name, surname;
        int idNo;
        String cardNo;
        int credit;

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

        public Builder cardNo(String cardNo)
        {
            this.cardNo = cardNo;
            return  this;
        }
        public Builder credit(int credit)
        {
            this.credit = credit;
            return  this;
        }

        public Commutor build()
        {
            return new Commutor(this);
        }
    }

    @Override
    public String toString()
    {
        return "CommutorPkg{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNo=" + cardNo +
                ", credit=" + credit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commutor commutor = (Commutor) o;
        return cardNo.equals(commutor.cardNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNo);
    }
}
