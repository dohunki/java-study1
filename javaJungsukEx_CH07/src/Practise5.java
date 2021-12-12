/*
 * �Ű������� ������
 * -���� 1.������ �Ű�����  2.�ϳ��� �迭�� ���� ���� ��ü �ٷ��
 * -������ �Ű������� �޼��� ȣ��� �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ�Ÿ���� �ν��Ͻ��� �Ѱ��� �� �ִ�.
 */

class Productt {
	int price;				// ��ǰ�� ����
	int bonusPoint;			// ��ǰ���� �� �����ϴ� ���ʽ�����
}

class 		Tvv extends Productt{}
class Computerr extends Productt{}
class	 Audioo extends Productt{}

class Buyerr {				// ��, ������ ��� ���
	int money= 1000;		// �����ݾ�
	int bonusPoint= 0;		// ���ʽ�����

/*
 * -ProductŬ������ Tv�� ComputerrŬ������ �����̸�, BuyerrŬ������ ��ǰ������
 * -BuyerŬ������ ������ �����ϴ� ����� �޼��带 �߰��ϸ� ������ ����� �ʿ��ϹǷ� �Ű�������
 *  ������ ��ǰ�� �Ѱܹ޾ƾ� �Ѵ�. Tv�� �� �� �ֵ��� �Ű������� TvŸ������ �ϸ�
 */
	void buy(Tvv t) {
		// Buyerr�� ���� ������ ��ǰ�� ���ݸ�ŭ ����.
		money= money- t.price;
		
		// Buyerr�� ���ʽ������� ��ǰ�� ���ʽ������� ���Ѵ�.
		bonusPoint= bonusPoint+ t.bonusPoint;
	}
/*
 * -buy(Tvv t)�� ��ǰ�� �����ϸ� ��ǰ�� ������ ����� ���� ������ ��ǰ�� ������ ����, ���ʽ�
 *  ������ �߰��ϴ� �۾��� �ϵ��� �ۼ��Ǿ���. �׷õ�, buy(Tvv t)�δ� Tv�ۿ� �� �� ���⿡
 *  �ٸ� ��ǰ�鵵 ������ �� �ִ� �޼��尡 �߰��� �ʿ��ϴ�.
 */
	
	void buy(Computerr c) {  // �����ε�
		money= money- c.price;
		bonusPoint= bonusPoint+ c.bonusPoint;
	}
	
	void buy(Audioo a) {  // �����ε�
		money= money- a.price;
		bonusPoint= bonusPoint+ a.bonusPoint;
	}
	
/*
 * �̷��� �Ǹ�, ��ǰ�� ������ �þ ������ BuyerŬ�������� ���ο� buy�޼��带 �߰��ؾ� �Ѵ�.
 * �׷���, �޼����� �Ű������� �������� �����ϸ� �Ʒ��� ���� �ϳ��� �޼���� ������ ó���� �� �ִ�.
 */
	
	void buy(Productt p) {
		money= money- p.price;
		bonusPoint= bonusPoint+ p.bonusPoint;
	}
	
/*
 * -�Ű������� ProductŸ���� ����������� ����, �޼����� �Ű������� ProductŬ������ �ڼ�Ÿ����
 *  ���������̸� ��� ���̳� �޾Ƶ��� �� �ִٴ� ���̴�.
 * -ProductŬ������ price�� bonusPoint�� ����Ǿ� �ֱ� ������ �������� p�� �ν��Ͻ���
 */
	
}
public class Practise5 {
	public static void main(String[] args) {
		Buyerr b= new Buyerr();
		
		Tvv t= new Tvv();
		Computerr c= new Computerr();
		Audioo a= new Audioo();
		b.buy(t);
		b.buy(c);
		b.buy(a);
		
		Productt p1= new Tvv();
		Productt p2= new Computerr();
		Productt p3= new Audioo();
		b.buy(p1);
		b.buy(p2);
		b.buy(p3);
	}
}
