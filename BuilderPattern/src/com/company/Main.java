package com
        .company;

import static com.company.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
	    Pizza capresse = new Capresse.Builder()
                                .addTopping(HAM)
                                .addTopping(ONION)
                                .addTopping(MUSHROOM)
                                .build();
    }
}
