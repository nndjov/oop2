public class ClassLoaderTest extends JavaClassLoader {

	public static void main(String[] args) {

		JavaClassLoader jcl = new JavaClassLoader();
		jcl.pozoviMetodu("MojaKlasa", "kaziZdravo");
	}
}