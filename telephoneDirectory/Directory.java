package telephoneDirectory;

import java.util.HashMap;
import java.util.Map;

public class Directory {
    public static void main(String[] args) {


        Map<String, String> directory = new HashMap<>(20);
        directory.put("Pupkin S.A.", "89005553531");
        directory.put("Sidarov D.A.", "89005553532");
        directory.put("Petrov S.S.", "89005553533");
        directory.put("Simanov M.M.", "89005553534");
        directory.put("Kotov K.A.", "89005553535");
        directory.put("Rumyancev A.A.", "89005553536");
        directory.put("Grigorov S.A.", "89005553537");
        directory.put("Kiryanov S.A.", "89005553538");
        directory.put("Rybkin G.A.", "89005553539");
        directory.put("Murzov S.M.", "89005553510");
        directory.put("Loginov T.T.", "89005553511");
        directory.put("Bazukin A.A.", "89005553512");
        directory.put("Kuplinov S.A.", "89005553513");
        directory.put("Babuskin A.A.", "89005553514");
        directory.put("Lomov S.A.", "89005553515");
        directory.put("Loshkin S.A.", "89005553516");
        directory.put("Smirnov M.M.", "890055535317");
        directory.put("Mushkin S.A.", "89005553518");
        directory.put("Skullov A.A.", "89005553519");
        directory.put("Volkov S.A.", "89005553520");

        System.out.println(directory.keySet());
        System.out.println(directory.values());
    }
}
