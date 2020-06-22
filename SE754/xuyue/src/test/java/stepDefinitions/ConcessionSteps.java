package stepDefinitions;


import static org.junit.Assert.*;
import cucumberDemo.Concession;

public class ConcessionSteps {
	private boolean actualStatus = true;
	
	private Concession newConce = new Concession();
	
	@Given("Students basic information include ID name and age")
	public void get_stu_info(int ID, String name, int age) {
		newConce.stuID  =ID;
		newConce.stuName = name;
		newConce.age = age;
	}
	
	@And("Course's information include title requirements status")
	public void get_cource_info(String name, int ID,boolean status) {
		newConce.courseID = ID;
		newConce.courseName = name;
		newConce.status = status;
	}
	
	@When("Administrator set course's status from false to true")
	public void set_course_status(boolean status) {
		newConce.status = status;
	}
	@Then("The course's current status should be true")
	public void if_status_is_true(boolean actualStatus) {
		Assert.assertEquals(actualStatus, newConce.status);
	}

}
