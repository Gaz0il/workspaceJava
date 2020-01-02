package tpTableau;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testint();
		//testStringv1();
		
		testcalcul();
	}

static void testcalcul(){
int y=10;
int x=5;
int [] res = calcul(y,x);
System.out.println(x+"\t"+y);
System.out.println(res[0]+"\t"+res[1]);

}

static int[] calcul(int a,int b){
int[] tab=new int [2];
tab[0]=a+b;
tab[1]=a-b;
return tab;
}

static void testaffichetableau(){
int [] tab1 ={10,20,30,};
String [] tab2 ={"hjh","gfyfyf","hgugu"};
affichetableau(tab1);
affichetableau(tab2);
}

static void affichetableau(int[] x){
for (int e: x)
	System.out.print(e+"\t");
System.out.println();
}
static void affichetableau(String[] x){
for (String e: x)
	System.out.print(e+"\t");
System.out.println();
}
		
		
		

	static void testStringv1(){
		String [] tab= {"aa","bb",null,"cccc"};
		for (int i=0; i<tab.length;i++)
			if (tab[i]!=null)
				System.out.println(tab[i].toUpperCase());
	}
	static void testint(){
		int [] tab=new int[3];
		tab[0]=10;
		tab[2]=100;
		for (int i=0;i<tab.length;i++)
		System.out.println(tab[i]);
	}

}
