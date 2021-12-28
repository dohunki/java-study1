package member;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {
	
	private DBConnectionMgr pool;
	
	public MemberMgr() {
		try {
			pool= DBConnectionMgr.getInstance();
			//Connection con= pool.getConnection();
			//System.out.println("����"); //Ȯ�ο� 
		} catch (Exception e) {
			System.err.println("����");
			e.printStackTrace();
		}
	} // MemberMgr
	
	// �����ȣ �˻�, ���׸� : Vector���� �����ϴ� Ÿ���� �����ϴ� ��
	public Vector<ZipcodeBean> zipcodeRead(String area3) {
		// DB������ �ʿ��� ���� ����
		// DB������ ������ �ִ�.
		// java.sql ��Ű�� Ŭ����
		Connection con= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql= null;
		Vector<ZipcodeBean> vlist= new Vector<ZipcodeBean>();
		try {
			// DB ���� ��ü 
			// DBConnectionMgr ���� ->  Connection �������
			// �ʿ��� ��� �����ְ� �ݳ��޴� ��� : Ǯ�����
			con= pool.getConnection();  // ������(pool ���)
			sql= "SELECT * FROM tblzipcode WHERE area3 LIKE ?"; // LIKE '%�������%'
			// sql���� �Ű������� patmt ��ü�� ����
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, "%"+area3+"%"); // 1dl sql���� ? ������ ����.
			rs= pstmt.executeQuery(); // ���� sql�� ����
			
			while(rs.next()) {
				ZipcodeBean bean= new ZipcodeBean();
				bean.setZipcode(rs.getString("zipcode"));
				bean.setZipcode(rs.getString("area1"));
				bean.setZipcode(rs.getString("area2"));
				bean.setZipcode(rs.getString("area3").trim());
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	// ����
	public boolean insert(MemberBean bean) {
		Connection con= null;
		PreparedStatement pstmt= null;
		String sql= null;
		boolean flag= false;
		try {
			con= pool.getConnection(); // pool���� Connection ������.
			sql= "insert tblMember(name, phone, team, address)values(?, ?, ?, ?)";
			pstmt= con.prepareStatement(sql);
			//? ����
			pstmt.setString(1, bean.getName()); // ù��° ?�� 'ȫ�浿' ����
			pstmt.setString(2, bean.getPhone()); // �ι�° ?�� '' ����
			pstmt.setString(3, bean.getTeam()); // ����° ?�� '' ����
			pstmt.setString(4, bean.getAddress()); // �׹�° ?�� '' ����
			// ����
			int cnt= pstmt.executeUpdate();
			if(cnt== 1) flag= true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	// ����Ʈ
	public Vector<MemberBean> list() {
		Connection con= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql= null;
		Vector<MemberBean> vlist= new Vector<MemberBean>();
		try {
			con= pool.getConnection();
			sql= "select * from tblMember";
			pstmt= con.prepareStatement(sql);
			rs= pstmt.executeQuery(); // ����
			while(rs.next()) {
				MemberBean bean=
						new MemberBean(rs.getInt("id"), 
						rs.getString("name"), rs.getString("phone"),
						rs.getString("team"), rs.getString("address"));
				vlist.addElement(bean);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	// �� ���� ȸ������
	public MemberBean select(int id) {
		Connection con= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql= null;
		MemberBean bean= new MemberBean();
		try {
			con= pool.getConnection();
			sql= "select * from tblMember where id= ?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, id); // id= 3;
			rs= pstmt.executeQuery(); // ����
			if(rs.next()) {
				bean.setId(id);
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setTeam(rs.getString("team"));
				bean.setAddress(rs.getString("address"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}
	
	// ����
	public boolean update(MemberBean bean) {
		Connection con= null;
		PreparedStatement pstmt= null;
		String sql= null;
		boolean flag= false;
		try {
			con= pool.getConnection(); // pool���� Connection ������.
			sql= "update tblMember set name=?, phone=?, team=?, address=? where id=?";
			pstmt= con.prepareStatement(sql);
			pstmt.setString(1, bean.getName()); // ù��° ?�� 'ȫ�浿' ����
			pstmt.setString(2, bean.getPhone()); 
			pstmt.setString(3, bean.getTeam()); 
			pstmt.setString(4, bean.getAddress());
			pstmt.setInt(5, bean.getId());
			int cnt= pstmt.executeUpdate();
			if(cnt== 1) flag= true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// ����
	public boolean delete(int id) {
		Connection con= null;
		PreparedStatement pstmt= null;
		String sql= null;
		boolean flag= false;
		try {
			con= pool.getConnection(); 
			sql= "delete from tblMember where id= ?";
			pstmt= con.prepareStatement(sql);
			pstmt.setInt(1, id);
			int cnt= pstmt.executeUpdate();
			if(cnt== 1) flag= true;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	// team list
	public Vector<String> listTeam() {
		Connection con= null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql= null;
		Vector<String> vlist= new Vector<String>();
		try {
			con= pool.getConnection();
			sql= "select distinct team from tblMember";
			pstmt= con.prepareStatement(sql);
			rs= pstmt.executeQuery(); // ���� sql�� ����
			while(rs.next()) {
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}
	
	public static void main(String[] args) {
		MemberMgr mgr= new MemberMgr();
		MemberBean bean= new MemberBean(0, "��濵", "010-8888-9999", "���", "�λ��");
		System.out.println(mgr.insert(bean));
	}
	
	
	
	
//	public static void main(String[] args) {
//		MemberMgr mgr= new MemberMgr();
//		mgr.zipcodeRead("�������");
//	}
}
