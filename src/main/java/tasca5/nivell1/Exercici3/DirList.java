package tasca5.nivell1.Exercici3;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.io.PrintStream;

public class DirList {

    private static final String LBL_DIRECTORY = "Directory";
    private static final String LBL_FILE = "File";

    public ArrayList<String> listTreeDirectories(final String path, int level) {
        File file = new File(path);
        String label = file.isDirectory() ? LBL_DIRECTORY : LBL_FILE;
        ArrayList<String> data = new ArrayList<>();

        // pillamos ruta
        data.add(formmater(level, file.getName(), label, file.lastModified()));
        //System.out.println();

        // cargamos lo que hay en la carpeta
        String[] contents = file.list();

        // si no es null, tiramos

        if (contents != null) {
            for (int i = 0; i < contents.length; i++) {
                data.addAll(this.listTreeDirectories(path + File.separator + contents[i], level + 1));
            }
        }

        return data;
    }

    private String formmater(int level, final String name, final String type, long modification) {
        String prefix = String.format("+%-" + String.valueOf(level * 2) + "s", "").replace(' ', '-');
        String dateFormat = new SimpleDateFormat("dd-MM-yyyy").format(new Date(modification));

        return String.format("%s- %s -> [%s]___(%s)", prefix, name, type, dateFormat);
    }

    public void saveListToTxt(final ArrayList<String> data, final String path) {
        File f = new File(path);
        try {
            f.createNewFile();
            PrintStream saver = new PrintStream(f);
            for (int i = 0; i < data.size(); i++) {
                saver.println(data.get(i));
            }
            saver.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
