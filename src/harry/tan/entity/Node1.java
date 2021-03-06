package harry.tan.entity;

public class Node1 {
	public Node1(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}

	private String start;
	private String end;
	private int distance;
	public Node1() {
	}
	public Node1(String start, String end, int distance) {
		this.start = start;
		this.end = end;
		this.distance = distance;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		
		if(obj instanceof Node1){
			Node1 otherObj = (Node1)obj;
			if(this.start.equals(otherObj.getStart()) && this.end.equals(otherObj.getEnd())){
				return true;
			}
		}
		
		return false;
	}
}
