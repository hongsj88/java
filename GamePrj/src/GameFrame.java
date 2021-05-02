import java.awt.Frame;
import java.awt.Graphics;
/**
 * 
 * @author 이사님
 * 틀로 고쳐쓰고 싶다면 ... 
 * 뼈대를 가져다가 원하는 것을 적당히 고쳐서 쓰는 것이다.
 */
public class GameFrame extends Frame{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawRect(100, 100, 200, 100);
	}
 
	
}
