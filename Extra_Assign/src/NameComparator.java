import java.util.*;  
class NameComparator implements Comparator<FlashCard>{  
	public int compare(FlashCard o1, FlashCard o2){  
return o1.getSubject().compareTo(o2.getSubject());  
}

}  