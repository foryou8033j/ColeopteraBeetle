package Bettle.model.bettle;

import java.awt.Color;
import java.util.Random;

/**
 * ���������� �Ӽ� �� �������� �����Ѵ�.
 * @author Jeongsam
 */
public class Beetle extends BeetleCordinate {
	
	public enum Pos{UP, DOWN, LEFT, RIGHT};

	//gui �� ǥ�� �� ���������� ����
	private Color beetleColor;
	
	//���� ����
	private boolean upDirection;
	private boolean downDirection;
	private boolean leftDirection;
	private boolean rightDirection;
	
	//�� ����
	private int beetleMoveCount;
	
	//���� ũ�� ����
	private final int B_WIDTH;
	private final int B_HEIGHT;
	
	/**
	 * ���� ������ �Ӽ��� �ʱ�ȭ�Ѵ�.
	 * @param color	GUI �� ǥ�� �� ���������� ����
	 * @param mapWidth ���� ���� ũ��
	 * @param mapHeight ���� ���� ũ��
	 */
	public Beetle(Color color, int mapWidth, int mapHeight) {
		
		super(mapWidth, mapHeight);
		
		if(color == null)
			this.beetleColor = Color.RED;
		else
			this.beetleColor = color;
		
		this.B_WIDTH = mapWidth;
		this.B_HEIGHT = mapHeight;

		
		
		beetleMoveCount = 0;
		
		//�ʱ� ���������� ������ �����Ѵ�.
		makeDirection();
	}
	
	/**
	 * ���������� ������ ��ȯ�Ѵ�.
	 * @return {@link Color}
	 */
	public Color getBeetleColor() {
		return beetleColor;
	}
	
	
	
	/**
	 * �湮 Ƚ�� ī��Ʈ�� ������Ų��.
	 */
	public void addMoveCount() {
		beetleMoveCount++;
	}
	
	/**
	 * �湮 Ƚ�� ī��Ʈ�� ��ȯ�޴´�.
	 * @return {@link int}
	 */
	public int getMoveCount() {
		return beetleMoveCount; 
	}
	
	/**
	 * ���������� ������ ������ �����ϰ� �����Ѵ�.
	 */
	public void makeDirection() {
		
		//���⿡ ���� �˰����� ���� �Ǿ���Ѵ�.
		int randNum = new Random().nextInt(8);
		
		switch(randNum) {
		case 0:
			upDirection = false;
			downDirection = false;
			leftDirection = true;
			rightDirection = false;
			break;
		case 1:
			upDirection = false;
			downDirection = false;
			leftDirection = false;
			rightDirection = true;
			break;
		case 2:
			upDirection = true;
			downDirection = false;
			leftDirection = false;
			rightDirection = false;
			break;
		case 3:
			upDirection = false;
			downDirection = true;
			leftDirection = false;
			rightDirection = false;
			break;
		case 4:
			upDirection = true;
			downDirection = false;
			leftDirection = true;
			rightDirection = false;
			break;
		case 5:
			upDirection = true;
			downDirection = false;
			leftDirection = false;
			rightDirection = true;
			break;
		case 6:
			upDirection = false;
			downDirection = true;
			leftDirection = true;
			rightDirection = false;
			break;
		case 7:
			upDirection = false;
			downDirection = true;
			leftDirection = false;
			rightDirection = true;
			break;
		}
	}
	
	/**
	 * ���������� �̵��� ����� �Բ� ������ ������ �����Ѵ�.
	 * @param pos ������ �̵��� ����
	 */
	public void makeDirection(Pos pos) {
		
		upDirection = false;
		downDirection = false;
		leftDirection = false;
		rightDirection = false;
		
		switch (pos) {
			case UP:
				upDirection = true;
				break;
				
			case DOWN:
				downDirection = true;
				break;
				
			case LEFT:
				leftDirection = true;
				break;
				
			case RIGHT:
				rightDirection = true;
				break;
		}
		
	}
	
	
	/**
	 * ������ ���� ������ ��ȯ�Ѵ�.
	 * @return {@link boolean[]<br><br>}
	 * {@code boolean[] = {upDirectiom, downDirection, leftDirection, rightDirection }
	 */
	public boolean isDirection(Pos pos) {
		
		if(pos == Pos.UP)
			return upDirection;
		if(pos == Pos.DOWN)
			return downDirection;
		if(pos == Pos.LEFT)
			return leftDirection;
		if(pos == Pos.RIGHT)
			return rightDirection;
		
		return false;
	}

}
