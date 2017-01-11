
public class TestModel {

	public static void main(String[] args) {
		//create and display an empty model
		TestScoresModel model = new TestScoresModel();
		System.out.println(model);
		
		//display the size, current position, current student
		System.out.println(model.size());
		System.out.println(model.currentPosition());
		System.out.println(model.currentStudent());
		
		//add and display 3 students
		for (int i = 1; i <= 3; i++) {
			Student s = new Student("S" + i);
			model.add(s);
		}
		System.out.println(model);
		
		//Move to the first student and display it
		System.out.println(model.first());
		
		//move to the next and previous and display them
		System.out.println(model.next());
		System.out.println(model.previous());
		
		//move to the last and next and display them
		System.out.println(model.last());
		System.out.println(model.next());
		
		//display size, current position, and current student
		System.out.println(model.size());
		System.out.println(model.currentPosition());
		System.out.println(model.currentStudent());
		
		//replace the current student and display the model
		int[] grades = {99, 88 ,77};
		Student newStudent = new Student("Beth", grades);
		model.replace(newStudent);
		System.out.println(model);
		
		//add more students and display results
		for (int i = 6; i <= 13; i++) {
			Student s = new Student("S" + i);
			System.out.println(model.add(s));
		}
	}

}
