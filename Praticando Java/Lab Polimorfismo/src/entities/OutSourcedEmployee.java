package entities;

/**
 * 
 * @author Caique.Batista
 *
 */
public class OutSourcedEmployee extends Employee {
	
	
	// Atributos
	
	
	private Double additionalCharge;
	
	
	// Construtores
	
	public OutSourcedEmployee() {
		super();
		
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	
	
	
	// Geters and Seters
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
	/**
	 * Método sobreposto da classe pai Employee
	 * 
	 * @return retorna valor por hora, + adicional de 110%
	 * @author Caique.Batista
	 */
	@Override
	public double payment() {
	
		return super.payment() + additionalCharge * 1.1;
		
	}

	
	

}
