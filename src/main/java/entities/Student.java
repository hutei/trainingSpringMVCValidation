package entities;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String country;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    private String favoriteLanguage;


    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    private LinkedHashMap<String,String> countryOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("UA","Ukraine");
        countryOptions.put("US","USA");
        countryOptions.put("DE","Germany");
        countryOptions.put("UK","England");
        countryOptions.put("SWE","Sweden");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
