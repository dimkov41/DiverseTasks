package com.company;

public class Capresse extends Pizza {

  Capresse(Pizza.Builder<?> builder) {
    super(builder);
  }

  static class Builder extends Pizza.Builder<Builder>{

    @Override
    Pizza build() {
      return new Capresse(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }
}
