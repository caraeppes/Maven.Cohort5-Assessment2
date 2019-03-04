package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable{

    private List<Ageable> ageables;

    public Shelter() {
        this.ageables = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return ageables.size();
    }

    public void add(Object object) {
        if(object instanceof Ageable){
            ageables.add((Ageable)object);
        }
    }

    public Boolean contains(Object object) {
        return ageables.contains((Ageable) object);
    }

    public void remove(Object object) {
        ageables.remove((Ageable)object);
    }

    public Object get(Integer index) {
        return ageables.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return ageables.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}