package za.ac.cput.Domain.Commutors;

public class Child extends Commutor
{

    //age is 6 - 17
    int age;
    double discount;

    public Child(Builder builder)
    {
        super(builder);
        age = 0;
        discount = 0.20;
    }

    public int getAge()
    {
        return age;
    }

    public double getDiscount() {
        return 0.20;
    }

    public static class Builder extends Commutor.Builder
    {
        int age;
        double discount = 0.20;

        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

        public Builder discount(double discount)
        {
            this.discount = discount;
            return this;
        }

        public Child build(){ return new Child(this);}
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", discount=" + discount +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNo=" + cardNo +
                ", credit=" + credit +
                '}';
    }
}
