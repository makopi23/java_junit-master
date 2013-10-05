package tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {
	Converter sut;
	
	@Before
	public void setUp(){
		sut = new Converter();
	}
	@Test
	public void _1をいれたら1をかえすべき() {
		Converter sut = new Converter();
		String actual = sut.convert(1);
		assertThat(actual, is("1"));
	}
	
	@Test
	public void _2をいれたら2をかえすべき() {
		Converter sut = new Converter();
		String actual = sut.convert(2);
		assertThat(actual, is("2"));
	}
	@Test
	public void _3をいれたらFizzをかえすべき() {
		Converter sut = new Converter();
		String actual = sut.convert(3);
		assertThat(actual, is("Fizz"));
	}
	@Test
	public void _5をいれたらBuzzをかえすべき() {
		Converter sut = new Converter();
		String actual = sut.convert(5);
		assertThat(actual, is("Buzz"));
	}
	@Test
	public void _15をいれたらxBuzzをかえすべき() {
		Converter sut = new Converter();
		String actual = sut.convert(15);
		assertThat(actual, is("FizzBuzz"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void _0を入れたらIllegalArgumentがthrowされるべき(){
		Converter sut = new Converter();
		String actual = sut.convert(0);
		assertThat(actual, is("0"));
	}
	
	// TODO
	
}
