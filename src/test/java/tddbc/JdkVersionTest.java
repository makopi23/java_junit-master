package tddbc;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class JdkVersionTest {


	@Test
	public void isValidメソッドにJDK7u40が渡されたときにtrueと返すべき() {

		assertThat(JdkVersion.isValid("JDK7u40"), is(true));
	}
	@Test
	public void isValidメソッドにhogeが渡されたときにfalseと返すべき() {

		assertThat(JdkVersion.isValid("hoge"), is(false));
	}

	@Test
	public void isValidメソッドにJDK7u9xが渡されたときにfalseと返すべき() {

		assertThat(JdkVersion.isValid("JDK7u9x"), is(false));
	}

	@Test
	public void isValidメソッドにJDK7U40が渡されたときにtrueと返すべき() {

		assertThat(JdkVersion.isValid("JDK7U40"), is(true));
	}

	@Test
	public void isValidメソッドにJDK7u040が渡されたときにfalseと返すべき() {

		assertThat(JdkVersion.isValid("JDK7u040"), is(false));
	}

	@Test
	public void isValidメソッドにJDK07u40が渡されたときにfalseと返すべき() {

		assertThat(JdkVersion.isValid("JDK07u40"), is(false));
	}

	@Test
	public void isValidメソッドにJDK17u340が渡されたときにtrueと返すべき() {

		assertThat(JdkVersion.isValid("JDK17u340"), is(true));
	}

	@Test
	public void isValidメソッドにJDK7u0が渡されたときにtrueと返すべき() {

		assertThat(JdkVersion.isValid("JDK7u0"), is(true));
	}

	@Test
	public void parseメソッドにJDK7u40が渡されたときにJdkVersionのインスタンスを返すべき() {

		assertThat(JdkVersion.parse("JDK7u40"), is(instanceOf(JdkVersion.class)));
	}

	@Test
	public void parseメソッドにJDK7u40が渡されたときに返却されたインスタンスはFamilyNumberが7でupdateNumberが40を返すべき() {

		JdkVersion sut = JdkVersion.parse("JDK7u40");
		assertThat(sut.getFamilyNumber(), is(7));
		assertThat(sut.getUpdateNumber(), is(40));
	}

	@Test(expected=IllegalArgumentException.class)
	public void parseメソッドにhogeが渡されたときにIllegalArgumentExceptionを返すべき() {

		JdkVersion.parse("hoge");

	}

	@Test
	public void parseメソッドにJDK8U50が渡されたときに返却されたインスタンスはFamilyNumberが8でupdateNumberが50を返すべき() {

		JdkVersion sut = JdkVersion.parse("JDK8U50");
		assertThat(sut.getFamilyNumber(), is(8));
		assertThat(sut.getUpdateNumber(), is(50));
	}

	@Test(expected=IllegalArgumentException.class)
	public void parseメソッドにJDK7u040が渡されたときにIllegalArgumentExceptionを返すべき() {

		JdkVersion.parse("JDK7u040");

	}

	@Test
	public void JDK7u40とJDK7u51をltで比較するとtrueを返すべき() {

		JdkVersion jdk7u40 = new JdkVersion(7, 40);
		JdkVersion jdk7u51 = new JdkVersion(7, 51);
		
		// 実装途中で時間切れ

	}
}
