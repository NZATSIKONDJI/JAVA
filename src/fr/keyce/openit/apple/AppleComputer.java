//package fr.keyce.openit;
//
//public class AppleComputer extends Computer{
//	
//	public AppleComputer ( Keyboard keyboard)
//	{
//		super(keyboard);
//	}
//	
//	public void init()
//	{
//		super.setKeyboard(new Keyboard());
//		super.setMouse(new Mouse());
//	}
//}
//
//

package fr.keyce.openit.apple;
import fr.keyce.openit.Computer;

public class AppleComputer extends Computer {

@Override
public String toString() {

return "Apple : " + super.toString();
}

@Override
public String intrustionGame() {
	// TODO Auto-generated method stub
	return null;
}
}