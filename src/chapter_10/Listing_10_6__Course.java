package chapter_10;

public class Listing_10_6__Course
{
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents = 0;

	public Listing_10_6__Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName()
	{
		return this.courseName;
	}

	public void addStudent(String student)
	{
		String[] studentsTemp = new String[students.length + 1];
		System.arraycopy(students, 0, studentsTemp, 0, students.length);
		students = new String[studentsTemp.length];
		System.arraycopy(studentsTemp, 0, students, 0, studentsTemp.length);
		students[students.length - 1] = student;
		numberOfStudents++;
	}

	public void dropStudent(String student)
	{
		int whatIndexIsIt = -1;
		boolean found = false;
		for (int i = 0; i < students.length; i++)
		{
			if (students[i] == student)
			{
				whatIndexIsIt = i;
				found = true;
			}
			if(i == students.length - 1 && !found)
				System.out.println("\nWe were not able to find that student in the list\n");
		}
		String[] studentsTemp = new String[students.length];
		System.arraycopy(students, 0, studentsTemp, 0, students.length);
		if (found)
		{
			for (int i = 0; i < students.length; i++)
			{
				if (i < whatIndexIsIt)
					students[i] = studentsTemp[i];
				else if (i == whatIndexIsIt)
				{
					
				}
				else if (i > whatIndexIsIt)
				{
					students[i] = studentsTemp[i - 1];
				}
				else
					System.out.println("\nAn error happened 001\n");
			}
			numberOfStudents--;
		}
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	public int getLengthOfStudentsArray()
	{
		return students.length;
	}
}
