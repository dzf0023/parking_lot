public abstract class Vehicle{

	protected String name;    // use protected not private for directed use in car/mobobike/bus class
	protected String plateNo;
	private final VehicleType type;

	public Vehicle(VehicleType type){
		this.type = type;
	}

}