package mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import mockito.App;
import mockito.Calulate;

public class AppTest {
	
//	@Mock
//	Calulate calulateMoke;
	
	@Test
	public void testCheck() {
	Calulate calulateMoke = Mockito.mock(Calulate.class);
 
 
		App application = new App();
		application.setCalculation(calulateMoke);
 
		//Mockito.when(calulateMoke.sum(2, 12)).thenReturn(14);
		Mockito.when(calulateMoke.sum(Mockito.any(Integer.class), Mockito.any(Integer.class))).thenAnswer(i->{
			return 24;
		});
 
		int a = 2;
		int b = 22;
 
		boolean c = application.check(a, b);
 
		assertEquals(true, c);
	}
}
