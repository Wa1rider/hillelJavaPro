package hw15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {
    public static String decode(String text) {
        Pattern p = Pattern.compile("( без | безо | близ | в | во | вместо | вне | для | до | за | из | изо | из-за | из-под | к | ко | кроме | между | меж | на | над | надо | о | об | обо | от | ото | перед | передо | пред | предо | пo | под | подо | при | про | ради | с | со | сквозь | среди | у | через | чрез )");
        Matcher m = p.matcher(text);
        String newText = m.replaceAll((" Java "));
        return newText;
    }
}
