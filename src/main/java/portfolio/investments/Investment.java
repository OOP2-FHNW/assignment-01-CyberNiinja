package portfolio.investments;

import java.util.Objects;

public abstract class Investment {
    private String title;
    private String country;
    private double singlePrice;
    private double count;

    public Investment(String title) {
        this.title = title;
        this.country = "Schweiz";
        this.count = 1.0;
        this.singlePrice = 1.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Investment Investment = (Investment) o;

        return Objects.equals(getTitle(), Investment.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    // all getters and setters according to conventions
    public String getTitle() {
        return title;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
