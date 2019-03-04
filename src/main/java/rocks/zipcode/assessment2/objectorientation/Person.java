package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;

    /**
     * @param id      - id of person
     * @param name    - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (id == null) {
            if (((Person) o).id != null) {
                return false;
            }
        }
        if (((Person) o).id == null) {
            if (id != null) {
                return false;
            }
        } else {
            if (!(id.equals(((Person) o).id))) {
                return false;
            }
        }

        if (name == null) {
            if (((Person) o).name != null) {
                return false;
            }
        }
        if (((Person) o).name == null) {
            if (name != null) {
                return false;
            }
        } else {
            if (!this.name.equals(((Person) o).name)) {
                return false;
            }
        }
        if (address == null) {
            if (((Person) o).address != null) {
                return false;
            }
        }

        if (((Person) o).address == null) {
            if (address != null) {
                return false;
            }
        } else {
            if (!(address.equals(((Person) o).address))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String personString = "Person{";
        String idString = "id=" + id + ", ";
        String nameString = "name='" + name + "', ";
        String addressString = "address=" + address.toString() + "}";
        personString += idString + nameString + addressString;
        return personString;
    }

}