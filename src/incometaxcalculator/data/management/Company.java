package incometaxcalculator.data.management;

public class Company {

  private final String name;
  private final String country;
  private final String city;
  private final String street;
  private final int number;

  public Company(String name, String country, String city, String street, int number) {
    this.name = name;
    this.country = country;
    this.city = city;
    this.street = street;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public int getNumber() {
    return number;
  }
}

