package scoped;

import android.os.Environment;

import java.io.File;

/**
 * Util class, designed to help with handling storage issue on
 * Android >=11. Due to new restriction, shared packages could be
 * used even with {@link android.Manifest.permission#READ_EXTERNAL_STORAGE}
 */
public class StorageManager {

    public static String getDocumentsPath() {
        return Environment
                .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS)
                .getAbsolutePath();
    }

    public static File getDocumentsFile() {
        return Environment
                .getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
    }
}
