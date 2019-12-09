package com.example.firstnavigationapp.classes;

public class SimpleInterest {
    private Double principal;
    private Double time;
    private Double rate;

    public SimpleInterest(Double principal, Double time, Double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public Double getPrincipal() {
        return principal;
    }

    public Double getTime() {
        return time;
    }

    public Double getRate() {
        return rate;
    }

    public Double calculateSimpleInterest() {
        return (this.principal * this.time * this.rate) / 100.0d;
    }
}
