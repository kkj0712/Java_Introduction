package day05_object;

public class DrinkTeaMain {
	
	
	public static void main(String[] args) {
		Drink[]arr=new Drink[100];
		//Ŀ��	 	500 3 1500
		//���� 		800 5 4000
		//ī��� 	1500 5 7500
	
		arr[0]=new Drink("Ŀ��", 500, 3); //�迭�ȿ� ��ü �����
		arr[1]=new Drink("����", 800, 5);
		arr[2]=new Drink("ī���", 1500, 5);
		
		//���Ǹž� ���
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) break;
			arr[i].getData();
			sum+=arr[i].getTotal();
		}System.out.println("���Ǹž�: "+sum);
		
		
	}
}
