package ABC;

class Encap {
	
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
}

public class DemoEncap{
	public static void main(String args[]) {
		Encap e = new Encap();
		e.setSid(1);
		e.setSname("rash");
		System.out.println(e.getSid()+ "\t" +e.getSname());
		
	}
}
