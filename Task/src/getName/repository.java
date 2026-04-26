package getName;

public class repository {
	
	
	public Entity getRam() {
		Entity entity = new Entity();
		entity.id=111;
		entity.name="Ram";
		entity.password="Ram111";
		return entity;
	}
	public Entity getsham() {
		Entity entity = new Entity();
		entity.id=222;
		entity.name="sham";
		entity.password="sham222";
		return entity;
	}
	public Entity FindByid(int id) {
		Entity s1=getRam();
		Entity s2=getsham();
		
		if (s1.equals(s1)) {
			return s1;
		}else if (s2.equals(s2)) {
			return s2;
		}else {
			System.out.println("not exit student");
		}
		return null;
	}

}
