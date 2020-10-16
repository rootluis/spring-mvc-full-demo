package mx.com.mejia.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SIEST12.TAB011_ALERGIA")
public class Allergy {

	@Id
	@SequenceGenerator(name = "seq_allergy", sequenceName = "ALERGIA_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "seq_allergy")
	@Column(name = "CD_ALERGIA")
	private int cdAllergy;

	@Column(name = "NB_ALERGIA")
	private String nbAllergy;
	
	public Allergy() {
		
	}

	public int getCdAllergy() {
		return cdAllergy;
	}

	public void setCdAllergy(int cdAllergy) {
		this.cdAllergy = cdAllergy;
	}

	public String getNbAllergy() {
		return nbAllergy;
	}

	public void setNbAllergy(String nbAllergy) {
		this.nbAllergy = nbAllergy;
	}

	@Override
	public String toString() {
		return "Allergy [cdAllergy=" + cdAllergy + ", nbAllergy=" + nbAllergy + "]";
	}

}
