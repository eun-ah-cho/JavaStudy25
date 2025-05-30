package marioKart.dto;


public class CharacterDTO {
	
	//필드 
	public String name;
    public double speed;
    public double acceleration;
    public double weight;
    public double handling;
    public double traction;


public CharacterDTO() {
	
	
}

public CharacterDTO(String name, double speed, double acceleration,double weight,double handling, double traction) {
	
	this.name = name;
	this.speed = speed;
	this.acceleration =  acceleration;
	this.weight = weight;
	this.handling = handling;
	this.traction = traction;
}


}
