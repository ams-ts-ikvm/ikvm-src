package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_sv extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\nF\u00F6ljande alternativ \u00E4r specifika f\u00F6r Mac OS X:\n    -XstartOnFirstThread\n                      k\u00F6r huvudmetoden() p\u00E5 den f\u00F6rsta (AppKit) tr\u00E5den\n    -Xdock:name=<application name>\"\n                      \u00E5sidosatt standardapplikationsnamn visas i docka\n    -Xdock:icon=<path to icon file>\n                      \u00E5sidosatt standardikon visas i docka\n\n" },
            { "java.launcher.X.usage", "    -Xmixed           k\u00F6rning i blandat l\u00E4ge (standard)\n    -Xint             endast k\u00F6rning i tolkat l\u00E4ge\n    -Xbootclasspath:<kataloger och zip-/jar-filer avgr\u00E4nsas med {0}>\n                      ange s\u00F6kv\u00E4g f\u00F6r programladdningsklasser och -resurser\n    -Xbootclasspath/a:<kataloger och zip-/jar-filer avgr\u00E4nsas med {0}>\n                      l\u00E4gg till i slutet av programladdningsklassens s\u00F6kv\u00E4g\n    -Xbootclasspath/p:<kataloger och zip-/jar-filer avgr\u00E4nsas med {0}>\n                      l\u00E4gg till i b\u00F6rjan av programladdningsklassens s\u00F6kv\u00E4g\n    -Xdiag            visa ytterligare diagnostiska meddelanden\n    -Xnoclassgc       avaktivera klassens skr\u00E4pinsamling\n    -Xincgc           aktivera inkrementell skr\u00E4pinsamling\n    -Xloggc:<fil>    logga GC-status till en fil med tidsst\u00E4mplar\n    -Xbatch           avaktivera bakgrundskompilering\n    -Xms<storlek>        ange ursprunglig storlek f\u00F6r Java-heap\n    -Xmx<storlek>        ange maximal storlek f\u00F6r Java-heap\n    -Xss<storlek>        ange storlek f\u00F6r java-tr\u00E5dsstack\n    -Xprof            utdata f\u00F6r processorprofilering\n    -Xfuture          aktivera str\u00E4ngaste kontroller, f\u00F6rv\u00E4ntad framtida standard\n    -Xrs              minska OS-signalanv\u00E4ndning av Java/VM (se dokumentation)\n    -Xcheck:jni       utf\u00F6r ytterligare kontroller f\u00F6r JNI-funktioner\n    -Xshare:off       anv\u00E4nd inte delade klassdata\n    -Xshare:auto      anv\u00E4nd delade klassdata om det g\u00E5r (standard)\n    -Xshare:on        kr\u00E4v att delade klassdata anv\u00E4nds, annars slutf\u00F6r inte.\n    -XshowSettings    visa alla inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:all\n                      visa alla inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:vm visa alla vm-relaterade inst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:properties\n                      visa alla egenskapsinst\u00E4llningar och forts\u00E4tt\n    -XshowSettings:locale\n                      visa alla spr\u00E5krelaterade inst\u00E4llningar och forts\u00E4tt\n\n-X-alternativen \u00E4r inte standard och kan \u00E4ndras utan f\u00F6reg\u00E5ende meddelande.\n" },
            { "java.launcher.cls.error1", "Fel: Hittar inte eller kan inte ladda huvudklassen {0}" },
            { "java.launcher.cls.error2", "Fel: Huvudmetoden \u00E4r inte {0} i klassen {1}, definiera huvudmetoden som:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Fel: Huvudmetoden m\u00E5ste returnera ett v\u00E4rde av typen void i klassen {0}, \ndefiniera huvudmetoden som:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Fel: Huvudmetoden finns inte i klassen {0}, definiera huvudmetoden som:\n   public static void main(String[] args)\neller s\u00E5 m\u00E5ste en JavaFX-applikationsklass ut\u00F6ka {1}" },
            { "java.launcher.cls.error5", "Fel: JavaFX-k\u00F6rningskomponenter saknas, och de kr\u00E4vs f\u00F6r att kunna k\u00F6ra den h\u00E4r applikationen" },
            { "java.launcher.ergo.message1", "                  Standard-VM \u00E4r {0}" },
            { "java.launcher.ergo.message2", "                  eftersom du k\u00F6r en serverklassmaskin.\n" },
            { "java.launcher.init.error", "initieringsfel" },
            { "java.launcher.jar.error1", "Fel: Ett ov\u00E4ntat fel intr\u00E4ffade n\u00E4r filen {0} skulle \u00F6ppnas" },
            { "java.launcher.jar.error2", "manifest finns inte i {0}" },
            { "java.launcher.jar.error3", "inget huvudmanifestattribut i {0}" },
            { "java.launcher.javafx.error1", "Fel: JavaFX launchApplication-metoden har fel signatur, den \nm\u00E5ste ha deklarerats som statisk och returnera ett v\u00E4rde av typen void" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  anv\u00E4nd en {0}-bitsdatamodell om det finns\n" },
            { "java.launcher.opt.footer", "    -cp <klass\u00F6kv\u00E4g f\u00F6r kataloger och zip-/jar-filer>\n    -classpath <klass\u00F6kv\u00E4g f\u00F6r kataloger och zip-/jar-filer>\n                  En {0}-separerad lista med kataloger, JAR-arkiv,\n                  och ZIP-arkiv f\u00F6r s\u00F6kning efter klassfiler.\n    -D<name>=<value>\n                  ange en systemegenskap\n    -verbose:[class|gc|jni]\n                  aktivera utf\u00F6rliga utdata\n    -version      skriv ut produktversionen och avsluta\n    -version:<value>\n                  beg\u00E4r den specifika versionen som ska k\u00F6ras\n    -showversion  skriv ut produktversionen och forts\u00E4tt\n    -jre-restrict-search | -no-jre-restrict-search\n                  inkludera/exkludera anv\u00E4ndarprivata JRE:er i versions\u00F6kningen\n    -? -help      skriv ut det h\u00E4r hj\u00E4lpmeddelandet\n    -X            skriv ut hj\u00E4lp f\u00F6r icke-standardalternativ\n    -ea[:<packagename>...|:<classname>]\n    -enableassertions[:<packagename>...|:<classname>]\n                  aktivera verifiering med angiven detaljgrad\n    -da[:<packagename>...|:<classname>]\n    -disableassertions[:<packagename>...|:<classname>]\n                  avaktivera verifiering med angiven detaljgrad\n    -esa | -enablesystemassertions\n                  aktivera systemverifieringar\n    -dsa | -disablesystemassertions\n                  avaktivera systemverifieringar\n    -agentlib:<libname>[=<options>]\n                  ladda ursprungligt agentbibliotek <libname>, e.g. -agentlib:hprof\n                  se \u00E4ven -agentlib:jdwp=help och -agentlib:hprof=help\n    -agentpath:<pathname>[=<options>]\n                  ladda ursprungligt agentbibliotek med helt s\u00F6kv\u00E4gsnamn\n    -javaagent:<jarpath>[=<options>]\n                  ladda Java-programspr\u00E5ksagent, se java.lang.instrument\n    -splash:<imagepath>\n                  visa v\u00E4lkomstsk\u00E4rm med angiven bild\nMer information finns p\u00E5 http://www.oracle.com/technetwork/java/javase/documentation/index.html." },
            { "java.launcher.opt.header", "Syntax: {0} [-alternativ] class [argument...]\n           (f\u00F6r att k\u00F6ra en klass)\n   eller  {0} [-alternativ] -jar jarfile [argument...]\n           (f\u00F6r att k\u00F6ra en jar-fil)\nd\u00E4r alternativen omfattar:\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u00E4r en synonym f\u00F6r \"{1}\" VM  [inaktuell]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  f\u00F6r att v\u00E4lja \"{1}\" VM\n" },
        };
    }
}
