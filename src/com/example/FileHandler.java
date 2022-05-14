package com.example;


import java.io.IOException;
import java.util.*;
import java.io.File;
public class FileHandler
{

    public FileHandler()
    {
    }
    public  void createFile(String FileName)
    {
        try {
            File file = new File(FileName);
            if (file.createNewFile()) {
                System.out.println("File created Successfully : "+ file.getName()+"....\n");
            }
            else {
                System.out.println("File "+ FileName +" already exists....");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred while creating the File "+ FileName +"....\n");
            e.printStackTrace();
        }
    }

    public  void deleteFile(String FileName)
    {
        try {
            File file = new File(FileName);
            if (file.delete()) {
                System.out.println("File deleted Successfully : "+ file.getName()+"....\n");
            }
            else {
                System.out.println("File "+FileName+" Not Found...");
            }
        }
        catch (Exception e) {
            System.out.println("An error has occurred while creating the File.");
            e.printStackTrace();
        }
    }
    public String[] getSortedFiles()
    {
        String workingDirectory=System.getProperty("user.dir");
        File fobj = new File(workingDirectory);
        String files[]=fobj.list();
        Arrays.sort(files);
        return files;
    }

    public void searchFile(String Filename)
    {
        String[] files=getSortedFiles();
        if(files.length>0)
        {
            int index=Arrays.binarySearch(files,Filename);
            if(index>=0)
            {
                System.out.println("File "+Filename+" Found in the root Directory...");
                return;
            }
        }
        System.out.println("File "+Filename+" Not Found in the root Directory...");

    }
    public void listFiles()
    {
        String[] files=getSortedFiles();
        for(String file: files){
            System.out.println(file+"\n");
        }
    }

}
