import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JavaClassLoader extends ClassLoader {
	public void pozoviMetodu(String imeKlase, String imeMetode){
		try {
			ClassLoader cl = this.getClass().getClassLoader();

			// Ucitava se klasa pomocu imena
	        Class mojaKlasa = cl.loadClass(imeKlase);
	        System.out.println("Ucitana klasa: " + mojaKlasa.getName());

	        // Pravi se nova instanca...
	        Constructor konstruktor = mojaKlasa.getConstructor();
	        Object mojaKlasaObjekat = konstruktor.newInstance();

	        // Pristup metodi...
	        Method metoda = mojaKlasa.getMethod(imeMetode);
	        System.out.println("Pozvana metoda: " + metoda.getName());
	        metoda.invoke(mojaKlasaObjekat);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}