/**
 * 
 */
package com.bhuwan.datastructure.analysis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class FileUtils {
    public static int[] readAllInts(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        int[] array = new int[lines.size()];
        int i = 0;
        for (String line : lines) {
            array[i++] = Integer.valueOf(line.trim());
        }
        return array;
    }
}
