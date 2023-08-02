public class WrapperClass {
	public static void main(String[] args) {
		byte b=10;  
		short s=20;  
		int i=30;  
		long l=40;  
		float f=50.0F;  
		double d=60.0D;  
		char c='a';  
		boolean b2=true;  
		  
		//Autoboxing: Converting primitives into objects  
		
		Byte byteobj=b;  
		Short shortobj=s;  
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f;  
		Double doubleobj=d;  
		Character charobj=c;  
		Boolean boolobj=b2;  
		  
		//Printing objects  
		
		System.out.println("---Printing object values---\n");  
		System.out.println("Byte object: "+byteobj+"\nShort object: "+shortobj+"\nInteger object: "+intobj+"\nLong object: "+longobj+"\nFloat object: "+floatobj+"\nDouble object: "+doubleobj+"\nCharacter object: "+charobj+"\nBoolean object: "+boolobj);  
				  
		//Unboxing: Converting Objects to Primitives 
				
		byte bytevalue=byteobj;  
		short shortvalue=shortobj;  
		int intvalue=intobj;  
		long longvalue=longobj;  
		float floatvalue=floatobj;  
		double doublevalue=doubleobj;  
		char charvalue=charobj;  
		boolean boolvalue=boolobj;  
		  
		//Printing primitives  
				
		System.out.println("---Printing primitive values---\n");  
		System.out.println("byte value: "+bytevalue+"\nshort value: "+shortvalue+"\nint value: "+intvalue+"\nlong value: "+longvalue+"\nfloat value: "+floatvalue+"\ndouble value: "+doublevalue+"\nchar value: "+charvalue+"\nboolean value: "+boolvalue);  

	}

}
