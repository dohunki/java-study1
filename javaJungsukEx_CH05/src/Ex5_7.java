
public class Ex5_7 {

	public static void main(String[] args) {
		// 1.Ŀ�ǵ� ������ ���� �Է¹ޱ�(���鹮�ڷ� �����ϹǷ� �Էµ� ���� ������ ������ ""�� �����־�� �Ѵ�. 
		//   ���ڵ� ���ڿ��� ó���ȴ�.)
		// C:\JAVA\java-study3\javaJungsukEx_CH05>java MainTest abc 123 "Hello world"
		// 2.��Ŭ�������� Ŀ�ǵ� ���� �Ű����� �Է��ϱ�
		// Run > Run Configurations > (x)= Arguments > Program Arguments�� 
		// abc 123 "Hello world" �� �Է�����
		System.out.println("�Ű������� ���� : "+ args.length);
		for(int i= 0; i < args.length; i++) {
			System.out.println("args["+ i+ "]= \""+ args[i] + " \"");
		}
	}
}
