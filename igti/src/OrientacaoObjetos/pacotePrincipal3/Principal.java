package pacotePrincipal3;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setnportas(4);
		c1.setMarca("Willys");
		c1.setModelo("Jipe 4x4");
		c1.setnCavalos(70);
		System.out.printf("Marca: %s.\nModelo: %s.\n" + 
				"N�mero de Portas: %d.\nQuantidade de cavalos: %d.\n",
				c1.getMarca(), c1.getModelo(), c1.getnportas(), c1.getnCavalos());
	}

}
