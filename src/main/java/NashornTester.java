import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.InputStream;
import java.io.InputStreamReader;

public class NashornTester {
	public static void main(String params[]) {

		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			ClassLoader classLoader = NashornTester.class.getClassLoader();
			InputStream stream = classLoader.getResourceAsStream("script.js");
			InputStreamReader reader = new InputStreamReader(stream);
			engine.eval(reader);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
