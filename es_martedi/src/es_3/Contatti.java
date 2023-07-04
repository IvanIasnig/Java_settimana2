package es_3;

public class Contatti {
    String name;
    int phoneNumber;
    int id;

    public Contatti(String name, int phoneNumber, int id) {
        this.setName(name);
        this.setPhoneNumb(phoneNumber);
        this.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumb() {
        return phoneNumber;
    }

    public void setPhoneNumb(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
}
