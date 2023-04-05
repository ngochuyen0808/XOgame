import java.util.Scanner;
public class main {
	static int[][]a=new int[3][3];
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				a[i][j] = 0;
			}
		}
		disp();
		
		int count=0;
		do {
			System.out.print("たて=");
			int tate = scanner.nextInt();
			System.out.print("よこ=");
			int yoko = scanner.nextInt();
			a[tate][yoko]=count%2+1;
			if(a[tate][yoko]!=0) {
				System.out.println("もう一度入力してください");
			}
			disp();
			count++;
		}while(count<10);
	}
	static void disp(){
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) {
				if(a[i][j] == 0) {
					System.out.print("□");
				}else if(a[i][j] == 1) {
					System.out.print("×");
				}else if(a[i][j] == 2) {
					System.out.print("○");
				}
			}System.out.println("");
		}
	}
}
