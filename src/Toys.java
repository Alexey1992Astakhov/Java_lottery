public class Toys implements Toy{

    private Integer ID;
    private String name;
    private Double weight;

    public Toys(Integer ID, String name, Double weight) {
        this.ID = ID;
        this.name = name;
        this.weight = weight;
    }

    public Toys(){

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer toyID(Integer ID) {
        return ID;
    }

    @Override
    public String toyName(String name) {
        return name;
    }

    @Override
    public Double weight(Double weight) {
        return weight;
    }
}
