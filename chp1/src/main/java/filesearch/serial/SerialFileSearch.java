package filesearch.serial;

import filesearch.Result;

import java.io.File;

public class SerialFileSearch {
    //
    public static void findFiles(File file, String filename, Result result) {
        //
        File[] contents;
        contents = file.listFiles();
        if (contents == null || contents.length == 0) {
            return;
        }
        for (File content: contents) {
            if (content.isDirectory()) {
                findFiles(content, filename, result);
            }
            else {
                if (content.getName().equals(filename)) {
                    result.setFound(true);
                    result.setPath(content.getAbsolutePath());
                    System.out.printf("Serial Search: Path: %s%n", result.getPath());
                    return;
                }
            }
            if (result.isFound()) {
                return;
            }
        }
    }
}
