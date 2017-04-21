package nomadconnection_coding;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class QuestingTest {
	/**
	 * 1�� ���� ���� ���ϵǴ��� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest2Test1() {
		assertEquals(1, Questing.quest1(2));
	}

	/**
	 *  0�� ���� ���� ���ϵǴ��� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest2Test2()  {
		assertEquals(0, Questing.quest1(0.97));
	}

	/**
	 * 7�� ���� ���� ���ϵǴ��� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest2Test3()  {
		assertEquals(7, Questing.quest1(14.64));
	}

	/**
	 * 800�� ���� ���� ���ϵǴ��� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest2Test4()  {
		assertEquals(800, Questing.quest1(1600.20));
	}

	/**
	 * 40�� ���� ���� ���ϵǴ��� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest2Test5()  {
		assertEquals(40, Questing.quest1(80));
	}

	/**
	 * True �� ���������� ���ϵǴ����� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest1Test1() {
		final String bracket = "({}[])";
		assertEquals(true, Questing.quest2(bracket));
	}

	/**
	 * False �� ���������� ���ϵǴ����� �׽�Ʈ �մϴ�
	 */
	@Test
	public void quest1Test2() {
		final String bracket = "({[}])";
		assertEquals(false, Questing.quest2(bracket));
	}

}