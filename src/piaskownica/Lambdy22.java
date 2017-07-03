/**
 * to do - dokonoczyc tutorial
 * https://www.youtube.com/watch?v=kpK2e343v48&index=9&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
 */

package piaskownica;

public class Lambdy22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lambdy22 lam = new Lambdy22();
		
		//deklaracja lambdy 
		//trzeba dodac typ dla tej funkcji - czyli interface funkcyjny - z jedna metoda
		MyLambda lambda = () ->  System.out.println("sdsdfds f sd ");

		//lambde wywo³ujemy poprzez wywolania metody z jej intefaceu
		lambda.jakasMetoda();
	}
	

}


/**
 * interface funkcyjny dla lambdy
 * zawiera tylko 1 metode
 * dzieki temu kompliator zna sygnature tej metody
 *
 */
interface MyLambda {
	void jakasMetoda ();
}