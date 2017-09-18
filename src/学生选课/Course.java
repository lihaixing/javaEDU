package Ñ§ÉúÑ¡¿Î;

public class Course {
	public String id;
	public String name;

	public Course() {

	}
	public Course(String id, String name) {
		this.id=id;
		this.name=name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
