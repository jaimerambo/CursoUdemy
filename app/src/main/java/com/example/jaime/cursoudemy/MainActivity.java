package com.example.jaime.cursoudemy;

import android.database.Cursor;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private  void generarExcel(Cursor cursor){
        final String fileName="alguito.xls";
        File sdcard= Environment.getDataDirectory();
        //se cra una variable director
        File directory=new File(sdcard.getAbsolutePath()+"/descargas");

        ///se crea el directorio si no exiate
        if (!directory.isDirectory()) {
            directory.mkdirs();
        }

        File file=new File(directory,fileName);

        Workbook wb= new HSSFWorkbook();
        Sheet sh= wb.createSheet();
    }
}
