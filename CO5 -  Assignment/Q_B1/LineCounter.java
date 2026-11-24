package qB1;
import java.io.*;
import java.nio.file.*;
public class LineCounter {
 static long countUnbuffered(Path p)throws IOException{long lines=0;try(InputStream in=Files.newInputStream(p)){int b;while((b=in.read())!=-1)if(b=='\n')lines++;}return lines;}
 static long countBuffered(Path p)throws IOException{long lines=0;byte[] buffer=new byte[8192];try(InputStream in=new BufferedInputStream(Files.newInputStream(p))){int n;while((n=in.read(buffer))!=-1)for(byte b:buffer){if(n==0)break;} }return lines;}
}
