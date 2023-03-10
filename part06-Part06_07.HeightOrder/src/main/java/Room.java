
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class Room {
    
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        // to be optimized later
        
        /*
        Person shortestPerson = this.list.get(0); 
        int shortest = shortestPerson.getHeight();
        */
        
        if (list.size() == 0) {
            return null;
        }
        
        int shortest = 300;
        Person shortestPerson = new Person("helper", 300);
        
        for (Person person: this.list) {
            if (person.getHeight() < shortest) {
                shortest = person.getHeight();
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        if (list.size() == 0) {
            return null;
        }
        Person taken = shortest();
        list.remove(taken);
        return taken;
    }
    
}
