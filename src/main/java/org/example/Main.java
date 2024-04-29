package org.example;


class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                '}';
    }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    static class Builder {
        private String size = "Large";
        private boolean cheese = false;
        private boolean pepperoni = true;
        private boolean mushrooms = true;

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


}

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .size("Medium")
                .cheese(false)
                .pepperoni(false)
                .build();
        System.out.println(pizza);
    }
}

