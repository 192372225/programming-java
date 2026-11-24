package q2;
import java.util.*;
public class ListComparison {
 public static void main(String[] args) {
  int n=200000; List<Integer> a=new ArrayList<>(), l=new LinkedList<>(); Deque<Integer> d=new ArrayDeque<>();
  long t=System.nanoTime(); for(int i=0;i<n;i++) a.add(i); long arrayAdd=System.nanoTime()-t;
  t=System.nanoTime(); for(int i=0;i<n;i++) l.add(i); long linkedAdd=System.nanoTime()-t;
  t=System.nanoTime(); for(int i=0;i<n;i++) d.addLast(i); long dequeAdd=System.nanoTime()-t;
  System.out.printf("n=%d ArrayList add=%d ns, LinkedList add=%d ns, ArrayDeque addLast=%d ns%n",n,arrayAdd,linkedAdd,dequeAdd);
 }
}
