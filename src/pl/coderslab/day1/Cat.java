package pl.coderslab.day1;

public class Cat {

    public Owner owner;


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public Cat(Owner owner, long id, String name, int legs) {
        this.owner = owner;
        this.id = id;
        this.name = name;
        this.legs = legs;
    }

    public Cat(Owner owner, long id, String name) {
        this.owner = owner;
        this.id = id;
        this.name = name;
    }

    public Cat(Owner owner, long id) {
        this.owner = owner;
        this.id = id;
    }

    public Cat(Owner owner) {
        this.owner = owner;

    }

    public Cat() {

    }

    private long id;

    private String name;
    private int legs;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
