package ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendMain {
	//f의 값들을 Arraylist를 만들어서 저장시켜준다.
	//while문을 돌면 값들이 초기화가 되기 때문에 전역변수로 만들어주기 위해 맨 위에다가 쓴다.
	ArrayList<Friend>arr=new ArrayList<Friend>();
	File dir,file;
	@SuppressWarnings("unchecked")
	public FriendMain() throws IOException, ClassNotFoundException {
		dir=new File("src\\ioTest");
		file=new File(dir, "myFriend.txt");
		if(file.exists()) {//파일이 있으면
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			//Object은 반드시 캐스팅을 해줘야함
			arr=(ArrayList<Friend>)ois.readObject(); //ois파일을 읽어서 arr에 저장
		}else {
			file.createNewFile(); //파일 생성
		}
	}
	public void fileUse() throws FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.친구등록 2.친구보기 3.종료(저장)");
			int num=sc.nextInt();
			sc.nextLine(); //엔터를 치면 버려주기
			if(num==1) { //친구등록
				System.out.println("이름>>");
				String name=sc.nextLine();
				System.out.println("생일>>");
				String birth=sc.nextLine();
				System.out.println("주소>>");
				String addr=sc.nextLine();
				System.out.println("전화>>");
				String tel=sc.nextLine();
				//setter가 생성자 역할도 한다.
				//입력한 정보를 담을 때 f라는 객체를 이용한다.
				Friend f=new Friend();
				f.setAddr(addr);
				f.setBirth(birth);
				f.setName(name);
				f.setTel(tel);
				arr.add(f);
			}else if(num==2) { //친구보기
				for(Friend f:arr) {
					System.out.println("이름: "+f.getName());
					System.out.println("생일: "+f.getBirth());
					System.out.println("주소: "+f.getAddr());
					System.out.println("전화: "+f.getTel());
				}
			}else if(num==3) { //저장시켜놓고 종료하기
				//무엇을 저장하는가?
				//friend가 담긴 arraylist를 내보내야함. 객체를 어떻게 내보낼까?
				ObjectOutputStream oos=
						new ObjectOutputStream(new FileOutputStream(file));
				//try-catch대신에 throws를 사용하기. 그 메소드를 호출하는 쪽에도 반드시 throws를 써주기
				//객체를 내보내는 writeObject메소드
				oos.writeObject(arr);
				System.out.println("종료");
				System.exit(0);
			}else { //입력오류
				System.out.println("입력오류");
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FriendMain fm=new FriendMain();
		//생성자가 제일 먼저 실행되므로 ArrayList의 값들을 생성자에 저장시켜줘야한다.
		fm.fileUse();
	}
}
