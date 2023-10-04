class Fibonacci{
	public static void main(String[] args){
	int cantidad= 8;
		fibonacci1(cantidad);
		fibonacci2(cantidad);
	}	

	// Utilizamos el bucle for.
	public static void fibonacci1(int cantidad){
	int v0=0;
	int v1=1;
	System.out.print(v0+ ", ");
	System.out.print(v1+ ", ");
	for(int i=0;i<cantidad;i++) {
		int vn=v1+v0;
		v0=v1;
		v1=vn;
		System.out.print(vn+ ", ");
		}
	}
	
	//Utilizamos el bucle while.
	public static void fibonacci2(int cantidad){
		int v0=0;
		int v1=1;
		int i=0;
		System.out.print(v0+ ", ");
		System.out.print(v1+ ", ");
		while(i++<cantidad){
		int vn=v1+v0;
		v0=v1;
		v1=vn;
		System.out.print(vn+ ", ");
		}
		
	}
	
	public void fibonacci3(){
		int v0=0;
		int v1=1;
		System.out.print(v0+ ", ");
		System.out.print(v1+ ", ");	
		do{
			int vn=v0+v1;
			v0=v1;
			v1=vn;
			System.out.print(vn+ ", ");
		} while (++i<cantidad);
		}
	}

}