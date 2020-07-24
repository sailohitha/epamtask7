package epamtask7_5;

public class
WhiteShirt extends PersonOutfitDecorator {

	Person person;

	public WhiteShirt(Person person) {
		this.person = person;
	}

	@Override
	public String getOutfits() {
		return person.getOutfits() + ", with Shirt";
	}

}