package org.example.files;

import java.io.File;
import java.io.FileFilter;

public class Filter {

        File[] files= new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
        public boolean isHidden(File file){
            return file.isHidden();
        }


}
