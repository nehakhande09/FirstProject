package firstpkg;

public class Chkchar {
public static void main(String[] args) {
	char c ='*';
	if((c>='a' && c<='z')||(c>='A' && c<='Z'))
		System.out.println("alphabet="+c);
	else
		System.out.println("not alphabet="+c);
}
}
