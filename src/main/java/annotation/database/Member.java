package annotation.database;

/**
 * @author 10745
 * @date 2020/3/12 21:15
 **/
@DBTable(name = "Member")
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30,
            constraints = @Constraints(primaryKey = true))
    String reference;
    static int memberCount;

    public String getReference() {
        return reference;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return reference;
    }

    public Integer getAge() {
        return age;
    }
}
