package epamtask7_5;

public class BlackPant extends PersonOutfitDecorator {
	Person person;

	public BlackPant(Person person) {
		this.person = person;
	}

	@Override
	public String getOutfits() {
		return person.getOutfits() + ", with Black pant";
	}

}