package demo.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

/* Some examples of how to use Mockito
 *
 * The Mockito way is for test doubles be behave as either
 *  - Stubs (returning either default values or specified ones)
 *  - Spies (the actual interaction queried after execution)
 *  - Mocks (expectations set and verified)
 */

@RunWith(MockitoJUnitRunner.class)
public class MockitoDemoTest {

    @Mock private List list;


    @Test
    public void mockitoTestDoublesNeedAnExplicitVerificationStep() {
        list.add("Hello"); // void methods can't have expectations set

        Mockito.verify(list).add("Hello");
    }

    @Test
    public void byDefaultAMockHAsStubBehaviour() {
        // N.B. No expectations set
        assertThat(list.size(), is(0));
    }

    @Test
    public void mockitoUsesAFluentTypeSafeApiToSetExplicitResponses() {
        Mockito.when(list.contains("Nuts")).thenReturn(true); // Stubbed behaviour

        assertThat(list.contains("Cheese"), is(false));
        assertThat(list.contains("Nuts"), is(true));
    }

    @Test
    public void classesCanAlsoBeMocked() {
        List concreteList = Mockito.mock(ArrayList.class);

        Mockito.when(concreteList.lastIndexOf("Soup")).thenReturn(Integer.MAX_VALUE);

        assertThat(concreteList.lastIndexOf("Soup"), is(greaterThan(0)));
    }

    @Test(expected = IllegalStateException.class)
    public void mocksCanThrowExceptions() {
        Mockito.when(list.contains("Nuts")).thenThrow(new IllegalStateException("Only a test"));
        list.contains("Nuts");
    }

}
