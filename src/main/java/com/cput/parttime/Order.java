package com.cput.parttime;

import java.util.Objects;

public class Order {
    private String id;
    private String meal;
    private String drink;
    private String source;

    private Order() {
    }

    public String getId() {
        return id;
    }

    public String getMeal() {
        return meal;
    }

    public String getDrink() {
        return drink;
    }

    public String getSource() {
        return source;
    }

    public Order(Builder builder) {
        this.id = builder.id;
        this.drink = builder.drink;
        this.meal = builder.meal;
        this.source = builder.source;
    }

    public static class Builder {
        private String id;
        private String meal;
        private String drink;
        private String source;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder meal(String value) {
            this.meal = value;
            return this;
        }

        public Builder drink(String value) {
            this.drink = value;
            return this;
        }

        public Builder source(String value) {
            this.source = value;
            return this;
        }

        public Order build(){
            return new Order(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                '}';
    }
}
