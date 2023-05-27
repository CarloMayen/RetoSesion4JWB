package neyam.currencies.models;


import jakarta.validation.constraints.NotBlank;

public class Currency {
    @NotBlank
    private String name;

    // Here we setup dollar US to the base (1USD) of all others currencies
    @NotBlank
    private float valuesToOne;

    public Currency() {
    }

    public Currency(String name, float valuesToOne) {
        this.name = name;
        this.valuesToOne = valuesToOne;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getValuesToOne() {
        return valuesToOne;
    }

    public void setValuesToOne(float valuesToOne) {
        this.valuesToOne = valuesToOne;
    }
}
