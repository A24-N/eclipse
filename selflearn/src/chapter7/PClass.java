package chapter7;

class PClass {
	
	public Integer data = 10;
	
	public void hoge(Integer data) {
		if (data < 0) {
			data = 0;
		}
		System.out.println(data);
	}
}
