package Stream;

import java.io.*;
class DirList {
public static void main(String args[]) {
String dirname = "/java";
File f1 = new File(dirname);
FilenameFilter only = new OnlyExt("html");
String s[] = f1.list(only);
for (int i=0; i < s.length; i++) {
System.out.println(s[i]);
}
}
}