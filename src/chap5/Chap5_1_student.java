package chap5;

import java.util.Date;

public class Chap5_1_student {

	String id;
	String name;
	char gender;
	Date birth;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chap5_1_student other = (Chap5_1_student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Chap5_1_student(String id, String name, char gender, Date birth) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Chap5_1_student [id=" + id + ", name=" + name + ", gender=" + gender + ", birth=" + birth + "]";
	}
	
	
}
