package Bettle.model.bettle;

import java.util.Random;

/**
 * ���������� ��ǥ ������ �����Ѵ�.
 * @author Jeongsam
 *
 */
public class BeetleCordinate{

	//���������� ��ǥ
	private int x;
	private int y;
	
	
	/**
	 * ���������� ��ǥ ������ �ʱ�ȭ�Ѵ�.
	 * @param width {@link int}
	 * @param height {@link int}
	 */
	public BeetleCordinate(int width, int height) {
		
		//���������� �ʱ� ��ǥ�� �����ϰ� �����Ѵ�.
		x = new Random().nextInt(width);
		y = new Random().nextInt(height);
	}
	
	public void set_X_Plus() {
		

		x++;
	}
	
	public void set_X_Minus() {

		x--;
	}
	
	public void set_Y_Plus() {
		

		y++;
	}
	
	public void set_Y_Minus() {
		

		y--;
	}
	
	/**
	 * ���������� X��ǥ�� �����Ѵ�.
	 * @param x ��ǥ
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * ���������� Y��ǥ�� �����Ѵ�.
	 * @param y ��ǥ
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * ���������� ��ǥ�� �����Ѵ�.
	 * @param x ��ǥ
	 * @param y ��ǥ
	 */
	public void setCordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * ���������� X ��ǥ�� ��ȯ�Ѵ�.
	 * @return {@link int}
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * ���������� Y ��ǥ�� ��ȯ�Ѵ�.
	 * @return ({@link int}
	 */
	public int getY() {
		return y;
	}
	
}
