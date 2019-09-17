package za.ac.cput.domain.commutors;

public class Adult extends Commutor
{
    //age is 18 and up
    int age;

    public Adult(Builder builder)
    {
        super(builder);
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public static class Builder extends Commutor.Builder
    {
        int age;

        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

        public Adult build() {return new Adult(this);}
    }

    @Override
    public String toString() {
        return "Adult{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNo=" + cardNo +
                ", credit=" + credit +
                '}';
    }


}
