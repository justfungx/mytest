package mytest;

public class java25 {

	public static void main(String[] args) {
		TwId id = new TwId(true,4);
		System.out.println(id.getId());
		if (TwId.isRight(id.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}

}