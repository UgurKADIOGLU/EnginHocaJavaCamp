package Entities;

import Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity {
    public int id;
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String nationalityId;

}
