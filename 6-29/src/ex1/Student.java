package ex1;


@SuppressWarnings("rawtypes")
public class Student implements Comparable {
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name  + score ;
	}

	public int compareTo(Object o) {
	    if (score > ((Student) o).getScore()) {
	        return -1;
	    } else if (score < ((Student) o).getScore()) {
	        return 1;
	    } else {
	        return 0;
	    }
	}


}
