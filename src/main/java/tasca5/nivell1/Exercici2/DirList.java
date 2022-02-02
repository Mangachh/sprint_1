package tasca5.nivell1.Exercici2;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class DirList {

    private static final String LBL_DIRECTORY = "Directory";
    private static final String LBL_FILE = "File";

    public void listTreeDirectories(final String path, int level) {
        File file = new File(path);
        String label = file.isDirectory() ? LBL_DIRECTORY : LBL_FILE;

        // imprimimos esta ruta
        System.out.println(formmater(level, file.getName(), label, file.lastModified()));

        // cargamos lo que hay en la carpeta
        String[] contents = file.list();

        // si no es null, tiramos
        if (contents != null) {
            for (int i = 0; i < contents.length; i++) {
                this.listTreeDirectories(path + File.separator + contents[i], level + 1);
            }
        }
    }

    private String formmater(int level, final String name, final String type, long modification) {
        String prefix = String.format("+%-" + String.valueOf(level * 2) + "s", "").replace(' ', '-');
        String dateFormat = new SimpleDateFormat("dd-MM-yyyy").format(new Date(modification));

        return String.format("%s- %s -> [%s]___(%s)", prefix, name, type, dateFormat);
    }
}
