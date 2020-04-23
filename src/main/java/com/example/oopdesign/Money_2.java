package com.example.oopdesign;

enum Currency_2 { USD, EURO;
    public double conversionRateTo(Currency_2 target) { return 1.0; }
}

// Money exposes the fact that it stores value as a double.
// If the type of value needs to change then all calls will need to change.

// What happens when Money needs to express what currency it is?
// getValue returns a primitive that doesn't explain this.

// Exposing getters & setters (accessors and mutators) are evil and expose too much information about how objects work.
// Exposing the inner workings of objects makes code less maintainable.

// Extracting information from an object and then doing an operation on it externally leads to poorly factored solutions.
// Instead delegate the work to the object by asking it to do the operation for you.
// Objects are lazy, the Test class doesn't want to know about currency conversion.
// Test should delegate this work to Money.
// Delegation - the object that has the information does the work.

public class Money_2 {
    private Currency_2 currency;
    private double value;

    public Money_2(double value, Currency_2 currency) {
        this.value = value;
        this.currency = currency;
    }

    public boolean isGreaterThan(Money_2 op) {
        return(normalized() > op.normalized());
    }

    public double normalized() {
        return currency == Currency_2.USD
                ? value
                : value * currency.conversionRateTo(Currency_2.USD);
    }
}

class Test {

    // Stubbed out for sake of demo
    private static void dispenseFunds(Money_2 amount) { /*...*/ }

    public static void test() {
        Money_2 balance = new Money_2(1.0, Currency_2.EURO);
        Money_2 request = new Money_2(1.0, Currency_2.USD);

        // Getting the currency outside of the Money class and calculating the conversion in the Test class
        // leads to bloated and unmaintainable code.
        // It violates the Law of Demeter - balance.getCurrency().conversionRateTo()
        // Poor delegation, the Test class cares too much about Money related concerns.
        // This work should happen in the object that has the most data, Money.

        // double normalizedBalance = balance.getValue() * balance.getCurrency().conversionRateTo(Currency.USD);
        // double normalizedRequest = request.getValue() * request.getCurrency().conversionRateTo(Currency.USD);

        // The responsibility of comparing two monetary values has now been moved onto the Money class.
        // This is a reasonable expectation of the Money class as it holds the data concerned in the operation.
        // The normalization to USD is now also a implementation detail hidden behind the isGreaterThan method.
        // This is more concise and less complex.
        if(balance.isGreaterThan(request)) {
            dispenseFunds(request);
        }
    }
}
