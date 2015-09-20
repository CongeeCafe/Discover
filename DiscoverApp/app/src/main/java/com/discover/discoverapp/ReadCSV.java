package com.discover.discoverapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSV {

    public static void main(String[] args) {

        ReadCSV obj = new ReadCSV();
        obj.run();

    }

    public void run() {

        String csvFile = "/Users/r754/Desktop/data.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        ArrayList <String> ans = new ArrayList <String>();
        String[] dataline;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            for(int i = 0; i < 5; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }

            }

            for(int i = 0; i < 2; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            for(int i = 0; i < 3; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            for(int i = 0; i < 3; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            for(int i = 0; i < 1; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            //line= br.readLine();
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            for(int i = 0; i < 1; i++) {
                line = br.readLine();
            }
            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            dataline = br.readLine().split(csvSplitBy);
            for(int i = dataline.length-1;i>4;i--) {
                if(!dataline[i].equals("..")) {
                    ans.add(dataline[i]);
                    break;
                }
                if(i == 5) {
                    ans.add("n/a");
                    break;
                }
            }

            for(String s:ans) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}