package entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {


    @NotNull(message = "is required")
    @Size(min = 2, message = "must contains min 2 char")
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 2, message = "must contains min 2 char")
    private String lastName;

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
