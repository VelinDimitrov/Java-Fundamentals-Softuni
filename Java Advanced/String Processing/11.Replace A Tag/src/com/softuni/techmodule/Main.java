package com.softuni.techmodule;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 String regex="(<a).*(>)(\\s*).*?(<\\/a>)";

	 String html=input.nextLine();
	 StringBuilder allInput=new StringBuilder();
        while (!html.equals("END")) {
            html+="\r\n";
            allInput.append(html);
            html=input.nextLine();
        }

        html=allInput.toString();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(html);
        if (matcher.find()) {
            String replacement=matcher.group(0);
            replacement=replacement.replaceFirst("<a","[URL");
            replacement=replacement.replaceFirst(">","]");
            replacement=replacement.replaceFirst("</a>","[/URL]");
            html=html.replace(matcher.group(0),replacement);

        }

        System.out.println(html);
    }
}
