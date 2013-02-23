package demo.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DemoStepdefs {
    private List<String> list;


    @Given("^I have a List with no elements$")
    public void I_have_a_List_with_no_elements() throws Throwable {
        list = new ArrayList<String>();
    }

    @When("^I append an element \"([^\"]*)\"$")
    public void I_append_an_element(String newElement) throws Throwable {
        list.add(newElement);
    }

    @Then("^it should have (\\d+) elements$")
    public void it_should_have_element(int expectedElementCount) throws Throwable {
        assertThat(list.size(), is(1));
    }

    @Then("^that element should be \"([^\"]*)\"$")
    public void that_element_should_be(String expectedElement) throws Throwable {
        assertThat(list, contains(expectedElement));
    }
}
