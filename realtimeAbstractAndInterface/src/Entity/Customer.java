package Entity;

import Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity {
    public int id;
    public String firstName;
    public String lastName;
    public LocalDate DateOfBirth;
    public String NationalityId;
}
