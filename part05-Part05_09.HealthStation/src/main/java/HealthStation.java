
public class HealthStation {

    private int weightingNumber;
    
    public HealthStation(){
        this.weightingNumber = 0;
    }
    
    public int weigh(Person person) {
        weightingNumber ++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return this.weightingNumber;
    }

}
