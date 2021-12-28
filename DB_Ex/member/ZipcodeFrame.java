package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZipcodeFrame extends Frame implements ActionListener{

	JLabel label;
	JButton searchBtn, selectBtn;
	List list;
	TextField tf;
	JPanel p1,p2;
	DialogBox err1, err2;
	MemberMgr mgr;
	private MemberAWT awt;
	
	public ZipcodeFrame(MemberAWT awt) {
		this.awt= awt;
		setTitle("ZipcodeFrame");
//		setBounds(300,500,400,500);
		setBounds(awt.getX()+awt.getWidth(), awt.getY(), 400, 500);
		mgr = new MemberMgr();
		p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(label = new JLabel ("���̸�:",label.CENTER));
		p1.add(tf = new TextField("�����",15));
		p1.add(searchBtn = new JButton("�˻�"));
		tf.addActionListener(this);
		searchBtn.addActionListener(this); 
		//////////////////////////////////////
		list = new List();
		list.addActionListener(this);
		//////////////////////////////////////
		p2=new JPanel();
		p2.add(selectBtn = new JButton("����"));
		selectBtn.addActionListener(this);
		p2.setBackground(Color.LIGHT_GRAY);
		///////////////////////////////////////
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		add(p1,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		tf.requestFocus();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ���� �ҽ��� �̺�Ʈ�� �߻���Ų ������Ʈ(��ư�� �ǹ�)
		Object obj= e.getSource();
		if(obj== searchBtn||obj==tf) {
			//System.out.println("�˻�");
			if(tf.getText().trim().length()== 0) {
				if(err1== null) {
					err1= new DialogBox(this, "�˸�", "�˻�� �Է��ϼ���.");
				} else { // �ι�°���ʹ� ���� ��ü �׷��� ���(�߿���)
					// �������� ��ġ ����
//					err1.setLocation(this.getX(), this.getY()); // ���� ��ܿ� ��ġ��
					// ��ü�� ���ݸ�ŭ ��� �̵�, ��ư�� ���ݸ�ŭ �·� �̵�
					err1.setLocation(this.getX()+this.getWidth()/2-(err1.getWidth()/2),
							this.getY()+this.getHeight()/2-(err1.getHeight()/2));
					err1.setVisible(true);
				}
			} else { // �˻�� �Է����� ��
				list.removeAll();// ������ �˻���� ����
				Vector<ZipcodeBean> vlist= mgr.zipcodeRead(tf.getText());
				if(vlist.isEmpty()) { // ������� ����
					//stem.out.println("����");
					if(err2== null) {
						err2= new DialogBox(this, "�˸�", "�˻������ �����ϴ�.");
					} else { 
						err2.setLocation(this.getX()+this.getWidth()/2-(err2.getWidth()/2),
								this.getY()+this.getHeight()/2-(err2.getHeight()/2));
						err2.setVisible(true);
					}
					tf.setText(""); // tf �ʱ�ȭ
					tf.requestFocus(); // tf�� ��Ŀ��
				} else { // ������� ����
//					System.out.println(vlist.size()) // Ȯ�ο�
					// �迭 �� Vector �ؿ��� ������ for��
					for(int i= 0; i < vlist.size(); i++) {
						ZipcodeBean bean= vlist.get(i); // Vector�� ����� bean�� ����
						String str= bean.getZipcode()+" ";
						str+= bean.getArea1()+" ";
						str+= bean.getArea2()+" ";
						str+= bean.getArea3();
						list.add(str);
					} // --for
				}				
			}
		} else if(obj==list||obj== selectBtn) {
			//System.out.println("����");
			String adds= list.getSelectedItem();
			awt.tf4.setText(adds);
			list.removeAll();
			dispose();
		}
	}
	
//	public static void main(String[] args) {
//		new ZipcodeFrame();
//	}

}


