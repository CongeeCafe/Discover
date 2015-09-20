package com.discover.discoverapp;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadCSV {

    Context context;
    String data;

    public ReadCSV(Context context) {
        this.context = context;
    }

    public ArrayList<String> parseData(String country) {

        String csvFile = country + ".csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        ArrayList <String> ans = new ArrayList <String>();
        String[] dataline;
        try {

            br = new BufferedReader(new InputStreamReader(context.getAssets().open(csvFile)));
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

            /*
            for(String s:ans) {
                System.out.println(s);
            }
            */


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

        return ans;

    }

}