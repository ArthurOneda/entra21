package exercicio2;

public class AlunoFURB extends Aluno{
	private char wayEnter;
	private String course;
	private String atlethic;
	public AlunoFURB(String name, int age, char wayEnter, String course, String atlethic) {
		super(name, age);
		setWayEnter(wayEnter);
		setCourse(course);
		setAtlethic(atlethic);
	}
	public char getWayEnter() {
		return wayEnter;
	}
	public void setWayEnter(char wayEnter) {
		this.wayEnter = wayEnter;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAtlethic() {
		return atlethic;
	}
	public void setAtlethic(String atlethic) {
		this.atlethic = atlethic;
	}
	public void stop() {
		course = null;
	}
	@Override
	public String toString() {
		return super.toString() + ", Way Got in: " + wayEnter + ", Course: " + course + ", Atlethic = " + atlethic;
	}
}
